package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameServiceManager implements GameService {

	@Override
	public void gAdd(Game game) {
		
		System.out.println(game.getName() + " sisteme eklendi");
	}

	@Override
	public void gUpdate(Game game) {
		
		System.out.println(game.getName() + " güncellendi");
		
	}

	@Override
	public void gDelete(Game game) {
		
		System.out.println(game.getName() + " sistemden silindi");
		
		
	}

}
