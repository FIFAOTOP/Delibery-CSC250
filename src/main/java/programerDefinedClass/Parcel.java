public class Parcel {
    private Double weight;
    private String contents, shippingMethod;
    private Double shippingCost;
    private DeliveryService deliveryService;

    public Parcel(Double weight, String contents, String shippingMethod, DeliveryService deliveryService) {
        this.weight = weight;
        this.contents = contents;
        this.shippingMethod = shippingMethod;
        this.deliveryService = deliveryService;
    }
    public void calculateDeliveryCost(){
        System.out.println("calculateDeliveryCost");
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
