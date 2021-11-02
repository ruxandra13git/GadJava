package lab1;

public class FizzBuzzRizzJazz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //7 si 11
            if (i % 77 == 0) {
                System.out.println("RizzJazz");
            }
            //5 si 11
            else if (i % 55 == 0) {
                System.out.println("BuzzJazz");
            }
            //5 si 7
            else if (i % 35 == 0) {
                System.out.println("BuzzRizz");
            }
            //3 si 11
            else if (i % 33 == 0) {
                System.out.println("FizzJazz");
            }
            //3 si 7
            else if (i % 21 == 0) {
                System.out.println("FizzRizz");
            }
            //3 si 5
            else if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            // 11
            else if (i % 11 == 0) {
                System.out.println("Jazz");
            }
            // 7
            else if (i % 7 == 0) {
                System.out.println("Rizz");
            }
            // 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
