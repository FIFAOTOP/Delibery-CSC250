package classesExample;

class Parcel {
    private String senderName;
    private String senderAddress;
    private String senderPhoneNumber;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhoneNumber;
    private double weight;
    private boolean isPerishable; // true for fresh items, false for dry items
    private double shippingCost;

    public Parcel(String senderName, String senderAddress, String senderPhoneNumber,
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
    }

    public String calculateShippingCost() {
        double baseCost = 40.0;
        double additionalCostPerKilo = 15.0;

        if (isPerishable) {
            additionalCostPerKilo += 10.0;
        }
        shippingCost= baseCost + (weight - 1) * additionalCostPerKilo;
        //String a = String.valueOf(Double.parseDouble(shippingCost));
        return shippingCost+"";
    }

}