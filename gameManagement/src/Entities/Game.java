package Entities;

public class Game {
	
	private int gameId;
	private String gameName;
	private double unitPriceOfGame;
	
	
	public Game() {
		
	}


	public Game(int id, String name, double unitPrice) {
	
		this.gameId = id;
		this.gameName = name;
		this.unitPriceOfGame = unitPrice;
	}


	public int getId() {
		return gameId;
	}


	public void setId(int id) {
		this.gameId = id;
	}


	public String getName() {
		return gameName;
	}


	public void setName(String name) {
		this.gameName = name;
	}


	public double getUnitPrice() {
		return unitPriceOfGame;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPriceOfGame = unitPrice;
	}
	
	
	
	
	
	

}
