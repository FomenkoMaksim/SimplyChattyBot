import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int tens = (inputNumber % 100) / 10;
        System.out.println(tens);
    }
}