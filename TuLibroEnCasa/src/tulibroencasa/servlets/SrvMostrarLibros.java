package tulibroencasa.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import tulibroencasa.bd.BdOperaciones;
import tulibroencasa.beans.Libro;

public class SrvMostrarLibros extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{				
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			
			List<Libro> libros = bdOperaciones.getLibrosTitulo();
		
			bdOperaciones.cerrarConexion();
			request.setAttribute("libros",libros);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/clientes.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}
}
