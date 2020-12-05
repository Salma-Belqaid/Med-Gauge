package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoFactory;
import dao.IHospitalDAO;
import model.Lit;
import model.Sale;

/**
 * Servlet implementation class LitP
 */
@WebServlet("/LitP")
public class LitP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IHospitalDAO hospitalDao;

	public void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.hospitalDao = daoFactory.getHospitalDAO();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LitP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/vues/litView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num_sale=Integer.parseInt(request.getParameter("sale"));
		List<Lit> lits=this.hospitalDao.getLitsBySale(num_sale);
		request.setAttribute("lits", lits);
		
		doGet(request, response);
	}

}
