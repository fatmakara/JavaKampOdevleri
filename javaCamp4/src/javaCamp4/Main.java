package javaCamp4;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdaptar());
         Customer customer  = new Customer (2, "fatma ", "kara", "18");
         customerManager.Save(customer);
	}

}
