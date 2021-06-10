package com.ecom.util;

import com.ecom.dto.*;

import java.util.*;
import java.util.stream.Collectors;

public class OrderUtil {

    public static List<Order> filterOrdersByProp(Integer itemId, List<Order> orddd) {
        List<Order> cityOrders = new ArrayList<>();
        /*      Iterator<Order> orderItr = orddd.iterator();

        while (orderItr.hasNext()) {
            Order order = orderItr.next();
            Iterator<Shipment> shipmentItr = order.getShipments().listIterator();
            while (shipmentItr.hasNext()) {
                Shipment shipment = shipmentItr.next();
                Iterator<Address> adressItr = shipment.getAddresses().listIterator();
                while (adressItr.hasNext()){
                    Address address = adressItr.next();
                    if(address.getCity().equals(city)){
                        cityOrders.add(order);
                    }
                }
            }
        }
*/
        // statements using variable

        /*HashSet<Order> hashSetorder = new HashSet(cityOrders);
        {
            for(Order order1 : hashSetorder ){

                cityOrders.remove(order1);
            }
        }*/
              /* for(Order order:orddd){
            for(Item item:order.getItems()){
                if (item.getItemId().equals(itemId)){
                    cityOrders.add(order);
                }

            }
        }*/

        /*for( Order order : orddd) {
            for(Shipment shipment : order.getShipments()){
                for(Address address : shipment.getAddress()){
                    if(address.getCity().equals(city)){
                        cityOrders.add(order);
                    }
                }
            }
        }*/
       /* for(Order order:orddd){
            for(Item item:order.getItems()){
                if (item.getItemId().equals(itemId)){
                    cityOrders.add(order);
                }

            }
        }*/

       /* for( Order order : orddd) {
            for(Shipment shipment : order.getShipments()){
                for(Address address : shipment.getAddress()){
                    if(address.getCity().equals(city)){
                        cityOrders.add(order);
                    }
                }
            }
        }
*/
        /*Iterator<Order> order = orddd.iterator();

        while (order.hasNext()) {
            Order object = order.next();
            Iterator<Shipment> shipment = object.getShipments().listIterator();
            while (shipment.hasNext()) {
                Shipment  subobject = shipment.next();
                Iterator<Address> adressItr = subobject.getAddress().listIterator();
                while (adressItr.hasNext()){
                    Address address = adressItr.next();
//                    if(address.getItem().equals(itemId)){
//                        cityOrders.add
//                    }
                }
            }
        }*/
               /* for(Order order:orddd){
            for(Item item:order.getItems()){
                if (item.getItemId().equals(itemId)){
                    cityOrders.add(order);
                }

            }
        }*/

        /*
            for(Shipment shipment : order.getShipments()){
                for(Address address : shipment.getAddress()){
                    if(address.getCity().equals(city)){
                        cityOrders.add(order);
                    }
                }
            }
        }*/
       /* for (Order order : orddd) {
            return cityOrders;
        }*/
        return cityOrders;
    }

    public static List<Order> filterOrdersByProp(String city, List<Order> orddd) {
        List<Order> cityOrders = new ArrayList<>();
        Iterator<Order> orderItr = orddd.iterator();
        while (orderItr.hasNext()) {
            Order order = orderItr.next();
            Iterator<Shipment> shipmentItr = order.getShipments().listIterator();
            while (shipmentItr.hasNext()) {
                Shipment shipment = shipmentItr.next();
                Iterator<Address> adressItr = shipment.getAddresses().listIterator();
                while (adressItr.hasNext()) {
                    Address address = adressItr.next();
                    if (address.getCity().equals(city)) {
                        cityOrders.add(order);//1234
                    }
                }
            }
        }
        for (int i = 0; i < orddd.size(); i++) {
            Order order = orddd.get(i);
            if (Objects.nonNull(order)) {
                List<Shipment> shipments = order.getShipments();
                for (int j = 0; j < shipments.size(); j++) {
                    Shipment shipment = shipments.get(j);
                    List<Address> addresses = shipment.getAddresses();
                    for (int k = 0; k < addresses.size(); k++) {
                        Address address = addresses.get(k);
                        if (address.getCity().equals(city)) {
                            cityOrders.add(order);//1234
                        }
                    }
                }
            }
            // statements using variable
        }
        HashSet<Order> hashSetorder = new HashSet(cityOrders);
        for (Order order1 : hashSetorder) {
            cityOrders.remove(order1);
        }
        return cityOrders;
    }


    public static List<Order> filterOrdersByProp(List<String> cities, List<Order> orddd) {
        List<Order> cityOrders = new ArrayList<>();
        /*orddd.stream().map(order -> order.getShipments()).collect(Collectors.toList())
                .stream().map(shipments -> shipments.get).collect(Collectors.toList())
                        .stream().map(address  -> address.getCity())*/

//                ));


        for (int i = 0; i < orddd.size(); i++) {
            Order order = orddd.get(i);
            if (Objects.nonNull(order)) {
                List<Shipment> shipments = order.getShipments();
                for (int j = 0; j < shipments.size(); j++) {
                    Shipment shipment = shipments.get(j);
                    List<Address> addressesss = shipment.getAddresses();
                    for (int k = 0; k < addressesss.size(); k++) {
                        Address address = addressesss.get(k);
                        if (containIgnoringExtraSpace(cities, address.getCity())) {
                            cityOrders.add(order);
                        }
                    }
                }
            }

        }
        return cityOrders;
    }

    public static List<Shipment> filterOrdersByProp1(List<Shipment> shipments, String city) {
        // List<Shipment> numberOfShipments = new ArrayList<>();
        /*List<Shipment> numberOfShipments = shipments.stream()
                .flatMap(typeOfShipment->typeOfShipment.getAddresses().stream())
              .filter(address->address.getCity().equals(city))
              .collect(Collectors.toList());*/
        List<Shipment> shipmentList = shipments.stream().filter(Objects::nonNull)
                .filter(shipment -> {
                    boolean result = false;
                    // iterate over list of Addresses and check whether the city matches with any one of the address
                    List<Address> address = shipment.getAddresses();
                    for (Address adress : address) {
                        if (adress.getCity().equals(city)) {
                            result = true;
                        }
                    }
                    return result;
                })
                .collect(Collectors.toList());
        return shipmentList;

    }


    public static List<Shipment> filterOrdersByProp1(List<Shipment> shipments, List<String> cities) {
        // List<Shipment> numberOfShipments = new ArrayList<>();
        /*List<Shipment> numberOfShipments = shipments.stream()
                .flatMap(typeOfShipment->typeOfShipment.getAddresses().stream())
              .filter(address->address.getCity().equals(city))
              .collect(Collectors.toList());*/
        List<Shipment> shipmentList1=new ArrayList<>();
        List<Shipment> shipmentList = shipments.stream().filter(Objects::nonNull)

                .filter(shipment -> {
                    boolean result = false;
                    // iterate over list of Addresses and check whether the city matches with any one of the address
                    List<Address> address = shipment.getAddresses();
                    for (Address adress : address) {
                        if (contain(cities,adress.getCity())) {

                            result = true;
                        }
                                            }
                    return result;
                })
                .collect(Collectors.toList());
        return shipmentList;

    }


    public static boolean contain(List<String> requestCities, String city) {
        boolean con = false;
        for (String requestCity : requestCities) {
            if (requestCity.equals(city)) {
                return true;
            }

        }

        return con;
    }
    public static List<Order> filterOrdersByProp(List<Order> orders, String city) {
        // List<Shipment> numberOfShipments = new ArrayList<>();
        /*List<Shipment> numberOfShipments = shipments.stream()
                .flatMap(typeOfShipment->typeOfShipment.getAddresses().stream())
              .filter(address->address.getCity().equals(city))
              .collect(Collectors.toList());*/
        /*List<Order> orderList = orders.stream().filter(Objects::nonNull)
                .filter(order -> {
                    order.getShipments().stream().filter(Objects::nonNull).filter(shipment -> {
                        {
                            boolean result = false;
                            // iterate over list of Addresses and check whether the city matches with any one of the address
                            List<Address> address = shipment.getAddresses();
                            for (Address adress : address) {
                                if (adress.getCity().equals(city)) {
                                    result = true;
                                }
                            }
                            return result;

                        })


                    }).collect(Collectors.toList());
                )};
        return orderList;
    }*/
        /*List<Order> orderList = orders.stream().flatMap(order -> {
            order.getShipments().stream().filter(Objects::nonNull).

                    filter(shipment -> {
                        {
                            boolean result = false;
                            // iterate over list of Addresses and check whether the city matches with any one of the address
                            List<Address> address = shipment.getAddresses();
                            for (Address adress : address) {
                                if (adress.getCity().equals(city)) {
                                    result = true;
                                }
                            }
                            return result;
                        }
                    });
      return

        }).collect(Collectors.toList());
        return orderList;*/
        List<Order> orderList = orders.stream().filter(order -> {

            return order.getShipments().stream().anyMatch(shipment ->
                    //boolean result = false;
                    shipment.getAddresses().stream()
                            .anyMatch(address -> address.getCity().equals(city)));
                /*for (Address address : addresses) {
                    if (address.getCity().equals(city)) {
                        result = true;
                    }
                }*/
            //return result;

        }).collect(Collectors.toList());

        return orderList;
    }

    /*public static boolean fetchOrders(Order order, String city) {
        order.getShipments().stream().anyMatch(shipment -> {

            boolean result = false;
            List<Address> addresses = shipment.getAddresses();
            for (Address address : addresses) {
                if (address.getCity().equals(city)) {
                    result = true;
                }
            }
            return result;
        });

return ;
    }*/

    /*public static boolean contain(List<String> requestCities, String city) {
        boolean con = false;
        for (String requestCity : requestCities) {
            if (requestCity.equals(city)) {
                return true;
            }

        }

        return con;
    }*/

    public static boolean containIgnoreCase(List<String> requestCities, String city) {
        boolean con = false;
        for (String requestCity : requestCities) {
            if (requestCity.equalsIgnoreCase(city)) {
                return true;
            }
        }
        return con;
    }

    public static boolean containIgnoringExtraSpace(List<String> requestCities, String city) {
        boolean con = false;
        for (String requestCity : requestCities) {
            if (requestCity.trim().equals(city.trim())) {
                return true;
            }
        }
        return con;
    }

    /*public static List<Order> filterOrdersByProp ( Shipment  typeOfShipment, List < Order > orddd){
        List<Order> cityOrderss = new ArrayList<>();

        for (int i = 0; i < orddd.size(); i++) {
            Order order = orddd.get(i);
            if (Objects.nonNull(order)) {
                List<Shipment> shipments = order.getShipments();
                for (int j = 0; j < shipments.size(); j++) {
                    Shipment shipment = shipments.get(j);

                    if (shipment.getTS().equals(typeOfShipment)) {
                        cityOrders.add(order);
                             }
                }
            }
        }

        return cityOrders;
    }*/
    public static Order retrieveOrder(ShipmentType typeOfShipment, Integer orderId, Integer itemId, String city) {
        Order ord = new Order();
        ord.setOrderId(orderId);
        //System.out.println("The Order is "+ord.getOrderId());
        Item IT = new Item();
        IT.setItemId(itemId);
        Address adrs = new Address();
        adrs.setCity(city);
        //System.out.println("The Item Code is "+IT.getItemId());
        //System.out.println("The City in which it has to deliver "+adrs.getCity());
        Shipment shipmentss = new Shipment();
        List<Item> items = new ArrayList<>();

        items.add(IT);
        List<Shipment> shipments = new ArrayList<>();
        shipmentss.setShipmentType(typeOfShipment);
        shipments.add(shipmentss);
        List<Address> addresses = new ArrayList<>();
        addresses.add(adrs);
        shipmentss.setAddresses(addresses);
        ord.setShipments(shipments);
        ord.setItems(items);
        return ord;
//    System.out.print(ord);
    }

    //We are Creating a Single Object of Shipment//
    public static Shipment retrieveShipment(Integer shipmentId, ShipmentType typeOfShipment, String city) {
        //Order ord = new Order();

        //ord.setOrderId(orderId);
        //System.out.println("The Order is "+ord.getOrderId());
        //Item IT = new Item();
        //IT.setItemId(itemId);
        Address adrs = new Address();
        adrs.setCity(city);
        //System.out.println("The Item Code is "+IT.getItemId());
        //System.out.println("The City in which it has to deliver "+adrs.getCity());
        Shipment shipment = new Shipment();
        //List<Item> items = new ArrayList<>();

        //items.add(IT);
        //List<Shipment> shipments = new ArrayList<>();
        shipment.setShipmentType(typeOfShipment);
        //shipments.add(shipmentss);
        List<Address> addresses = new ArrayList<>();
        addresses.add(adrs);
        shipment.setAddresses(addresses);
        //ord.setShipments(shipments);
        //ord.setItems(items);
        return shipment;
//    System.out.print(ord);
    }

    public static Order retrieveOrder(Integer orderId, Date startDate,Date endDate,Integer shipmentId, ShipmentType typeOfShipment, String city) {
        Order ord = new Order();

        ord.setOrderId(orderId);
        ord.setStartDate(startDate);
        ord.setEndDate(endDate);
        //System.out.println("The Order is "+ord.getOrderId());
        //Item IT = new Item();
        //IT.setItemId(itemId);
        Address adrs = new Address();
        adrs.setCity(city);
        //System.out.println("The Item Code is "+IT.getItemId());
        //System.out.println("The City in which it has to deliver "+adrs.getCity());
        Shipment shipment = new Shipment();
        //List<Item> items = new ArrayList<>();

        //items.add(IT);
        List<Shipment> shipments = new ArrayList<>();
        shipment.setShipmentType(typeOfShipment);
        //shipments.add(shipmentss);
        List<Address> addresses = new ArrayList<>();
        addresses.add(adrs);
        shipment.setAddresses(addresses);
        ord.setShipments(shipments);
        //ord.setItems(items);
        return ord;
//    System.out.print(ord);
    }

    //
    /*public static Shipment retrieveOrder1(Shipment shipment, String city) {
        //Shipment shpmnet = new Shipment();
        shipment.getAddresses();
        List<Shipment>shipmentss=new ArrayList<>();
        shipmentss.add(shpmnet);
        //System.out.println("The Order is "+ord.getOrderId());
        //Item IT = new Item();
        //IT.setItemId(itemId);
        Address adrs = new Address();
        List<Address> adresses=new ArrayList<>();
        adresses.add(adrs);
        adrs.setCity(city);
        shpmnet.
        //System.out.println("The Item Code is "+IT.getItemId());
        //System.out.println("The City in which it has to deliver "+adrs.getCity());
        //Shipment shipmentss = new Shipment();
        //List<Item> items = new ArrayList<>();

        //items.add(IT);
        //List<Shipment> shipments = new ArrayList<>();
        //shipmentss.setTS(typeOfShipment);
        //shipments.add(shipmentss);
        //List<Address> addresses = new ArrayList<>();
        //addresses.add(adrs);
        //shipmentss.setAddresses(addresses);
        //ord.setShipments(shipments);
        //ord.setItems(items);
        return shpmnet;
//    System.out.print(ord);
    }*/

}