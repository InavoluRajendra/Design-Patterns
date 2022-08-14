package com.org.tav.Bp;
//builder patter allows us step by step construction of different car models
public interface Builder {
	void setcarType (CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripcomputer);
	void setGPSNavigator(GPSNavigator gpsnavigator);
}
