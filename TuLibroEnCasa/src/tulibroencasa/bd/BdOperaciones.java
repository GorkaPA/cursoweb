/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tulibroencasa.bd;

import java.sql.*;
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
}
