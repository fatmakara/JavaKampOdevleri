package Abstract;

import Entities.Campaign;

public interface CampaignService {
	
	Campaign get(int id);
	Campaign getByGameId(int gameId);
	
	public void add(Campaign campaign);
	public void update(Campaign campaign);
	public void delete(Campaign campaign);
	

}
