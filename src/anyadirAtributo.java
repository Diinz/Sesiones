

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/anyadir")
public class anyadirAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public anyadirAtributo() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recuperamos los dos atributos que nos manda el formulario.
		String atributo = request.getParameter("atributo");
		String valor = request.getParameter("valor");
		
		//Recuperamos la sesión del usuario.
		HttpSession sesion = request.getSession();
		
		// Añadimos a la sesión la información del formulario.
		sesion.setAttribute(atributo, valor);
		
		// Salida del servlet para el usuario.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Sesiones</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Sesión de usuario</h1>");
		out.println("<p>CONTENIDO</p>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
