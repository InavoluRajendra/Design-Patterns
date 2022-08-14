package bridgepat;

public class BridgePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle v1 = new Bus(new Produce(), new Assemble(), new Service());
		   v1.design();
	}

}
