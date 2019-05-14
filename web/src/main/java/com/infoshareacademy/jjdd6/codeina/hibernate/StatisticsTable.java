package com.infoshareacademy.jjdd6.codeina.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "STATISTICS")
@NamedQueries({
        @NamedQuery(
                name = "StatisticsTable.getValue",
                query = "SELECT it FROM StatisticsTable it where it.shortName LIKE :shortName "
        )
})
public class StatisticsTable {

    @Id
    @Column(name = "shortName", length = 16)
    private String shortName;

    @Column(name = "number", length = 16)
    private int number;

    @Column(name = "fullName", length = 16)
    private String fullName;

    public StatisticsTable() {
    }

    public StatisticsTable(String shortName, int number, String fullName) {
        this.shortName = shortName;
        this.number = number;
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
