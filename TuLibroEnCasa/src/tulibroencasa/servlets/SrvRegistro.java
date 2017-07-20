package tulibroencasa.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tulibroencasa.bd.BdOperaciones;

/**
 * Servlet implementation class SrvBuscarLibros
 */
public class SrvRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
			response.sendRedirect("../registro.jsp");
	}
}