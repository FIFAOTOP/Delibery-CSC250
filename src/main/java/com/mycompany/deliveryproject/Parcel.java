/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliveryproject;

import java.util.Date;

/**
 *
 * @author Light
 */
class Parcel {
    private String trackingID;
    private String senderName;//customer class
    private String senderAddress;//customer class
    private String senderPhoneNumber;//customer class
    private String receiverName;//customer class
    private String receiverAddress;//customer class
    private String receiverPhoneNumber;//customer class
    private double weight;
    private boolean isPerishable;// true for fresh items, false for dry items
    private Date deliveryDate;
    private boolean isDelivered;

    public Parcel(String trackingID,String senderName, String senderAddress, String senderPhoneNumber,
                  String receiverName, String receiverAddress, String receiverPhoneNumber,
                  double weight, boolean isPerishable) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderPhoneNumber = senderPhoneNumber;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.weight = weight;
        this.isPerishable = isPerishable;
        this.deliveryDate = null;
        this.isDelivered = false;
    }
    public String getTrackingID(){
        return trackingID;
    }
    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public double calculateShippingCost() {
        double baseCost = 40.0;
        double additionalCost = (weight - 1) * 15.0;
        if (isPerishable) {
            additionalCost += 10.0;
        }
        return baseCost + additionalCost;
    }

    public void markAsDelivered() {
        isDelivered = true;
        deliveryDate = new Date();
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Object isPerishable() {
        return false;
    }

    public Object getWeight() {
        return weight;
    }
}

