package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public interface SaleService {
	public void buy(Order order, Customer customer,Game[] game,Campaign campaign);
	

}
