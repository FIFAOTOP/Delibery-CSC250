package classesExample;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Parcel parcel1 = new Parcel("Sender1", "Address1", "1234567890",
                "Receiver1", "Address2", "9876543210", 3.5, true);

        Parcel parcel2 = new Parcel("Sender2", "Address3", "1112223333",
                "Receiver2", "Address4", "4445556666", 2.0, false);

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.addParcel(parcel1);
        deliveryService.addParcel(parcel2);

       // System.out.println("parcel1 shipping cost:"+parcel1.calculateShippingCost());
        //System.out.println("parcel2 shipping cost:"+parcel2.calculateShippingCost());

        // Update status
        deliveryService.updateParcelStatus(parcel1, "In transit");
        deliveryService.updateParcelStatus(parcel2, "Delivered");

        // Print stickers
        deliveryService.printSticker(parcel1, "Sender");
        deliveryService.printSticker(parcel2, "Receiver");

        // Print delivery report for a specific date
        deliveryService.printDeliveryReport(new Date());






    }
}