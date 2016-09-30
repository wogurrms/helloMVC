package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerID = request.getParameter("id");
		String passwd = request.getParameter("password");
		
		//perform businessLogic, Return a bean as a result.
		
		//service ��ü ����
//		CustomerService service = new CustomerService();
		
		//service�� �̿��Ͽ� �Ķ���ͷ� Customer��ü�� ã�Ƽ� ����	����.
		Customer customer = CustomerService.getInstance().findCustomer(customerID);
		
		//customer ��ü�� "customer"��� ���̵� �ο�
		request.setAttribute("customer", customer);
	
		//We can iterate over lists using forEach in JSTL
		
		List<Customer> customers = new ArrayList<>();
		request.setAttribute("customerList",customers);
		
		
		
		String page = null;
		
		
		if(CustomerService.getInstance().comparePasswd(customer, passwd)){
			page = "/view/loginSuccess.jsp";
			request.setAttribute("customer", customer);
		}
		else if(customer == null){
			page = "/view/loginFail.jsp";
			request.setAttribute("id", customerID);	
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
			
		
	}

}
