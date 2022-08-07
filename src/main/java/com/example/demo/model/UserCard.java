package com.example.demo.model;

public class UserCard {

	private String id;
	private String cardName;
	private String cardNum;
	private String cardType;
	
	public UserCard(String id, String cardName, String cardNum, String cardType) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.cardType= cardType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getcardType() {
		return cardType;
	}

	public void setcardType(String cardType) {
		this.cardType = cardType;
	}

}
