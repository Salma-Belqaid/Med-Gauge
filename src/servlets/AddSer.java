package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modules.action;
import modules.profession;
import modules.Actionsimplem;
import modules.administrateur;

/**
 * Servlet implementation class AddSer
 */
@WebServlet("/AddSer")
public class AddSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//public static final String VUE        = "/WEB-INF/Vueprofession.jsp";
	private action op;
	public void init() throws ServletException {
		op = new Actionsimplem();
	}
    /**
     * Default constructor. 
     */
    public AddSer() {
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		out.println("<HTML>\n<BODY>\n" + "<H1>Les informations a ajouter</H1>\n" + "<UL>\n" + "\n" + " <LI>Nom: " + request.getParameter("nom_p") + "\n" + " <LI>Prenom: " + request.getParameter("prenom_p") + " <LI>Type: " + request.getParameter("type_pr")+ "\n" + " <LI>Password: " + request.getParameter("passwd") + "\n" + "</BODY></HTML>"); 
		out.print("<a href=\"AddProfession.jsp\">Ajouter un autre</a></br></br>");
		String nom=request.getParameter("nom_p");
		String prenom=request.getParameter("prenom_p");
		String categorie=request.getParameter("type_pr");
		String pass =request.getParameter("passwd") ;
		profession p=new profession(pass,nom,prenom,categorie);
		op.addprofession(p);
	
		//request.getRequestDispatcher("/WEB-INF/AddProfession.").forward(request, response);
	}}
	//request.getRequestDispatcher("/WEB-INF/AddProfession.html").forward(request, response);

