package model;

public abstract class BasicCard {
	
	private int id;
	private String pan;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public BasicCard() {
	}
	
	public BasicCard(int id, String pan) {
		super();
		this.id = id;
		this.pan = pan;
	}
	
	public abstract void ispisiKarticu();
	

}
