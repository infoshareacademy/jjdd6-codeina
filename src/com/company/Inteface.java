package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inteface {

    public int Menu() {


        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Wybierz Kryptowalute:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Bitcoin");


        System.out.println("----------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int clientAnswerMenu = input.nextInt();

        for (int i = 0; i <= 20; i++) {
            System.out.println("\n");
        }
        return clientAnswerMenu;
    }
    public int Options(){

        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Co chcesz zrobic:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Wyswietlic obecna cene");


        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerOptions = input.nextInt();

        for (int i = 0; i <= 20; i++) {
            System.out.println("\n");
        }

        return clientAnswerOptions;

    }

    public int Exit(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Co chcesz zrobic:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Zamknac program");
        System.out.println("2) Wrocic do wyboru kryptowaluty");
        System.out.println("3) Wrocic do wyboru Opcji");



        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerExit = input.nextInt();

        return clientAnswerExit;
    }

    public void Option1(int Crypto) throws FileNotFoundException, InterruptedException {
        LoadingData loadingData = new LoadingData();
        Logo logo = new Logo();

        if(Crypto == 1){


            logo.printLogo(logo.bitcoinLogo);}
        System.out.println(" ");
        loadingData.printInformationFromLastLineOfCSV("btc.csv");


    }

}
