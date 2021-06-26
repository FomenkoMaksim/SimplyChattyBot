import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();

        int totalPrice = food * days + flight * 2 + hotel * (days - 1);
        System.out.println(totalPrice);


    }
}
