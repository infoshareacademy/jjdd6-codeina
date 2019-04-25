package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;

import java.io.IOException;

public class DownloaderForOurWildfly {
    public static void main(String[] args) throws IOException {
        Downloader.downloadAll();
    }
}
