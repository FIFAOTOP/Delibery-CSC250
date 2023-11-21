package classesExample;

import java.util.*;

class DeliveryService {
    private List<Parcel> parcels;
    private Map<Parcel, String> parcelStatus; // Map to store the status of each parcel

    public DeliveryService() {
        this.parcels = new ArrayList<>();
        this.parcelStatus = new HashMap<>();
    }

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
        parcelStatus.put(parcel, "Received"); // Initial status when a parcel is received
    }

    public void updateParcelStatus(Parcel parcel, String status) {
        parcelStatus.put(parcel, status);
    }

    public void printSticker(Parcel parcel, String customerType) {
        // Implementation to print sticker goes here
        System.out.println("Sticker printed for " + customerType + ": " + parcel);
    }

    public void printDeliveryReport(Date date) {
        // Implementation to print delivery report for the specified date goes here
        System.out.println("Delivery report for " + date + ": ");
        // Iterate over parcels and print relevant information
        for (Parcel parcel : parcels) {
            System.out.println(parcel + " - Status: " + parcelStatus.get(parcel)+" - Shipping cost: "+parcel.calculateShippingCost());
        }
    }

    public String toString(){
        return parcels+", "+parcelStatus;
    }
}