package Entities;

public class Campaign {
	
	private int campaingId;
	private String campaignName;
	private String campaignGift;
	
	public Campaign() {
		
	}
	public Campaign(int campaingId, String campaignName, String campaignGift) {
		
		this.campaingId = campaingId;
		this.campaignName = campaignName;
		this.campaignGift = campaignGift;
	}
	public int getCampaingId() {
		return campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignGift() {
		return campaignGift;
	}
	public void setCampaignGift(String campaignGift) {
		this.campaignGift = campaignGift;
	}
	
	
	
	

}



