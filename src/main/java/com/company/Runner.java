package com.company;

import java.io.FileNotFoundException;

public class Runner {
    private int con = 1;
    private int crypto = 0;
    private int option = 0;

    public void run() throws FileNotFoundException, InterruptedException {

        Inteface inteface = new Inteface();
        Options options = new Options();
        while (con != 0) {
            try {
                if (con == 1) {
                    crypto = inteface.menu();
                    if (crypto <= 10) {
                        Downloader.download(crypto);
                        inteface.Logo(crypto);
                        con = 2;
                    } else {
                        con = 10;
                    }
                }
                if (con == 2) {
                    option = inteface.Options();
                    if (option == 1) {
                        options.Option1(crypto);
                        con = 9;
                    } else if (option == 2) {
                        options.Option2(crypto);
                        con = 9;
                    } else if (option == 3) {
                        options.Option3(crypto);
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
                    if (crypto == 0) {
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