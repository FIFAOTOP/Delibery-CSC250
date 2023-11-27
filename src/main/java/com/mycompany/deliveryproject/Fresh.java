package programmerDefinedClass;

//import programmerDefinedClass.DeliveryService;

import programmerDefinedClass.DeliveryService;

public class Fresh extends Parcel{
    public Fresh(Double weight, String contents, String shippingMethod, DeliveryService deliveryService) {
        super(weight, contents, shippingMethod, deliveryService);
    }

    @Override
    public void calculateDeliveryCost() {
        super.calculateDeliveryCost();
    }
}
