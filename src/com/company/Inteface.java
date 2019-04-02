package com.company;

import java.util.Scanner;

public class Inteface {

    public int Menu() {


        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Choose Cryptocurrency:");
        System.out.println("----------------------------------------------------------------");
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

        System.out.println("----------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int clientAnswerMenu = input.nextInt();
        emptySpacer();
        return clientAnswerMenu;
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

        System.out.println("----------------------------------------------------------------");
        System.out.println("                   What you want to do:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Show the last price");
        System.out.println("2) Show the price at given day");


        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerOptions = input.nextInt();
        emptySpacer();
        return clientAnswerOptions;

    }

    public int Exit() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   What you want to do:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Return to Cryptocurrency selection");
        System.out.println("2) Return to Option selection");
        System.out.println("9) Exit");


        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerExit = input.nextInt();
        emptySpacer();
        if (clientAnswerExit == 9) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("                        Have a nice day!");
            System.out.println("----------------------------------------------------------------");
        }
        return clientAnswerExit;
    }

    public static void emptySpacer() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("\n");
        }
    }

//    public static void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }

    public void error() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                ERROR! You chose wrong option.");
        System.out.println("----------------------------------------------------------------");
    }


}
