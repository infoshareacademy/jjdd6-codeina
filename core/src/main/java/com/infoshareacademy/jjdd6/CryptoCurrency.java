package com.infoshareacademy.jjdd6;

import java.time.LocalDate;

public class CryptoCurrency {
    private Double price;
    private LocalDate date;
    private Double marketCap;

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public CryptoCurrency() {

    }

    public CryptoCurrency(Double price, LocalDate date) {
        this.price = price;
        this.date = date;
    }

    public CryptoCurrency(Double price, LocalDate date,Double marketCap) {
        this.price = price;
        this.date = date;
        this.marketCap=marketCap;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CryptoCurrency{" +
                "price=" + price +
                ", date=" + date +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + price.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof CryptoCurrency))
            return false;
        CryptoCurrency cryptoCurrency = (CryptoCurrency) obj;
        return cryptoCurrency.getDate() == this.getDate()
                && cryptoCurrency.getPrice().equals(this.getPrice());
    }
}