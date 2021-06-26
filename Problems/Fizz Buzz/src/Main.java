import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int out = 0;

        for (int i = number1; i <= number2; i++) {
            out = i;
            if (out % 3 == 0 && out % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (out % 3 == 0) {
                System.out.println("Fizz");
            } else if (out % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(out);
            }
        }
    }
}