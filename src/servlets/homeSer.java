package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homeSer
 */
@WebServlet("/homeSer")
public class homeSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//public static final String VUE= "/WEB-INF/Vueprofession.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<html><body><h1>MedGauge-Gestion des personnels</h1>");
		out.print("<a href=\"AddProfession.jsp\">Ajouter une profession</a></br></br>");
		out.print("<a href=\"Approfession.jsp\">Modifier une profession</a></br></br>");
		out.print("<a href=\"DelProfession.jsp\">Supprimer une profession</a></br></br>");
		
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
