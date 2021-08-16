package com.ecom.dto;

import lombok.Data;

import java.util.List;

@Data
public class Shipment {
    private Integer shipmentId;

    private ShipmentType shipmentType;
    //private String typeOfShipment;
    private List<Address> addresses;
}
