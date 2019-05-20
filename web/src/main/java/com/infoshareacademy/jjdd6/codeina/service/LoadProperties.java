package com.infoshareacademy.jjdd6.codeina.service;

import javax.ejb.Stateless;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Stateless
public class LoadProperties {

    private static final Logger logger = Logger.getLogger(LoadProperties.class.getName());

    public String getTempDirectory() throws IOException {
        FileHandler fileHandler = new FileHandler(System.getProperty("java.io.tmpdir") + "/userslogs.log", true);
        logger.addHandler(fileHandler);

        logger.info("Temp dir: " + System.getProperty("java.io.tmpdir"));
        return System.getProperty("java.io.tmpdir") + "/";
    }
}
