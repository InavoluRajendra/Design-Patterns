package com.adap.phone.main;
 
import com.adap.phone.LightningPhone;
import com.adap.phone.MicroUsbPhone;
import com.adap.phone.impl.Android;
import com.adap.phone.impl.Iphone;
import com.adap.phone.wrap.LightningToMicroUsbAdapter;
 
public class AdaptorMainDemo {
 
    
    public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
        phone.useMicroUsb();
        phone.recharge();
    }
 
    public static void rechargeLightningPhone(LightningPhone phone) {
        phone.useLightning();
        phone.recharge();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Android android = new Android();
        Iphone iPhone = new Iphone();
 
        System.out.println("Recharging android with MicroUsb");
        rechargeMicroUsbPhone(android);
 
        System.out.println("Recharging iPhone with Lightning");
        rechargeLightningPhone(iPhone);
 
        System.out.println("Recharging iPhone with MicroUsb");
        rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));
    }
 
}