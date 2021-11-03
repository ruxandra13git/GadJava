package lab1;

import java.util.Scanner;

public class FooBarQix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Crearea unei instante de tip Scanner
        System.out.println("Write a number: ");
        int nr = scan.nextInt(); //Citirea nr intreg
        System.out.println(compute(nr));
    }

    public static String compute(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Foo";
        }
        if (number % 5 == 0) {
            result += "Bar";
        }
        if (number % 7 == 0) {
            result += "Qix";
        }

        String s_number = String.valueOf(number);

        int counter3 = 0;
        int counter5 = 0;
        int counter7 = 0;

        for (int i = 0; i < s_number.length(); i++) {
            if (s_number.charAt(i) == '3') {
                counter3++;
                for (int j = 0; j < counter3; j++) {
                    result += "Foo";
                }
            }
            if (s_number.charAt(i) == '5') {
                counter5++;
                for (int j = 0; j < counter5; j++) {
                    result += "Bar";
                }
            }
            if (s_number.charAt(i) == '7') {
                counter7++;
                for (int j = 0; j < counter7; j++) {
                    result += "Qix";
                }
            }
            else {
                result = s_number;
            }
        }
        return result;
    }
}
