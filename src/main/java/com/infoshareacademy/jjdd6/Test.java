package com.infoshareacademy.jjdd6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException {

        InputStream input = new FileInputStream("/home/lukasz-ratajczak/IdeaProjects/jjdd6-codeina/src/main/resources/config.properties");

            Properties prop = new Properties();
            prop.load(input);

        System.out.println(prop.getProperty("dateFormatEU"));
    }
}
