package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Adapters.MernisServiceAdapter;
import Entities.Gamer;

public class GamerServiceManager implements GamerService {
	
	GamerCheckService gamerCheck;

	public GamerServiceManager(GamerCheckService gamerCheck) {
		
		this.gamerCheck = gamerCheck;
		
		
	}

	@Override
	public void gamerAdd(Gamer gamer) {
		
		if(gamerCheck.validate(gamer)) {
			
			System.out.println("Oyuncu : "+gamer.getFirstName()+" "+gamer.getLastName()+ " sisteme kaydedildi.");
		}
		else {
			 try {
	                throw new Exception(" Not a valid TC");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
		}
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		
		System.out.println("Oyuncu : "+gamer.getFirstName()+" "+gamer.getLastName()+ " güncellendi.");
	}
		
		
	

	@Override
	public void gamerDelete(Gamer gamer) {
		
		System.out.println("Oyuncu : "+gamer.getFirstName()+" "+gamer.getLastName()+ " sistemden silindi.");
	}
		
		
	}

