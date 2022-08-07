package com.example.demo.model;
import java.math.BigDecimal;
public class MemberStore {

	private int sid;
	private String snum;
	private String sname;
	private String stype;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String saddress;
	
	public MemberStore(int sid,String store_num, String store_name, String store_type, BigDecimal latitude,
			BigDecimal longitude, String store_address) {
		
		super();
		this.sid=sid;
		this.snum = store_num;
		this.sname = store_name;
		this.stype = store_type;
		this.latitude = latitude;
		this.longitude = longitude;
		this.saddress=store_address;
	}
	
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getlongitude() {
		return longitude;
	}
	public void setlongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}
