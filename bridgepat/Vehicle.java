package bridgepat;

public abstract class Vehicle {
	protected Workshop w1 ;
	protected Workshop w2;
	protected Workshop w3;
	public Vehicle(Workshop w1, Workshop w2 , Workshop w3) {
	    super();
	    this.w1 = w1;
	    this.w2 = w2;
	    this.w3 = w3;
	}
	abstract public void design() ;
}
