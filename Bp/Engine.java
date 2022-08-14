package com.org.tav.Bp;
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
    public Engine(double volume, double mileage) {
        super();
        this.volume = volume;
        this.mileage = mileage;
        this.started = started;
    }

    public void on() {
        started = true;
    }
    public void off() {
        started = false;
    }
    public boolean isStarted() {
        return started;
    }
    public double getVolume() {
        return volume;
    }
    public double getMileage() {
        return mileage;
    }
}