import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (1900 <= year && year <=3000) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Leap");
            } else if (year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } else {
            System.out.println("Regular");
        }

    }
}