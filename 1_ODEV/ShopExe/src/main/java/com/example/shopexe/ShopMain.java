package com.example.shopexe;

import java.util.ArrayList;
import java.util.Date;

public class ShopMain {

    public static void main(String[] args) {

        Customer cem = new Customer("Cem", "C001", 27);
        String  cemOrderId = "ORD001";
        cem.addOrders(cemOrderId);
        cem.addProduct(cemOrderId, "TELEFON", "ALCATEL", 1500.0, 55);
        cem.addProduct(cemOrderId, "TELEVİZYON", "SONY\t", 2500.0, 47);
        cem.addProduct(cemOrderId, "BİLGİLSAYAR", "TOSHIBA", 2999.99, 35);
        cem.printOrderList(cemOrderId);
        cem.findTotalProductNumberofCustomers(cemOrderId);
        String cemInvoiceID = "INV001";
        cem.addInvoice(cemInvoiceID, cemOrderId, "Cem");
        System.out.println("--------------------BAŞARILI-----------------");

        Customer cem02 = new Customer("Cem", "C001", 35);
        String  cem02OrderId = "ORD002";
        cem.addOrders(cemOrderId);
        cem.addProduct(cemOrderId, "MASA", "ALCATEL", 1000.00, 8);
        cem.addProduct(cemOrderId, "BUZDOLABI", "SABA\t", 3000.00, 12);
        cem.addProduct(cemOrderId, "TEYP", "TOSHIBA", 999.99, 15);
        cem.printOrderList(cemOrderId);
        cem.findTotalProductNumberofCustomers(cemOrderId);
        String cem02InvoiceID = "INV002";
        cem.addInvoice(cemInvoiceID, cemOrderId, "Cem");
        System.out.println("--------------------BAŞARILI-----------------");

        Customer cem03 = new Customer("Cem", "C001", 19);
        String  cem03OrderId = "ORD003";
        cem.addOrders(cemOrderId);
        cem.addProduct(cemOrderId, "KULAKLIK", "JBL", 299.99, 5);
        cem.addProduct(cemOrderId, "TELEVESİON", "HIKING\t", 499.00, 6);
        cem.addProduct(cemOrderId, "DOLAP", "NG A.Ş.", 599.99, 7);
        cem.printOrderList(cemOrderId);
        cem.findTotalProductNumberofCustomers(cemOrderId);
        String cem03InvoiceID = "INV003";
        cem.addInvoice(cemInvoiceID, cemOrderId, "Cem");
        System.out.println("--------------------BAŞARILI-----------------");

        Customer cem04 = new Customer("Cem", "C001", 19);
        String  cem04OrderId = "ORD004";
        cem.addOrders(cemOrderId);
        cem.addProduct(cemOrderId, "EV DEKORU", "VAZO", 2999.99, 5);
        cem.addProduct(cemOrderId, "SOUNDBAR", "LG\t", 4799.00, 6);
        cem.addProduct(cemOrderId, "DİZÜSTÜ", "GAMEGARAJ", 599.99, 7);
        cem.printOrderList(cemOrderId);
        cem.findTotalProductNumberofCustomers(cemOrderId);
        String cem04InvoiceID = "INV004";
        cem.addInvoice(cemInvoiceID, cemOrderId, "Cem");
        System.out.println("--------------------BAŞARILI-----------------");

        Customer erdem = new Customer("Cem", "C001", 19);
        String  erdemOrderId = "ORD004";
        cem.addOrders(cemOrderId);
        cem.addProduct(cemOrderId, "EV DEKORU", "TAVA", 2999.99, 5);
        cem.addProduct(cemOrderId, "SOUNDBAR", "MKVISION\t", 4799.00, 6);
        cem.addProduct(cemOrderId, "DİZÜSTÜ", "MONSTER", 599.99, 7);
        cem.printOrderList(cemOrderId);
        cem.findTotalProductNumberofCustomers(cemOrderId);
        String erdemInvoiceID = "INV004";
        cem.addInvoice(cemInvoiceID, cemOrderId, "Cem");
        System.out.println("------------------------------------------------");


        ArrayList<Customer> customerArrayList = new ArrayList<>();
        customerArrayList.add(cem);
        customerArrayList.add(cem04);
        customerArrayList.add(cem02);
        customerArrayList.add(cem03);
        customerArrayList.add(erdem);
        System.out.println("\n 25 ile 30 yaş arası olan Cem isimli müşterilerin tüm siparişlerinin toplam fiyatı : " + Customer.printConditionalInvoiceList(customerArrayList,
                "Cem", 25, 30));
        Customer.getCustomersForSpecificPayment(1500.0D, customerArrayList);
        System.out.println("Total Customer: " + Customer.getCTotalCustomer());
        System.out.println("------------------------------------------------");
    }
}
