    package Calculations;

    import java.util.Scanner;

    public class ChooseOption {

        public void choose() {

            System.out.println("Jakie dzialanie chcialbys wykonac ?");
            System.out.println("1. Srednia cena ");
            System.out.println("2. Najwyzsza i najnizsza wartosc ");
            System.out.println("3. Mediana ");

            MatematicOperations matematicOperations = new MatematicOperations();

            Scanner sc = new Scanner(System.in);
            Integer option = sc.nextInt();

            switch (option) {
                case 1:
                    option.equals(1);
                    matematicOperations.average();

                case 2:
                    option.equals(2);
                    matematicOperations.extremsValue();


            }

        }
}
