package javaCamp4;

public class NeroCustomerManager extends BaseCustomerManager {
  CustomerCheckService checkService;

public NeroCustomerManager(CustomerCheckService checkService) {
	super();
	this.checkService = checkService;
}

@Override
public void Save(Customer customer) {
	if(checkService.checkıfRealPerson(customer)) {
	System.out.println( "Veri tabanına kaydedildi: " + customer.getFirstName());
}else {
	System.out.println( "geçerli kişi değil");
   }
}
}
