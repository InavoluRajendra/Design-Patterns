package com.org.tav.bp1;

public class Burger {
	private String bread;
	private String patty;
	private String veggies;
	private String sauces;
	private Boolean extracheese=Boolean.FALSE;
	@Override
	public String toString() {
		return "Burger [bread=" + bread + ", patty=" + patty + ", veggies=" + veggies + ", sauces=" + sauces
				+ ", extracheese=" + extracheese + "]";
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getPatty() {
		return patty;
	}
	public void setPatty(String patty) {
		this.patty = patty;
	}
	public String getVeggies() {
		return veggies;
	}
	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}
	public String getSauces() {
		return sauces;
	}
	public void setSauces(String sauces) {
		this.sauces = sauces;
	}
	public Boolean getExtracheese() {
		return extracheese;
	}
	public void setExtracheese(Boolean extracheese) {
		this.extracheese = extracheese;
	}
	public void build()
	{
		return;
	}
	}
