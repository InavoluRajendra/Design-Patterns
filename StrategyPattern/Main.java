package StrategyPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		Context con=new Context(new Addition());
		System.out.println("Addition="+con.executeStr(f1, f2));
		
		Context con1=new Context(new Substraction());
		System.out.println("Sub="+con.executeStr(f1, f2));
		
		Context con2=new Context(new Multi());
		System.out.println("Multi="+con.executeStr(f1, f2));
	}

}
