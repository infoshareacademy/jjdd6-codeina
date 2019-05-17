package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Logger;

@Singleton
@Startup
public class InitialDataProvider {

    private static final Logger logger = Logger.getLogger(InitialDataProvider.class.getName());

    @PostConstruct
    public void init() {
        try {
            Downloader.downloadAllForServer();
            logger.info("Downloaded all csv files :)");
        } catch (Exception e) {
            logger.warning("Error while loading data: " + e);
        }
    }
}

