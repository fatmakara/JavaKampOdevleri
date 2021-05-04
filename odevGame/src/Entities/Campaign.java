package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double price;
	
	
	public Campaign(int id, String campaignName, double price) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

}
