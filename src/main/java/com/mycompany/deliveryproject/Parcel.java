package com.mycompany.deliveryproject;

//import programmerDefinedClass.DeliveryService;

public class Parcel {
    private Double weight;
    private String contents, shippingMethod;
    private Double shippingCost;
    private DeliveryService deliveryService;

    public Parcel(Double weight, String contents) {
        this.weight = weight;
        this.contents = contents;
        this.shippingMethod = shippingMethod;
        this.deliveryService = deliveryService;
    }
    public void calculateDeliveryCost() {
        double baseCost = 40.0;
        double additionalCostPerKilo = 15.0;

        boolean isPerishable=false;

        if (isPerishable) {
            additionalCostPerKilo += 10.0;
        }
        shippingCost= baseCost + (weight - 1) * additionalCostPerKilo;
        //String a = String.valueOf(Double.parseDouble(shippingCost));
        //return shippingCost+"";
    }
    public void shippingMethod(){
        
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
}
