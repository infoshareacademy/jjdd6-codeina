package com.company;

import java.util.Scanner;

public class Inteface {

    public int menu() {


        Inteface.printLine();
        System.out.println("                   Choose Cryptocurrency:");
        Inteface.printLine();
        System.out.println("1) Bitcoin");
        System.out.println("2) Bitcoin Cash");
        System.out.println("3) Litecoin");
        System.out.println("4) Ethereum");
        System.out.println("5) NEM");
        System.out.println("6) Decred");
        System.out.println("7) ZCash");
        System.out.println("8) Dash");
        System.out.println("9) Dogecoin");
        System.out.println("10) Ethereum Classic");
        Inteface.printLine();

        return scanValueFromKeyboardWithCleaner();
    }

    public void Logo(int Crypto) throws InterruptedException {
        Logo logo = new Logo();
        switch (Crypto) {
            case 1:
                logo.printLogo(logo.bitcoinLogo);
                break;
            case 2:
                logo.printLogo(logo.bitcoinCashLogo);
                break;
            case 3:
                logo.printLogo(logo.litecoinLogo);
                break;
            case 4:
                logo.printLogo(logo.ethereumLogo);
                break;
            case 5:
                logo.printLogo(logo.nemLogo);
                break;
            case 6:
                logo.printLogo(logo.decredLogo);
                break;
            case 7:
                logo.printLogo(logo.zCashLogo);
                break;
            case 8:
                logo.printLogo(logo.dashLogo);
                break;
            case 9:
                logo.printLogo(logo.dogeCoinLogo);
                break;
            case 10:
                logo.printLogo(logo.ethereumClassicLogo);
                break;
        }
    }

    public int Options() {

        Inteface.printLine();
        System.out.println("                   What you want to do:");
        Inteface.printLine();
        System.out.println("1) Show the last price");
        System.out.println("2) Show the price at given day");
        System.out.println("3) Show prices at given dates");


        Inteface.printLine();
        return scanValueFromKeyboardWithCleaner();
    }

    public int Exit() {
        Inteface.printLine();
        System.out.println("                   What you want to do:");
        Inteface.printLine();
        System.out.println("1) Return to Cryptocurrency selection");
        System.out.println("2) Return to Option selection");
        System.out.println("9) Exit");


        Inteface.printLine();
        int clientAnswerExit = scanValueFromKeyboardWithCleaner();
        if (clientAnswerExit == 9) {
            clearScreen();
            Inteface.printLine();
            System.out.println("                        Have a nice day!");
            Inteface.printLine();
        }
        return clientAnswerExit;
    }

//    public static void emptySpacer() {
//        for (int i = 0; i <= 20; i++) {
//            System.out.println("\n");
//        }
//    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void error() {
        Inteface.printLine();
        System.out.println("                ERROR! You chose wrong option.");
        Inteface.printLine();
    }

    public int scanValueFromKeyboardWithCleaner() {
        Scanner input = new Scanner(System.in);
        int clientAnswerMenu = input.nextInt();
        clearScreen();
        return clientAnswerMenu;
    }

    public static void printLine() {
        System.out.println("----------------------------------------------------------------");
    }
}
