package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;
	
	private static final CustomerService instance = new CustomerService(); 
	
	private CustomerService() {
		customers = new HashMap<String,Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	
	
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer);
	}
	
	public Customer findCustomer(String id){
		if(id != null && customers.containsKey(id)){
			return (customers.get(id.toLowerCase()));
		}
		else if(customers.containsKey(id) == false)
			return null;
		else 
			return null;
	}
	
	public boolean comparePasswd(Customer customer,String passwd){
		if(customer == null)
			return false;
		else if(customer.getPassword().toLowerCase().equals(passwd.toLowerCase())){
			return true;
		}
		else{
			return false;
		}
	}
}
