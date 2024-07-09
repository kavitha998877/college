package com.tnsif.constructor;

public class Customer {
	private String Cname;
	private int Cid;
	private String Caddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cname, int cid, String caddress) {
		super();
		Cname = cname;
		Cid = cid;
		Caddress = caddress;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String name) {
		Cname = name;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCaddress() {
		return Caddress;
	}
	public void setCaddress(String caddress) {
		Caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [Cname=" + Cname + ", Cid=" + Cid + ", Caddress=" + Caddress + "]";
	}
	

}
