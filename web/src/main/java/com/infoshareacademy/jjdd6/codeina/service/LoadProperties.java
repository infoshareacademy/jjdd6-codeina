package com.infoshareacademy.jjdd6.codeina.service;

import javax.ejb.Stateless;
import java.io.IOException;
import java.util.Properties;

@Stateless
public class LoadProperties {

    private static final String SETTINGS_FILE = "settings.properties";

    public String getSettingsFile() throws IOException {
        Properties prop = new Properties();
        prop.load(Thread.currentThread()
                .getContextClassLoader().getResource(SETTINGS_FILE).openStream());

        return (String) prop.get("csvFilePath");
    }
}
