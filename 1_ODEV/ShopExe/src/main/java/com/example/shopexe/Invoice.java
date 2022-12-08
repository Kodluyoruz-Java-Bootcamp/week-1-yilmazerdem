package com.example.shopexe;

public class Invoice {
    private String invId;
    private String invOrderId;
    private String invCustomerName;
    private double invTotalPrice;

    public Invoice (String invId,String invOrderId,String invCustomerName,double invTotalPrice){
            setInvId(invId);
            setInvOrderId(invOrderId);
            setInvCustomerName(invCustomerName);
            setInvTotalPrice(invTotalPrice);
    }

    public void setInvId(String invId) { this.invId = invId; }

    public String getInvId() { return invId; }

    public void setInvOrderId(String invOrderId) { this.invOrderId = invOrderId; }

    public String getInvOrderId() { return invOrderId; }

    public void setInvCustomerName(String invCustomerName) { this.invCustomerName = invCustomerName; }

    public String getInvCustomerName() { return invCustomerName; }

    public void setInvTotalPrice(double invTotalPrice) { this.invTotalPrice = invTotalPrice; }

    public double getInvTotalPrice() { return invTotalPrice; }
}
