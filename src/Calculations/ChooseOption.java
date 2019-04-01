package Calculations;

import java.util.Scanner;

public class ChooseOption {

    public void choose() {

        System.out.println("What You want to see ?");
        System.out.println("1. Average price ");
        System.out.println("2. Highest / Lowest price ");
        System.out.println("3. Mediana ");

        MatematicOperations matematicOperations = new MatematicOperations();

        Scanner sc = new Scanner(System.in);
        Integer option = sc.nextInt();

        switch (option) {
            case 1:
                option.equals(1);
                matematicOperations.average();
                break;

            case 2:
                option.equals(2);
                matematicOperations.extremsValue();
                break;

            case 3:
                option.equals(3);
                matematicOperations.median();
                break;

            default:
                System.out.println("Choose again, wrong number!");
                choose();
        }

    }
}
