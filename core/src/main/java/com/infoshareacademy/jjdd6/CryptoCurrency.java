package com.infoshareacademy.jjdd6;

import java.time.LocalDate;

public class CryptoCurrency {
    private Double price;
    private LocalDate date;

    public CryptoCurrency() {

    }

    public CryptoCurrency(Double price, LocalDate date) {
        this.price = price;
        this.date = date;
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
}