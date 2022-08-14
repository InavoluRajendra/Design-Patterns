package com.adap.phone.wrap;
 
import com.adap.phone.LightningPhone;
import com.adap.phone.MicroUsbPhone;
import com.adap.phone.impl.Iphone;
 
public class LightningToMicroUsbAdapter implements MicroUsbPhone {
 
      private final LightningPhone lightningPhone;
 
        public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
            this.lightningPhone = lightningPhone;
        }
 
        @Override
        public void useMicroUsb() {
            System.out.println("MicroUsb connected");
            lightningPhone.useLightning();
        }
 
        @Override
        public void recharge() {
            lightningPhone.recharge();
        }
}