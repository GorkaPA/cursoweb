/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package artupa.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import artupa.beans.*;

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

	public List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad from clientes";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Cliente cliente = null;
			while (hayMas) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				clientes.add(cliente);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return clientes;
	}

	public Cliente getCliente(String dni) {
		Cliente cliente = null;
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad,direccion,codPostal,localidad,telefono from clientes "
					+ "where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				cliente.setDireccion(rs.getString(5));
				cliente.setCodPostal(rs.getInt(6));
				cliente.setLocalidad(rs.getString(7));
				cliente.setTelefono(rs.getInt(8));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return cliente;
	}

	public boolean eliminarCliente(String dni) {
		boolean correcto = true;
		try {
			String sentenciaSql = "delete from clientes where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de cliente no efectuado correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean insertarCliente(Cliente cliente) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into clientes(dni,nombre,apellido,edad,direccion,codPostal,localidad,telefono) values ('"
					+ cliente.getDni() + "','" + cliente.getNombre() + "','" + cliente.getApellido() + "',"
					+ cliente.getEdad() + ",'" + cliente.getDireccion() + "'," + cliente.getCodPostal() + ",'"
					+ cliente.getLocalidad() + "'," + cliente.getTelefono() + ")";
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

	public boolean modificarCliente(Cliente cliente) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update clientes set " + "nombre='" + cliente.getNombre() + "', " + "apellido='"
					+ cliente.getApellido() + "', " + "edad=" + cliente.getEdad() + ", " + "direccion='"
					+ cliente.getDireccion() + "', " + "codPostal=" + cliente.getCodPostal() + ", " + "localidad='"
					+ cliente.getLocalidad() + "', " + "telefono=" + cliente.getTelefono() + " where dni = '"
					+ cliente.getDni() + "'";
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
	public List<Pedido> getPedidos() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		try {
			String sentenciaSql = "select dni,numpedido,detallepedido from pedidos";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Pedido pedido = null;
			while (hayMas) {
				pedido = new Pedido();
				pedido.setDni(rs.getString(1));
				pedido.setNumPedido(rs.getInt(2));
				pedido.setDetallePedido(rs.getString(3));
				pedidos.add(pedido);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de pedidos no efectuada correctamente");
		}
		return pedidos;
	}

	public Pedido getPedido(int numPedido) {
		Pedido pedido = null;
		try {
			String sentenciaSql = "select dni,numpedido,detallepedido from pedidos "
					+ "where numpedido=" + numPedido;
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				pedido = new Pedido();
				pedido.setDni(rs.getString(1));
				pedido.setNumPedido(rs.getInt(2));
				pedido.setDetallePedido(rs.getString(3));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de pedidos no efectuada correctamente");
		}
		return pedido;
	}

	public boolean eliminarPedido(int numPedido) {
		boolean correcto = true;
		try {
			String sentenciaSql = "delete from pedidos where numpedido=" + numPedido;
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de pedido no efectuado correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean insertarPedido(Pedido pedido) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into pedidos(dni,numpedido,detallepedido) "
					+ "values ('"
					+ pedido.getDni() + "'," 
					+ pedido.getNumPedido() + ",'" 
					+ pedido.getDetallePedido() + "'"
					+ ")";
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

	public boolean modificarPedido(Pedido pedido) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update pedidos set " 
					+ "detallepedido ='" + pedido.getDetallePedido() + "' "  
					+ " where numPedido = " + pedido.getNumPedido();
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
}
