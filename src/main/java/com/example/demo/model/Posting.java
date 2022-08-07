package com.example.demo.model;
import java.sql.Timestamp;
public class Posting {
	
	private int pno;
	private String pid;
	private Timestamp pdate;
	private String pcontent;
	private int hcnt;
	private int ccnt;
	private int vcnt; 
	
	public Posting(int pno, String pid, Timestamp pdate, String pcontent, int hcnt, int ccnt, int vcnt) {
		
		this.pno= pno;
		this.pid= pid;
		this.pdate=pdate;
		this.pcontent=pcontent;
		this.hcnt= hcnt;
		this.ccnt= ccnt;
		this.vcnt= vcnt;
		
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Timestamp getPdate() {
		return pdate;
	}

	public void setPdate(Timestamp pdate) {
		this.pdate = pdate;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public int getHcnt() {
		return hcnt;
	}

	public void setHcnt(int hcnt) {
		this.hcnt = hcnt;
	}

	public int getCcnt() {
		return ccnt;
	}

	public void setCcnt(int ccnt) {
		this.ccnt = ccnt;
	}

	public int getVcnt() {
		return vcnt;
	}

	public void setVcnt(int vcnt) {
		this.vcnt = vcnt;
	}
	
	

}
