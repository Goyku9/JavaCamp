package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	
	void sale(Game game, Gamer gamer);
	void saleGift(Game game, Gamer gamer, Campaign campaign);

}
