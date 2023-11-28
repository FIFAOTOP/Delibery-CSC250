package com.mycompany.deliveryproject;

//import programmerDefinedClass.DeliveryService;

public class Fresh extends Parcel{
    public Fresh(Double weight, String contents) {
        super(weight, contents);
    }
/*
@Override
    public String calculateDeliveryCost() {
        super.calculateDeliveryCost();
        double baseCost = 40.0;
        double additionalCostPerKilo = 15.0;

        additionalCostPerKilo += 10.0;

        this.shippingCost = baseCost + (weight - 1) * additionalCostPerKilo;
        //String a = String.valueOf(Double.parseDouble(shippingCost));
        return shippingCost+"";
    }
    @Override
    public String shippingMethod(){
        //air conditioned
        //instance of
        return "air-conditioned";
    }
    */
}
