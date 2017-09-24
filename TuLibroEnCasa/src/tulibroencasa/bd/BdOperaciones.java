/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tulibroencasa.bd;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import tulibroencasa.beans.*;

/**
 * @author Administrador
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class BdOperaciones extends BdBase {

	/**
	 * 
	 */
	public BdOperaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select usuario,password from cliente where" + " usuario='" + user
					+ "' and password='" + password + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			correcto = rs.next();
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean insertarCliente(Cliente cliente) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into cliente(dni,nombre,apellido1,apellido2,direccion,fecha_nacimiento,email,usuario,password) "
					+ "values ('" + cliente.getDni() + "','" + cliente.getNombre() + "','" + cliente.getApellido1()
					+ "','" + cliente.getApellido2() + "','" + cliente.getDireccion() + "','"
					+ new SimpleDateFormat("yyyy-MM-dd").format(cliente.getFechaNacimiento()) + "','"
					+ cliente.getEmail() + "','" + cliente.getUsuario() + "','" + cliente.getClave() + "')";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de cliente no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public List<Libro> getLibros() {

		List<Libro> libros = new ArrayList<Libro>();
		try {
			String sentenciaSql = "SELECT libro.isbn,libro.titulo,libro.precio,autor.nom_autor,categoria.nom_categoria,editorial.nom_editorial "
                                + "FROM libro " + "INNER JOIN autor ON libro.cod_autor = autor.cod_autor "
                                + "INNER JOIN categoria ON libro.cod_categoria = categoria.cod_categoria "
                                + "INNER JOIN editorial ON libro.cod_editorial = editorial.cod_editorial "
                                + "ORDER BY libro.titulo";

			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIsbn(rs.getString("libro.isbn"));
				libro.setTitulo(rs.getString("libro.titulo"));
				libro.setPrecio(rs.getDouble("libro.precio"));
				libro.setAutor(rs.getString("autor.nom_autor"));
				libro.setCategoria(rs.getString("categoria.nom_categoria"));
				libro.setEditorial(rs.getString("editorial.nom_editorial"));
				libros.add(libro);
				hayMas = rs.next();
				rs.close();
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
		}
		return libros;
	}
	
	public List<Libro> getLibrosTitulo(String titulo) {

		List<Libro> libros = new ArrayList<Libro>();
		try {
			String sentenciaSql = "SELECT libro.isbn,libro.titulo,libro.precio,autor.nom_autor,categoria.nom_categoria,editorial.nom_editorial "
					            + "FROM libro " + "INNER JOIN autor ON libro.cod_autor = autor.cod_autor "
                                + "INNER JOIN categoria ON libro.cod_categoria = categoria.cod_categoria "
                                + "INNER JOIN editorial ON libro.cod_editorial = editorial.cod_editorial "
                                + "WHERE libro.titulo = '" + titulo + "' " + "ORDER BY libro.titulo";

			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIsbn(rs.getString("libro.isbn"));
				libro.setTitulo(rs.getString("libro.titulo"));
				libro.setPrecio(rs.getDouble("libro.precio"));
				libro.setAutor(rs.getString("autor.nom_autor"));
				libro.setCategoria(rs.getString("categoria.nom_categoria"));
				libro.setEditorial(rs.getString("editorial.nom_editorial"));
				libros.add(libro);
				hayMas = rs.next();
				rs.close();
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
		}
		return libros;
	}
	
	public List<Libro> getLibrosAutor(String autor) {

		List<Libro> libros = new ArrayList<Libro>();
		try {
			String sentenciaSql = "SELECT libro.isbn,libro.titulo,libro.precio,autor.nom_autor,categoria.nom_categoria,editorial.nom_editorial "
					            + "FROM libro " + "INNER JOIN autor ON libro.cod_autor = autor.cod_autor "
                                + "INNER JOIN categoria ON libro.cod_categoria = categoria.cod_categoria "
                                + "INNER JOIN editorial ON libro.cod_editorial = editorial.cod_editorial "
                                + "WHERE autor.nom_autor = '" + autor + "' " + "ORDER BY libro.titulo";

			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIsbn(rs.getString("libro.isbn"));
				libro.setTitulo(rs.getString("libro.titulo"));
				libro.setPrecio(rs.getDouble("libro.precio"));
				libro.setAutor(rs.getString("autor.nom_autor"));
				libro.setCategoria(rs.getString("categoria.nom_categoria"));
				libro.setEditorial(rs.getString("editorial.nom_editorial"));
				libros.add(libro);
				hayMas = rs.next();
				rs.close();
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
		}
		return libros;
	}
	public List<Libro> getLibrosCategoria(String categoria) {

		List<Libro> libros = new ArrayList<Libro>();
		try {
			String sentenciaSql = "SELECT libro.isbn,libro.titulo,libro.precio,autor.nom_autor,categoria.nom_categoria,editorial.nom_editorial "
					            + "FROM libro " + "INNER JOIN autor ON libro.cod_autor = autor.cod_autor "
                                + "INNER JOIN categoria ON libro.cod_categoria = categoria.cod_categoria "
                                + "INNER JOIN editorial ON libro.cod_editorial = editorial.cod_editorial "
                                + "WHERE categoria.nom_categoria = '" + categoria + "' " + "ORDER BY libro.titulo";

			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIsbn(rs.getString("libro.isbn"));
				libro.setTitulo(rs.getString("libro.titulo"));
				libro.setPrecio(rs.getDouble("libro.precio"));
				libro.setAutor(rs.getString("autor.nom_autor"));
				libro.setCategoria(rs.getString("categoria.nom_categoria"));
				libro.setEditorial(rs.getString("editorial.nom_editorial"));
				libros.add(libro);
				hayMas = rs.next();
				rs.close();
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
		}
		return libros;
	}
}
