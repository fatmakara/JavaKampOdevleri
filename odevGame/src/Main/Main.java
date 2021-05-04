package Main;

import Abstract.CampaignService;
import Abstract.GameService;
import Abstract.UserService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		UserService userManager = new UserManager();
		User fatma= new User(1, "1234", "fatoskara@gmail.com");
		userManager.add(fatma);
		userManager.update(fatma);
		userManager.delete(fatma);
		
		
		System.out.println( "***************");
		
		GameService gameManager = new GameManager();
		Game minecraftGame = new Game(1, " Minecraft",100);
		gameManager.add(minecraftGame);
		gameManager.update(minecraftGame);
		gameManager.delete(minecraftGame);
		
		
		System.out.println( "*******************");
		
		
		
		CampaignService campaignManager = (CampaignService) new CampaignManager();
		Campaign minecraftGameCampaign = new Campaign(2, "minecraftCampaign", 20);
		campaignManager.add(minecraftGameCampaign);
		campaignManager.update(minecraftGameCampaign);
		campaignManager.delete(minecraftGameCampaign);
		
	
		
		
		
		
		
	}
		
					
			

	}


