package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckServiceManager implements GamerCheckService{

	@Override
	public boolean validate(Gamer gamer) {
		
		return true;
	}
	

}
