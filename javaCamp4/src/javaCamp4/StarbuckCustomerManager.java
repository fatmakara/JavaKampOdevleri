package javaCamp4;

public class StarbuckCustomerManager extends BaseCustomerManager{
  public Entity entity;
  private CustomerCheckService customerCheckService;
  
  
public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
	
	this.customerCheckService = customerCheckService;
}

@Override 

public void Save(Customer customer) {
	if(customerCheckService.checkıfRealPerson(customer)) {
		System.out.println( "Veri tabanına kaydedildi :" + customer.getFirstName());
	}else {
		System.out.println( "geçerli kişi değil");
	}
}

}
	

