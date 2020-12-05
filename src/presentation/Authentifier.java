package presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoFactory;
import dao.HospitalDao;
import dao.IHospitalDAO;

/**
 * Servlet implementation class Authentifier
 */
@WebServlet("/Authentifier")
public class Authentifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IHospitalDAO hospitalDao;

	public void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.hospitalDao = daoFactory.getHospitalDAO();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authentifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String passwd = request.getParameter("passwd");
		if (login.isEmpty() || passwd.isEmpty()) {
			response.sendRedirect("login?message=vous devez remplir le login et la password!");
		} else {
			if (this.hospitalDao.login(login, passwd)!=null) {
				
				response.sendRedirect("etage");
			} else {
				response.sendRedirect("login?message=authentification invalide");
			}
		}
	}

}
