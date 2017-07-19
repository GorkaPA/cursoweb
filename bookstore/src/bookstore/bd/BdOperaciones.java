/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package bookstore.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bookstore.beans.*;

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
			String sentenciaSql = "select usuario,password from usuarios where" + " usuario='" + user
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

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		try {
			String sentenciaSql = "select iduser, user, password, name, secondname, id, address, birthdate, email from users";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			User user = null;
			while (hayMas) {
				user = new User();
				user.setId(rs.getString("iduser"));
				user.setUser(rs.getString("user"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setSecondName(rs.getString("secondname"));
				user.setId(rs.getString("id"));
				user.setAddress(rs.getString("address"));
				user.setBirthdate(rs.getDate("birthdate"));
                user.setEmail(rs.getString("email"));
				users.add(user);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de users no efectuada correctamente");
		}
		return users;
	}

	public User getUser(String dni) {
		User user = null;
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad,direccion,codPostal,localidad,telefono from users "
					+ "where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				user = new User();
				user.setId(rs.getString("iduser"));
				user.setUser(rs.getString("user"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setSecondName(rs.getString("secondname"));
				user.setId(rs.getString("id"));
				user.setAddress(rs.getString("address"));
				user.setBirthdate(rs.getDate("birthdate"));
                user.setEmail(rs.getString("email"));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de users no efectuada correctamente");
		}
		return user;
	}

	public boolean deleteUser(String id) {
		boolean correcto = true;
		try {
			String sentenciaSql = "delete from users where id='" + id + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de user no efectuado correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean insertUser(User user) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into user(user, password, name, secondname, id, address, birthdate, email) "
					+ "values ('"
					+ user.getUser() + "','" 
					+ user.getPassword() + "','" 
					+ user.getName() + "','"
					+ user.getSecondName() + "','" 
					+ user.getId() + "','" 
					+ user.getAddress() + "','"
					+ user.getBirthdate() + "','" 
					+ user.getEmail() + "')";
			
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de user no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean modificarUser(User user) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update users set " + "nombre='" + user.getNombre() + "', " + "apellido='"
					+ user.getApellido() + "', " + "edad=" + user.getEdad() + ", " + "direccion='"
					+ user.getDireccion() + "', " + "codPostal=" + user.getCodPostal() + ", " + "localidad='"
					+ user.getLocalidad() + "', " + "telefono=" + user.getTelefono() + " where dni = '"
					+ user.getDni() + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de user no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
	


}
