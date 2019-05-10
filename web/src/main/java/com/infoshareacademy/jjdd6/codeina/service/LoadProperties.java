package com.infoshareacademy.jjdd6.codeina.service;

import javax.ejb.Stateless;
import java.util.logging.Logger;

@Stateless
public class LoadProperties {

    private static final Logger logger = Logger.getLogger(LoadProperties.class.getName());

    public String getTempDirectory() {
        logger.info("Temp dir: " + System.getProperty("java.io.tmpdir"));
        return System.getProperty("java.io.tmpdir") + "/";
    }
}
