package com.org.tav.FD;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory p=new GetPlanFactory();
		Scanner sc=new Scanner(System.in);
		String planName=sc.nextLine();
		System.out.println("enter no of units");
		int units=Integer.parseInt(sc.next());
		
		Plan p1=p.getPlan(planName);
		System.out.println("bill amount for ->"+planName+" of "+units+"units is:");
		p1.getRate();
		p1.calculate(units);
	}

}
