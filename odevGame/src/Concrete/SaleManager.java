package Concrete;

import Abstract.OrderService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class SaleManager implements SaleService{
	private OrderService orderService;
	private Double totalPrice;
	
	
	public SaleManager(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void buy(Order order, Customer customer, Game[] game, Campaign campaign) {
     totalPrice = 2.5;
     System.out.println(customer.getFirstName() + customer.getLastName() + "Sepet bilgileriniz:");
       
     }
	}

