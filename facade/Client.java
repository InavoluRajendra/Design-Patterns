package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelKeeper keeper=new HotelKeeper();
		VegRestro v1=keeper.getVegMenu();
		NonVegRestro v2=keeper.getNonVegMenu();
		VegandNonVeg v3=keeper.getNonVegandvegMenu();
	}

}
