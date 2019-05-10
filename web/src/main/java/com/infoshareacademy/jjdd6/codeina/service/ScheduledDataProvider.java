package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import java.io.IOException;
import java.util.logging.Logger;

@Singleton
public class ScheduledDataProvider {

    private static final Logger logger = Logger.getLogger(ScheduledDataProvider.class.getName());

    @Schedule(hour = "03", minute = "37", second = "02", info = "Download all cryptocurrencies.ftlh")
    public void downloader() throws IOException {
        try{
        Downloader.downloadAllForServer();
        logger.info("Files were downloaded ;-))");
    } catch (Exception e) {
        logger.warning("Error while loading data: " + e);
    }
    }
}

