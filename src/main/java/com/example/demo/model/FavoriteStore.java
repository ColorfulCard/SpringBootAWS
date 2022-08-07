package com.example.demo.model;

public class FavoriteStore {
	
	private String uid;
	private int sid;
	
	public FavoriteStore(String uid, int sid) {
		this.uid= uid;
		this.sid= sid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

}
