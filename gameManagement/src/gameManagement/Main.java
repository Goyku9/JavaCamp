package gameManagement;

import Entities.Campaign;

import Entities.Game;
import Entities.Gamer;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignServiceManager;
import Concrete.GameServiceManager;
import Concrete.GamerServiceManager;
import Concrete.SalesServiceManager;

public class Main {

	public static void main(String[] args) {
	
		
		Game game1 = new Game(1,"UNO",69.90);
		Game game2 = new Game(2,"TRUCK SIMULATOR",129.90);
		Game game3 = new Game(3,"FANTASY TENNIS2",159.90);
		
		GameServiceManager gameManager = new GameServiceManager();
		gameManager.gAdd(game1);
		gameManager.gUpdate(game2);
		gameManager.gDelete(game3);
		
	
		Gamer gamer1 = new Gamer(10, "10101010", "Engin", "Demiroğ", 1987);
		Gamer gamer2 = new Gamer(11, "11111111", "Rukiye Beyza", "Sarıkaya", 1998);
		Gamer gamer3 = new Gamer(12, "12121212", "Öykü", "Yüksel", 1997);
		
		GamerServiceManager gamerManager = new GamerServiceManager(new MernisServiceAdapter());
		gamerManager.gamerAdd(gamer3);
        gamerManager.gamerUpdate(gamer1);
        gamerManager.gamerDelete(gamer2);
		
		
		Campaign campaign1 = new Campaign(20,"Black Friday","50₺ İndirim Çeki");
		Campaign campaign2 = new Campaign(30,"Happy Hour","Telofon Kılıfı");
		Campaign campaign3 = new Campaign(20,"Birthday","Bluetooth Kulaklık");
		
		CampaignServiceManager campaignManager = new CampaignServiceManager();
		campaignManager.cAdd(campaign1);
		campaignManager.cUpdate(campaign2);
		campaignManager.cDelete(campaign3);
		
		SalesServiceManager salesManager = new SalesServiceManager();
		salesManager.sale(game1, gamer1);
		salesManager.saleGift(game2, gamer2, campaign3);
		salesManager.saleGift(game3, gamer3, campaign2);
		
		
		
		
		
		
	}

}
