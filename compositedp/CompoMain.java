package compositedp;

public class CompoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child m1=new Child("mary", "kom");
		Parent p1=new Parent("kamila", "joseph");
		Parent p2=new Parent("emily", "tose");
		
		m1.addParent(p2);
		m1.addParent(p1);
		
		p1.addChild(m1);
		p2.addChild(m1);
		
		GrandParents g1= new GrandParents("philip", "jose");
		GrandParents g2=new GrandParents("raji", "priya");
		
		p1.addParent(g2);
		p2.addParent(g1);
		
		g1.addChild(p1);
		g1.addChild(p2);
		
		g1.print();g2.print();p1.print();p2.print();
		m1.print();

	}

}
