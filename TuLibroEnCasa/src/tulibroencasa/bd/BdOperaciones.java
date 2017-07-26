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

import tulibroencasa.beans.Cliente;
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
					+ "values ('"
					+ cliente.getDni() + "','" 
					+ cliente.getNombre() + "','" 
					+ cliente.getApellido1() + "','"
					+ cliente.getApellido2() + "','"
					+ cliente.getDireccion() + "','" 
					+ new SimpleDateFormat("yyyy-MM-dd").format(cliente.getFechaNacimiento()) + "','" 
					+ cliente.getEmail() + "','"
					+ cliente.getUsuario() + "','" 
					+ cliente.getClave() + "')";
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
	public List<Libro> getLibrosTitulo(String titulo) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select * from libro where" + " titulo='" + titulo
					+ "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				clientes.add(cliente);
				hayMas = rs.next();
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
}
