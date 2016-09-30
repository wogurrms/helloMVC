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
		
		//service 객체 생성
//		CustomerService service = new CustomerService();
		
		//service를 이용하여 파라미터로 Customer객체를 찾아서 리턴	받음.
		Customer customer = CustomerService.getInstance().findCustomer(customerID);
		
		//customer 객체에 "customer"라는 아이디 부여
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
