package com.ecom.run;

import com.ecom.dto.Order;
import com.ecom.dto.Shipment;
import com.ecom.dto.ShipmentType;
import com.ecom.util.OrderComparator;
import com.ecom.util.OrderUtil;
import com.ecom.util.OrderWithEndDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class OrderProcessing {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date strDate1 = objSDF.parse("20-01-1981");
        Date endDate1 = objSDF.parse("21-02-2020");
        Date strDate2 = objSDF.parse("22-03-1975");
        Date endDate2 = null;
        Date strDate3 = null;
        Date endDate3 = objSDF.parse("08-10-1974");
        Date strDate4 = objSDF.parse("14-07-1999");
        Date endDate4 = objSDF.parse("31-08-2001");
        Date strDate5 = null;
        Date endDate5 = objSDF.parse("08-10-1974");
        Date strDate6 = objSDF.parse("22-03-1971");
        Date endDate6 = null;
        List<Order> ordeeee = new ArrayList<>();
        List<Shipment> shipments = new ArrayList<>();
        Order order = OrderUtil.retrieveOrder(1, strDate1, endDate1, 11, ShipmentType.NORTH, "Hyderabad");
        Order order2 = OrderUtil.retrieveOrder(2, strDate2, endDate2, 11, ShipmentType.NORTH, "Hyderabad"); // 1234
        Order order5 = OrderUtil.retrieveOrder(3, strDate3, endDate3, 11, ShipmentType.NORTH, "Hyderabad"); // 1234
        Order order6 = OrderUtil.retrieveOrder(4, strDate4, endDate4, 11, ShipmentType.NORTH, "Hyderabad"); // 1234
        ordeeee.add(order);
        ordeeee.add(order2);
        ordeeee.add(order5);
        ordeeee.add(order6);
        ordeeee.add(OrderUtil.retrieveOrder(5, strDate5, endDate5, 11, ShipmentType.NORTH, "Hyderabad"));
        ordeeee.add(OrderUtil.retrieveOrder(6, strDate6, endDate6, 11, ShipmentType.NORTH, "Hyderabad"));

        Shipment shipment = OrderUtil.retrieveShipment(1, ShipmentType.NORTH, "Hyderabad");
        Shipment shipment2 = OrderUtil.retrieveShipment(2, ShipmentType.SOUTH, "Vadodra"); // 1234
        Shipment shipment3 = OrderUtil.retrieveShipment(3, ShipmentType.EAST, "Bengal"); // 1234
        Shipment shipment4 = OrderUtil.retrieveShipment(4, ShipmentType.WEST, "Japan"); // 1234
        shipments.add(shipment);
        shipments.add(shipment2);
        shipments.add(shipment3);
        shipments.add(shipment4);
        shipments.add(OrderUtil.retrieveShipment(5, ShipmentType.NORTH, "Hyderabad"));
        shipments.add(OrderUtil.retrieveShipment(6, ShipmentType.SOUTH, "Hyderabad"));

        //ordeeee.add(null);s
        //System.out.println(ordeeee);
        //System.out.println(order2);
        List<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Vadodra");
        cities.add("JAPAN ");
        List<Shipment> shipmentsList = OrderUtil.filterOrdersByProp1(shipments, cities);
        //System.out.println(shipmentsList);

        //List<Order> orderss = OrderUtil.filterOrdersByProp(22222, ordeeee);
        //List<Order> cityOders = OrderUtil.filterOrdersByProp("vadodra", ordeeee);
        //List<Order> cityOderss = OrderUtil.filterOrdersByProp(cities, ordeeee);


        //orderss.addAll(cityOders);
        //cityOders.addAll(cityOderss);
        //System.out.println(cityOders);
        //System.out.println(cityOderss);
        /*Create Multiple Orders for different cities,OrderId
         * Create Utility Method For List of Order For given City */
       /* OrderComparator orderComparator = new OrderComparator();
        Collections.sort(ordeeee, orderComparator);
        for (Order order1 :ordeeee ) {
            System.out.println(order1.toString());
        }*/
        OrderComparator orderComparator = new OrderComparator();
        Collections.sort(ordeeee, orderComparator);
        for (Order order1 : ordeeee) {
            System.out.println(order1.toString());
        }
        //the above code is based upon java 7
        /*Comparator<Order> compareByEndDate = Comparator
                .comparing(Order::getEndDate);
        List<Order> sortedByOrders=ordeeee.stream()
                .sorted(compareByEndDate)
                .collect(Collectors.toList());

        System.out.println(sortedByOrders);*/
       
    }
}
