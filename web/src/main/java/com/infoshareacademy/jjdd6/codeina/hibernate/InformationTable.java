package com.infoshareacademy.jjdd6.codeina.hibernate;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "INFORMATIONS")
@NamedQueries({
        @NamedQuery(
                name = "InformationTable.getNewestDate",
                query = "SELECT it FROM InformationTable it where it.shortName LIKE :shortName order by it.date desc"
        ),
        @NamedQuery(
                name = "InformationTable.getAllCryptoCurrencies",
                query = "SELECT it FROM InformationTable it where it.shortName LIKE :shortName order by it.date "
        ),
})
public class InformationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "shortName", length = 16)
    @NotNull
    private String shortName;

    @Column(name = "fullName", length = 16)
    @NotNull
    private String fullName;

    @Column(name = "price", length = 16)
    @NotNull
    private Double price;

    @Column(name = "marketCap", length = 16)
    @NotNull
    private Double marketCap;

    @Column(name = "date", length = 16)
    @NotNull
    private LocalDate date;

    public InformationTable(@NotNull String shortName, @NotNull String fullName, @NotNull Double price, @NotNull Double marketCap, @NotNull LocalDate date) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.price = price;
        this.marketCap = marketCap;
        this.date = date;
    }

    public InformationTable() {
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
