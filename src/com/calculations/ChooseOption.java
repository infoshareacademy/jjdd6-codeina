package com.calculations;
import com.company.CryptoCurrency;
import com.company.LoadingData;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class ChooseOption {

    public void choose() throws FileNotFoundException {

        System.out.println("Choose analyse period");
        LoadingData loadingData = new LoadingData();

        System.out.println("What You want to see ?");
        System.out.println("1. Average price ");
        System.out.println("2. Highest / Lowest price ");
        System.out.println("3. Mediana ");
        System.out.println("4. Go back to main manu ");

        MatematicOperations matematicOperations = new MatematicOperations();

        Scanner sc = new Scanner(System.in);
        Integer option = sc.nextInt();
//
//        switch (option) {
//            case 1:
//                option.equals(1);
//                matematicOperations.average();
//                choose();
//
//            case 2:
//                option.equals(2);
//                matematicOperations.findExtremeValue();
//                choose();
//
//            case 3:
//                option.equals(3);
//                matematicOperations.median();
//                choose();
//
//            case 4:
//
//            default:
//                System.out.println("Choose again, wrong number!");
//                choose();
//        }

    }
}
