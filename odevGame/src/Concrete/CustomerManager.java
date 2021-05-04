package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public  class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;

	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkıfRealPerson(customer)) {
		System.out.println(customer.getFirstName() + "Müşteri eklendi. ");
	
		}	
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + "Müşteri güncellendi");
		
	}

	@Override
	public void delete(Customer customer) {
       System.out.println(customer.getFirstName() + "Müşteri silindi");		
	}


	
	}


	
		
	
	

