package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.IOException;

@Singleton
@Startup
public class DownloaderForOurWildfly {

    public static void main(String[] args) throws IOException {
        Downloader.downloadAll();
        Downloader.downloadAllForServer();
    }

    @Schedule(hour = "09", minute = "30", second = "30", info = "Download all cryptocurrencies")
    public void downloader() throws IOException {
        Downloader.downloadAllForServer();
    }
}

