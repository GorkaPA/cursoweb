package tulibroencasa.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

import tulibroencasa.bd.BdOperaciones;
import tulibroencasa.beans.Cliente;

public class SrvGuardarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{				
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			
			String nombre = request.getParameter("nombre");
			String apellido1 = request.getParameter("apellido1");
			String apellido2 = request.getParameter("apellido2");
			String dni = request.getParameter("DNI");
			String direccion = request.getParameter("direccion");
			// Takes the date from the form in String and converts it java.util.date which is how the buisness object is written
	        Date fechaNacimiento = null;
			try {
				fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaNacimiento"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        String email = request.getParameter("email");
	        String usuario = request.getParameter("usuario");
	        String clave = request.getParameter("clave");
			Cliente cliente = new Cliente(nombre,apellido1,apellido2,dni,direccion,fechaNacimiento,email,usuario,clave);
			
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			bdOperaciones.insertarCliente(cliente);
			bdOperaciones.cerrarConexion();
			ServletContext ServletContext = getServletContext();
			RequestDispatcher requestDispatcher = ServletContext.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request,response);
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}

}

