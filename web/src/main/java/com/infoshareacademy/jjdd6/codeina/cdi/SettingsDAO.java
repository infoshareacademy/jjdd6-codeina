package com.infoshareacademy.jjdd6.codeina.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SettingsDAO {

    private Integer decimalPlaces;

    public SettingsDAO(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public SettingsDAO() {
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }
}
