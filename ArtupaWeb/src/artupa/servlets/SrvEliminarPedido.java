/*
 * Created on 24-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package artupa.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import artupa.bd.BdOperaciones;

/**
 * @author Administrador
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SrvEliminarPedido extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{				
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			int numPedido = Integer.parseInt(request.getParameter("numPedido"));
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			bdOperaciones.eliminarPedido(numPedido);
			bdOperaciones.cerrarConexion();
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/SrvPedidos");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}

}
