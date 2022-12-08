package com.example.shopexe;

import java.util.ArrayList;

public class Orders {
    private String orderId;
    private ArrayList<Invoice> invoicesList;
    private ArrayList<Product> productList;


    public Orders(String orderId){
        setOrderId(orderId);
        setProductList(new ArrayList<>());
        setInvoicesList(new ArrayList<>());
    }

    public String getOrdersId() { return orderId; }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Product> getProductList() { return productList; }
    public <E> void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Invoice> getInvoicesList() { return invoicesList; }
    public <E> void setInvoicesList(ArrayList<Invoice> invoicesList) {
        this.invoicesList = invoicesList;
    }


    public void addNewProduct(String productCategory, double productPrice, int productStock, String productName) {
        getProductList().add(new Product(productCategory,productName, productPrice,productStock));
        System.out.println(productName + " isimli ürününüz başarılı bir şekilde oluşturulmuştur");
    }

    public void addNewInvoice(String invoicesID, String ordersID, String customersName, double totalOrderPrices) {
        getInvoicesList().add(new Invoice(invoicesID,ordersID,customersName,totalOrderPrices));
        System.out.println(ordersID+" numaralı faturanız başarılı bir şekilde oluşturulmuştur" + "(Fatura no : "+invoicesID+" )");
    }
}
