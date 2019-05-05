package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Inject;
import java.io.IOException;

public class DownloaderForOurWildfly {
    public static void main(String[] args) throws IOException {
        Downloader.downloadAll();
    }
}
