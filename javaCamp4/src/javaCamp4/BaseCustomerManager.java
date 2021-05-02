package javaCamp4;

public abstract class  BaseCustomerManager implements CustomerService {
	 @Override
	 
	 public void Save(Customer customer) {
		 System.out.println(  " Veri tabanına kaydedildi " + customer.getFirstName());
	 }

}
