package com.example.shopexe;

import java.util.ArrayList;

public class Customer {

        private String cId;
        private String cName;
        private int cAge;
        private String CId;
        private String CName;
        private int CAge;
        private static int CTotalCustomer =0;
        private ArrayList<Orders> ordersList;

        public Customer (String cName,String cId,int cAge){
                setCId(cId);
                setCName(cName);
                setCAge(cAge);
                setCTotalCustomer(CTotalCustomer+1);
                setOrdersList(new ArrayList<>());
        }

        private int getCustomersTotalProductCount(Orders order){
                int tmpTotal = 0;

                if (order != null)
                        for (int i = 0; i < order.getProductList().size(); i++)
                                tmpTotal += order.getProductList().get(i).getpCount();

                return tmpTotal;
        }
        private int getTotalNumberofProductsfromCustomers(Orders orders) {
                int tmpTotal = 0;

                if (orders != null)
                        for (int i = 0; i < orders.getProductList().size(); i++)
                                tmpTotal += orders.getProductList().get(i).getpCount();

                return tmpTotal;
        }
        private double getTotalOrderPrices(String orderID) {
                Orders orders = findOrders(orderID);
                double totalPrice=0;
                if(orders!=null){
                        for (int i=0; i<orders.getProductList().size();i++){
                                totalPrice+= orders.getProductList().get(i).getpPrice();
                        }
                }
                return totalPrice;
        }

        public static void getCustomersForSpecificPayment(double paymentThreshold, ArrayList<Customer> customerArrayList){
                System.out.println(" Ödeme Tutar : " + paymentThreshold + " 'da fazla olan kişiler");

                for (int i = 0; i < customerArrayList.size() && customerArrayList.size() > 0; i++){
                        ArrayList<Orders> tmpOrderList = customerArrayList.get(i).getOrderList();

                        for (int m = 0; m < tmpOrderList.size() && tmpOrderList.size() > 0; m++){
                                ArrayList<Invoice> tmpInvoiceList = tmpOrderList.get(m).getInvoicesList();

                                for (int n = 0; n < tmpInvoiceList.size() && tmpInvoiceList.size() > 0; n++){
                                        if (tmpInvoiceList.get(n).getInvTotalPrice() > paymentThreshold)
                                                System.out.println("\t\t"+ "Bilgi : " + tmpInvoiceList.get(n).getInvCustomerName() + " - Tutar : "
                                                        + paymentThreshold);
                                }
                        }
                }
        }

        public static double printConditionalInvoiceList(ArrayList<Customer> customerArrayList,String customerName,int startAge,int endAge){
                double totalPrice=0;
                for (int i = 0; i < customerArrayList.size() && customerArrayList.size() > 0; i++){
                        if (customerArrayList.get(i).getCAge() > startAge &&
                                customerArrayList.get(i).getCAge() < endAge &&
                                customerArrayList.get(i).getCName().equalsIgnoreCase(customerName)) {

                                ArrayList<Orders> tmpOrderList = customerArrayList.get(i).getOrderList();

                                for (int j = 0; j < tmpOrderList.size() && tmpOrderList.size() > 0; j++) {
                                        ArrayList<Invoice> tmpInvoiceList = tmpOrderList.get(j).getInvoicesList();

                                        for (int k = 0; k < tmpInvoiceList.size() && tmpInvoiceList.size() > 0; k++) {
                                                totalPrice += tmpInvoiceList.get(k).getInvTotalPrice();
                                        }
                                }
                        }
                }
                return totalPrice;
        }

        public void printOrderList(String orderID){
                Orders order = findOrder(orderID);

                if (order != null){
                        System.out.println("\n-----" + getCName() + " Sipariş Listesi");
                        System.out.println("Ürün Adı | Ürün Fiyatı");
                        ArrayList<Product> orderProductList = order.getProductList();

                        for (Product product : orderProductList)
                                System.out.println(product.getpName() + " \t " + product.getpPrice() + "\t");
                }
        }

        private Orders findOrder(String orderID){
                for (int i = 0; i < getOrderList().size(); i++){
                        if (getOrderList().get(i).getOrdersId().equalsIgnoreCase(orderID))
                                return getOrderList().get(i);
                }

                return null;
        }

        private Orders findOrders(String orderID){
                for (int i=0;i < getOrderList().size();i++){
                        if (getOrderList().get(i).getOrdersId().equalsIgnoreCase(orderID))
                                return getOrderList().get(i);
                }
                return null;
        }

        public void findTotalProductNumberofCustomers(String orderID){
                Orders orders = findOrders(orderID);
                if(orders != null){
                        System.out.println("\n"+"Toplam sipariş sayısı" + getTotalNumberofProductsfromCustomers(orders) +
                                " / Toplam Ödeme : "+getTotalOrderPrices(orderID));
                }
        }

        public void addOrders(String orderID){
                if(findOrders(orderID) == null){
                        getOrderList().add(new Orders(orderID));
                        System.out.println("");
                }
        }

        public void addProduct(String orderID,String productCategory,String productName,double productPrice,int productStock ){
                Orders orders = findOrders(orderID);
                if (orders != null){
                        orders.addNewProduct(productCategory,productPrice,productStock,productName);
                }
        }

        public void addInvoice(String invoicesID, String ordersID, String customersName){
                Orders orders = findOrders(ordersID);
                if (orders!=null){
                        orders.addNewInvoice(invoicesID,ordersID,customersName,getTotalOrderPrices(ordersID));
                }
        }

        public void setCId(String cId) { this.CId = cId; }

        public String getCId() { return CId; }

        public void setCName(String cName) { this.CName = cName; }

        public String getCName() { return CName; }

        public void setCAge(int cAge) { this.CAge = cAge; }

        public int getCAge() { return CAge; }

        public void setCTotalCustomer(int cTotalCustomer) { Customer.CTotalCustomer = cTotalCustomer; }

        public static int getCTotalCustomer() { return CTotalCustomer; }

        public void setOrdersList(ArrayList<Orders> orderList) { this.ordersList = orderList; }

        public ArrayList<Orders> getOrderList() { return ordersList; }
}
