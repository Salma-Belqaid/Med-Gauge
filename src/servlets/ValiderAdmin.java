package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

import modules.Actionsimplem;
import modules.action;
import modules.administrateur;
import modules.profession;

/**
 * Servlet implementation class ValiderAdmin
 */
@WebServlet("/ValiderAdmin")
public class ValiderAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private action op;
	public void init() throws ServletException {
		op = new Actionsimplem();
	}
	public ValiderAdmin()
	{}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	// response.getWriter().append("served at: ").append(request.getContextPath());
	 }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		//out.print("<a href=\"authe.jsp\">authentifier</a></br></br>");
		String login=request.getParameter("user");
		String pass=request.getParameter("pass");
		administrateur p=new administrateur(login,pass);
		boolean a=op.authentifier(p);
		if(a==true)
		{
response.sendRedirect("homeSer");
		}
		else
		out.print("<span>votre mot de passe est incorrect </span><a href=\"authe.jsp\">authentifier</a></br></br>");
	}

}
