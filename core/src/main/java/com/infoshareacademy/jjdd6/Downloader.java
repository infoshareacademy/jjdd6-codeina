package com.infoshareacademy.jjdd6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Downloader {

    public static void downloadAll() throws IOException {
        for (int i = 1; i <= 10; i++) {
            downloadCryptocurrency(i);
        }
    }
    public static void downloadAllForServer() throws IOException {
        for (int i = 1; i <= 10; i++) {
            downloadCryptocurrencyForServer(i);
        }
    }

    public static void downloader(String urlCsvFile, String fileName) throws IOException {
        URL website = new URL(urlCsvFile);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("csv/" + fileName + ".csv");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
    public static void downloaderForServer(String urlCsvFile, String fileName) throws IOException {
        URL website = new URL(urlCsvFile);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("/home/lukasz-ratajczak/IdeaProjects/jjdd6-codeina/csv/" + fileName + ".csv");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    public static void downloadCryptocurrency(int Crypto) throws IOException {
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
                downloader("https://coinmetrics.io/data/vtc.csv", "vtc");
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
                downloader("https://coinmetrics.io/data/pivx.csv", "pivx");
                break;
        }
    }
        public static void downloadCryptocurrencyForServer(int Crypto) throws IOException {
            switch (Crypto) {
                case 1:
                    downloaderForServer("https://coinmetrics.io/data/btc.csv", "btc");
                    break;
                case 2:
                    downloaderForServer("https://coinmetrics.io/data/bch.csv", "bch");
                    break;
                case 3:
                    downloaderForServer("https://coinmetrics.io/data/ltc.csv", "ltc");
                    break;
                case 4:
                    downloaderForServer("https://coinmetrics.io/data/eth.csv", "eth");
                    break;
                case 5:
                    downloaderForServer("https://coinmetrics.io/data/vtc.csv", "vtc");
                    break;
                case 6:
                    downloaderForServer("https://coinmetrics.io/data/dcr.csv", "dcr");
                    break;
                case 7:
                    downloaderForServer("https://coinmetrics.io/data/zec.csv", "zec");
                    break;
                case 8:
                    downloaderForServer("https://coinmetrics.io/data/dash.csv", "dash");
                    break;
                case 9:
                    downloaderForServer("https://coinmetrics.io/data/doge.csv", "doge");
                    break;
                case 10:
                    downloaderForServer("https://coinmetrics.io/data/pivx.csv", "pivx");
                    break;
            }

    }
}
