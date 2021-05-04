package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +  "isimli %" + campaign.getPrice() + " fiyatlı kampanya eklenmiştir. ");
		
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +  " İsimli kampanya güncellenmiştir.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +   " İsimli kampanya silinmiştir." );
		
	}

	@Override
	public Campaign get(int id) {
		System.out.println( " Tek kampanya başlangıç ");
		return null;
	}

	@Override
	public Campaign getByGameId(int gameId) {
		// TODO Auto-generated method stub
		return null;
	}
}
