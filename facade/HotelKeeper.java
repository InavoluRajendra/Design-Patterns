package facade;

public class HotelKeeper {
	public VegRestro getVegMenu()
	{
		VegRestro v=new VegRestro();
		v.getMenu();
		return v;
	}
	public NonVegRestro getNonVegMenu()
	{
		NonVegRestro nv=new NonVegRestro();
		nv.getMenu();
		return nv;
	}
	public VegandNonVeg getNonVegandvegMenu()
	{
		VegandNonVeg nav=new VegandNonVeg();
		nav.getMenu();
		return nav;
	}
	
	

}
