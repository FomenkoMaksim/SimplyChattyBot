import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num > -15 && num <= 12) {
            System.out.println("True");
        } else if (num > 14 && num < 17) {
            System.out.println("True");
        } else if (num >= 19 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}