/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

import com.mycompany.deliveryproject.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Light
 */
class DeliverySystem {
    private List<Parcel> parcels;

    public DeliverySystem() {
        this.parcels = new ArrayList<>();
    }

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    public List<Parcel> getParcels() {
        return parcels;
    }
}
