package com.org.tav.Bp;

public class CarManualBuilder implements Builder {
	private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    @Override
	public void setcarType(CarType type) {
		// TODO Auto-generated method stub
		this.type=type;
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.seats=seats;
		
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		this.engine=engine;
		
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
		this.transmission=transmission;
		
	}

	@Override
	public void setTripComputer(TripComputer tripcomputer) {
		// TODO Auto-generated method stub
		this.tripComputer=tripComputer;
		
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsnavigator) {
		// TODO Auto-generated method stub
		this.gpsNavigator=gpsnavigator;
		
	}
	public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }


}
