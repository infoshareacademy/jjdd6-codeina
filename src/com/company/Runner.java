package com.company;

import java.io.FileNotFoundException;

public class Runner {
    public void Run() throws FileNotFoundException, InterruptedException {

        Inteface inteface = new Inteface();
        int con = 1;
        int Crypto = 0;
        int Option = 0;

        while (con != 0) {
            if (con == 1) {
                Crypto = inteface.Menu();
                if (Crypto <= 10) {
                    inteface.Logo(Crypto);
                    con = 2;
                } else {
                    System.out.println("ERROR");
                    con = 0;
                }
            }


            if (con == 2) {
                Option = inteface.Options();
                inteface.Option1(Crypto);
            }

            int Exit = inteface.Exit();
            if (Exit == 9) {
                con = 0;
            } else if (Exit == 1) {
                con = 1;
            } else if (Exit == 2) {
                con = 2;
            }

        }
    }
}