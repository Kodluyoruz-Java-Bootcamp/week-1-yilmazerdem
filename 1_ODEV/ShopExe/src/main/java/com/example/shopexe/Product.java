package com.example.shopexe;

public class Product {

    private String pCategory;
    private String pName;
    private double pPrice;
    private int pStock;
    private int pCount=0;

    public Product (String pCategory,String pName,double pPrice,int pStock){
        setpCategory(pCategory);
        setpName(pName);
        setpPrice(pPrice);
        setpStock(pStock);
        setpCount(getpCount() + 1);
    }
    public void setpCategory(String pCategory) { this.pCategory = pCategory; }

    public String getpCategory() {
        return pCategory;
    }

    public void setpName(String pName) { this.pName = pName; }

    public String getpName() { return pName; }

    public void setpPrice(double pPrice) { this.pPrice = pPrice; }

    public double getpPrice() { return pPrice; }

    public void setpStock(int pStock) { this.pStock = pStock; }

    public int getpStock() { return pStock; }

    public int getpCount() { return pCount; }

    public void setpCount(int pCount) { this.pCount = pCount; }
}
