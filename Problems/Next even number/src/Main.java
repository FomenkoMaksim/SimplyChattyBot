import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number % 2;
        if (sum == 0) {
            System.out.println(number + 2);
        } else {
            System.out.println(sum + number);
        }
    }
}
