package tulibroencasa.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SrvBuscarLibros
 */
public class SrvBuscarLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletContext ct = getServletContext();
		RequestDispatcher rd = ct.getRequestDispatcher("/buscarLibros.jsp");
		rd.forward(request, response);
	}
}
