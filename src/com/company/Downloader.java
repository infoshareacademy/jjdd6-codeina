package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Downloader {

    public static void downloader(String urlCsvFile, String fileName) throws IOException {
        URL website = new URL(urlCsvFile);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("csv/" + fileName + ".csv");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    public static void download(int Crypto) throws IOException {
        switch (Crypto) {
            case 1:
                downloader("https://coinmetrics.io/data/btc.csv", "btc");
                break;
            case 2:
                downloader("https://coinmetrics.io/data/bch.csv", "bch");
                break;
            case 3:
                downloader("https://coinmetrics.io/data/ltc.csv", "ltc");
                break;
            case 4:
                downloader("https://coinmetrics.io/data/eth.csv", "eth");
                break;
            case 5:
                downloader("https://coinmetrics.io/data/xem.csv", "xem");
                break;
            case 6:
                downloader("https://coinmetrics.io/data/dcr.csv", "dcr");
                break;
            case 7:
                downloader("https://coinmetrics.io/data/zec.csv", "zec");
                break;
            case 8:
                downloader("https://coinmetrics.io/data/dash.csv", "dash");
                break;
            case 9:
                downloader("https://coinmetrics.io/data/doge.csv", "doge");
                break;
            case 10:
                downloader("https://coinmetrics.io/data/etc.csv", "etc");
                break;
        }

    }
}
