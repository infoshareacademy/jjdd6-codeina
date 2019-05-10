package com.infoshareacademy.jjdd6.codeina.cdi;

public class TableInfo {
    private String marketCap;
    private String fullName;
    private String price;
    private String change;
    private String date;
    private boolean growth;

    public boolean isGrowth() {
        return growth;
    }

    public void setGrowth(boolean growth) {
        this.growth = growth;
    }

    public TableInfo(String marketCap, String fullName, String price, String change, String date, boolean growth) {
        this.marketCap = marketCap;
        this.fullName = fullName;
        this.price = price;
        this.change = change;
        this.date = date;
        this.growth = growth;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
