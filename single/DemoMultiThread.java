package com.org.tav.single;

public class DemoMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("If you see the same value , thensingleton was resued !!! "+"\n"+
	            "If you see different values then 2 singletons were created "+ "\n\n"+ "Result :"+"\n");


//	        Singleton s1 = Singleton.getInstance("Foo");
//	        Singleton s2 = Singleton.getInstance("Bar");
//	         System.out.println(s1.value);
//	         System.out.println(s2.value);
	         Thread t1=new Thread(()->{Singleton s1=Singleton.getInstance("Foo");
	         System.out.println(s1.value);
	         });
	         Thread t2=new Thread(()->{Singleton s2=Singleton.getInstance("Bar");
	         System.out.println(s2.value);
	         });
	         t1.start();
	         t2.start();

	        }

	}


