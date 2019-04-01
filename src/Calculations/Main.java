package Calculations;

import com.company.CryptoCurrency;

public class Main {

    public static void main(String[] args) {

        CryptoCurrency cryptoCurrency = new CryptoCurrency();

        Double price = cryptoCurrency.getPrice();
        System.out.println(price);



    }
}
