package com.org.tav.bp1;

public class BurgerBuilder {
	private Burger burger;

	public BurgerBuilder() {
		//super();
		this.burger=new Burger();
		
	}
	public Burger addbread(String bread) {
		burger.setBread(bread);
		return burger;
	}
	public Burger build() {
		return this.burger;
	}

}
