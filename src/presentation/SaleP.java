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
import model.Etage;
import model.Sale;

/**
 * Servlet implementation class SaleP
 */
@WebServlet("/SaleP")
public class SaleP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IHospitalDAO hospitalDao;

	public void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.hospitalDao = daoFactory.getHospitalDAO();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaleP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/vues/saleView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num_E=Integer.parseInt(request.getParameter("etage"));
		List<Sale> sales=this.hospitalDao.getSalesByEtage(num_E);
		request.setAttribute("sales", sales);
		
		doGet(request, response);
	
		
	}

}
