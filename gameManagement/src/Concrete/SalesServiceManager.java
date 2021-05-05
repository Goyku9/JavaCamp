package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesServiceManager implements SalesService {

	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+" " +gamer.getLastName()+" "+ game.getUnitPrice()+" fiyatl� "+game.getName()+" oyununu sat�n ald�." );
		
	}

	@Override
	public void saleGift(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println(gamer.getFirstName()+" " +gamer.getLastName()+" "+campaign.getCampaignName()+" kampanyas� ile "+game.getName()+" oyununu sat�n alarak "+campaign.getCampaignGift()+ " hediyesini kazand�." );
		
		
		
	}

}
