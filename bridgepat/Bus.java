package bridgepat;

public class Bus extends Vehicle {
	public Bus(Workshop w1, Workshop w2 ,Workshop w3) {
        super(w1, w2,w3);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void design() {
        // TODO Auto-generated method stub
        System.out.println("Bus");
        w1.work();
        w2.work();
        w3.work();
}}
