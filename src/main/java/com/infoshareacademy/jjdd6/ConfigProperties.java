package com.infoshareacademy.jjdd6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Properties;

public class ConfigProperties {
    public static SimpleDateFormat originRegionSet(int originRegion) {
         String pattern = "yyyy-MM-dd";

        SimpleDateFormat simpleDateFormat = null;
        try (
                InputStream input = new FileInputStream("/home/lukasz-ratajczak/IdeaProjects/jjdd6-codeina/src/main/resources/config.properties")) {

            Properties prop = new Properties();
            prop.load(input);
            simpleDateFormat = new SimpleDateFormat(pattern);
            if (originRegion == 1){
                pattern = prop.getProperty("dateFormatUS");
                simpleDateFormat.applyPattern(pattern);
            }

            if (originRegion == 2) {
                pattern = prop.getProperty("dateFormatEU");
                simpleDateFormat.applyPattern(pattern);
            }

        } catch (
                IOException ex) {
            ex.printStackTrace();
        }

        return simpleDateFormat;
    }
}