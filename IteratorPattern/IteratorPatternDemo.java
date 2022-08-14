package IteratorPattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col=new Collection();
		for(Iterator itr=col.getIterator();itr.hasnext();) {
			String name=(String)itr.next();
			System.out.println("Name="+name);
		}
		

	}

}
