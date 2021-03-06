package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Singleton
@Startup
public class InitialDataProvider {

    private static final Logger logger = Logger.getLogger(InitialDataProvider.class.getName());

    @PostConstruct
    public void init() throws IOException {
        FileHandler fileHandler = new FileHandler(System.getProperty("java.io.tmpdir") + "/userslogs.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
        try {
            Downloader.downloadAllForServer();
            logger.info("Downloaded all csv files :)");
        } catch (Exception e) {
            logger.warning("Error while loading data: " + e);
        }
    }
}

