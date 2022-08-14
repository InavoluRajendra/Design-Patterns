package com.org.tav.adp;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundHole hole=new RoundHole(5);
		RoundPeg rpeg=new RoundPeg(5);
		if(hole.fits(rpeg)) {
			System.out.println("round peg r5 fits round hole r5");
		}
		SquarePeg smallp=new SquarePeg(2);
		SquarePeg largep=new SquarePeg(20);
		//hole.fits(smallp)wont compile
		
		//Adapter solves the problem
		SquarePegAdapter smalladp=new SquarePegAdapter(smallp);
		SquarePegAdapter largeadp=new SquarePegAdapter(largep);
		if(hole.fits(smalladp)) {
			System.out.println("square peg w2 fits round hole r5");
		}
		if(!hole.fits(largeadp)) {
			System.out.println("square peg w20 does not  fits into round hole r5");
		}
	}

}
