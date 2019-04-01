package com.company;

import java.io.FileNotFoundException;

public class Runner {
    private int con = 1;
    private int Crypto = 0;
    private int Option = 0;

    public void Run() throws FileNotFoundException, InterruptedException {

        Inteface inteface = new Inteface();
        Options options = new Options();
        while (con != 0) {
            try {
                if (con == 1) {
                    Crypto = inteface.Menu();
                    if (Crypto <= 10) {
                        Downloader.download(Crypto);
                        inteface.Logo(Crypto);
                        con = 2;
                    } else {
                        con = 10;
                    }
                }
                if (con == 2) {
                    Option = inteface.Options();
                    if (Option == 1) {
                        options.Option1(Crypto);
                        con = 9;
                    } else {
                        con = 10;
                    }
                }
                if (con == 9) {
                    int Exit = inteface.Exit();
                    if (Exit == 9) {
                        con = 0;
                    } else if (Exit == 1) {
                        con = 1;
                    } else if (Exit == 2) {
                        con = 2;
                    } else {
                        con = 10;
                    }
                }
                if (con == 10) {
                    inteface.error();
                    if (Crypto == 0) {
                        con = 1;
                    } else {
                        con = 9;
                    }
                }
            } catch (Exception InputMismatchException) {
                con = 10;
            }
        }
    }
}