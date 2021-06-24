package com.it.firstapplication.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.it.firstapplication.dto.Order;
import com.it.firstapplication.dto.OrderItem;
import com.it.firstapplication.dto.OrderLookUp;
import com.it.firstapplication.dto.OrderOffer;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class TestService {

    Logger log = LoggerFactory.getLogger(TestService.class);
    @Autowired
    ObjectMapper objectMapper;

    public Order getOrders() {
        Order value = null;
        log.debug("getOrderOffer mtd started    number of lookups are   : {}", value);
        try {
            loadTemplatesFromResources("*.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ObjectMapper mapper = new ObjectMapper();
        //objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        File file = new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");

        try {
            value = objectMapper.readValue(file, Order.class);
            log.debug("getOrderOffer mtd ends  number of lookups after method  are : {}", value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public List<OrderOffer> getOrderOffer() {
        //ObjectMapper mapper = new ObjectMapper();
        //objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        File file = new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");
        Order order = null;
        List<OrderOffer> orderOfferList = null;
        log.debug("getOrderOffer mtd started  number of lookups are reading from the file  : {}", orderOfferList);
        try {
            order = objectMapper.readValue(file, Order.class);
            orderOfferList = order.getOffers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("getOrderOffer mtd ends   number of lookups are   : {}", orderOfferList);
        return orderOfferList;
    }

    public List<OrderLookUp> getOrderLookUp() {
        //ObjectMapper mapper = new ObjectMapper();
        //objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        File file = new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");
        Order order = null;
        List<OrderLookUp> orderLookUps = null;
        log.debug("getOrderLookUp mtd started  number of lookups are reading from the file  : {}", orderLookUps);
        try {
            order = objectMapper.readValue(file, Order.class);
            orderLookUps = order.getLookUps();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("getOrderLookUp mtd ends   number of lookups are  : {}", orderLookUps);
        return orderLookUps;
    }

    // read JSON file and map/convert to java POJ
   /* public List<File> retrieveOrders() {
        //TestService testService = new TestService();
        //List<Order> orderList=new ArrayList<>();

        // read all files from a resources folder
        List<File> fileList1 = null;
        try {
            // files from src/main/resources/json
            //List<File> orderList = testService.getAllFilesFromResource(".json");
            //List<Order> orderList1= null;
            //List<File> orderList1=null;
            List<File> fileList = getAllFilesFromResource("json");
            //List<File> fileList1= new ArrayList<>();
            //List<File> fileList1 = null;
            for (File file : fileList) {
                //orderList = order1 ;

                System.out.println("file : " + file);
                printFile(file);
                fileList1.add(file);
            }

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return fileList1;
    }

    private List<File> getAllFilesFromResource(String folder)
            throws URISyntaxException, IOException {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(folder);

        // dun walk the root path, we will walk all the classes
        List<File> collect = Files.walk(Paths.get(resource.toURI()))
                .filter(Files::isRegularFile)
                .map(x -> x.toFile())
                .collect(Collectors.toList());

        return collect;
    }

    // print a file
    private static void printFile(File file) {

        List<String> orderList;
        try {
            orderList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            orderList.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
*/
    protected void loadTemplatesFromResources(String fileFormat) throws IOException {
        PathMatchingResourcePatternResolver pathMatchResResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchResResolver.getResources(fileFormat);
        List<Order> listOfOrder = new ArrayList<>();
        log.debug("loadTemplatesFromResources mtd started  number of orders : {}", listOfOrder);
        //orderList(listOfOrder);
        for (Resource res : resources) {
            File f = new File(res.getURI());
            InputStream targetStream = new FileInputStream(f);
            //targetStream.toString();
            Order order = objectMapper.readValue(targetStream, Order.class);
            //listOfOrder.add(order);
            System.out.println(order);
            log.debug("loadTemplatesFromResources mtd ends  number of orders : {}", listOfOrder);
            //System.out.println("Loading from file : " + res.getURI());
            //objectMapper.readValue()
            /*logger.debug("Loading from file : " + res.getURI());
            if(fileFormat.endsWith("json")){
                loadTemplateByName(orderObj, res.getFilename());
            }else{
                String jsonString = new String(Files.readAllBytes(Paths.get(res.getURI())));
                Render render = objectMapper.readTree(jsonString, Render.class);
                renderObj.getRenderTemplateList().addAll(render.getRenderTemplateList());
                log.debug("Loading the xapi template {} json {}", res.getFilename(), jsonString);
            }*/

        }

    }

    private List<Order> processingOrders(String fileFormat) throws IOException {
        PathMatchingResourcePatternResolver pathMatchResResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchResResolver.getResources(fileFormat);
        List<Order> orderList = new ArrayList<>();
        log.debug("processingOrders mtd started and retreived number of orders : {}", orderList);

      /*  for (Resource res : resources) {
            File file = new File(res.getURI());
            Order order = objectMapper.readValue(file, Order.class);
            orderList.add(order);
        }*/
        Arrays.stream(resources).forEach(resource -> {
            try {
                File file = new File(resource.getURI());
                Order order = objectMapper.readValue(file, Order.class);
                orderList.add(order);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        log.debug("processingOrders mtd ends  and retreived number of orders : {}", orderList);
        return orderList;
    }

    BiPredicate<Order, String> itemCodePredicate = (order, itemCode) ->
            order.getItems().stream().anyMatch(orderItem -> orderItem.getItemCode().equals(itemCode));
    BiPredicate<Order, String> offerIdPredicate = (order, offerId) ->
            order.getLookUps().stream().anyMatch(orderLookUp -> orderLookUp.getOfferId().equals(offerId));

    Predicate<Order> disAllowedPredicate = order ->
            order.getItems().stream()
                    .filter(item -> Objects.nonNull(item.getDiscountAllowed()))
                    .anyMatch(orderItem -> orderItem.getDiscountAllowed().equals(true));

    public List<Order> fetchOrdersByOrderId(String code, String id) {
        log.debug("fetchOrdersByOrderId mtd started code : {}, id : {}", code, id);
        // List<Order> filteredOrders = new ArrayList<>();
        // List<Order> filteredOrderByOrderId = new ArrayList<>();
        List<Order> orderList = null;
        try {
            List<Order> processedOrders = processingOrders("*.json");

           /* List<Order> orderByItemCode = processedOrders.stream().filter(order -> {
                return order.getItems().stream().anyMatch(orderItem -> orderItem.getItemCode().equals(code));
            }).collect(Collectors.toList());
            orderList = orderByItemCode.stream().filter(order -> {
                return order.getLookUps().stream().anyMatch(orderLookUp -> orderLookUp.getOfferId().equals(id));
            }).collect(Collectors.toList());*/

            orderList = processedOrders.stream()

                    .filter(order -> itemCodePredicate.test(order, code))
//                    .filter(order -> disAllowedPredicate.test(order))
                    //.filter(disAllowedPredicate)
                    .filter(order -> offerIdPredicate.test(order, id)
                            //return order.getLookUps().stream().anyMatch(orderLookUp -> orderLookUp.getOfferId().equals(id));
                    ).collect(Collectors.toList());
            //log.info("number of orders : {}",orderList);
            //orderList = orderById;
            /*for (Order order : processedOrders) {
                for (OrderItem orderItem : order.getItems()) {
                    if (orderItem.getItemCode().equals(code)) {
                        filteredOrders.add(order);
                    }
//                    for (OrderLookUp orderLookUp : order.getLookUps()) {
//                    if (orderLookUp.getOfferId().equals(id)&&orderItem.getItemCode().equals(code)){
//                        filteredOrders.add(order);
//                    }
//                    }
                }
            }*/
            /*for (Order order : filteredOrders) {
                for (OrderLookUp orderLookUp : order.getLookUps()) {
                    if (orderLookUp.getOfferId().equals(id)) {
                        filteredOrderByOrderId.add(order);
                    }
                }
            }*/
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return orderList;
            /*List<Order> orderList = processedOrders.stream().filter(order -> {
                return order.getLookUps().stream().anyMatch(lookUp -> lookUp.getOfferId().equals(id));
            }).collect(Collectors.toList());
            return orderList;
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        // ObjectMapper mapper = new ObjectMapper();
        // mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        /*File file = new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");
        try {
            value = objectMapper.readValue(file, Order.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;*/
        //return filteredOrders;
    }
    // private static List<Order>  orderList(List<Order> orderList)
}