package com.org.tav.single;
public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String Value) {
        super();
        try {
            this.value=Value;
            Thread.sleep(1000);
        }catch (Exception e) {
            // TODO: handle exception
        }
    }

    synchronized static Singleton getInstance(String value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

}