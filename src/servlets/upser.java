package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modules.Actionsimplem;
import modules.action;
import modules.profession;

/**
 * Servlet implementation class upser
 */
@WebServlet("/upser")
public class upser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private action op;
	public void init() throws ServletException {
		op = new Actionsimplem();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("<HTML>\n<BODY>\n" + "<H1>Les informations a Mettre a jour</H1>\n" + "<UL>\n" + "\n" + " <LI>Nom: " + request.getParameter("nom_p") + "\n" + " <LI>Prenom: " + request.getParameter("prenom_p") + " <LI>Type: " + request.getParameter("type_pr")+ "\n" + " <LI>Password: " + request.getParameter("passwd") + "\n" + "</BODY></HTML>"); 
		out.print("<a href=\"Approfession.jsp\">Mettre a jour un autre</a></br></br>");
		
		String nom=request.getParameter("nom_p");
		String prenom=request.getParameter("prenom_p");
		String categorie=request.getParameter("type_pr");
		String pass =request.getParameter("passwd") ;
		profession p=new profession(pass,nom,prenom,categorie);
		op.updateprofession(p);
	
	}

}
