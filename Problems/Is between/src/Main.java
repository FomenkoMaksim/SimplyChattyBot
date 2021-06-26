import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean num1 = n1 >= n2 && n1 <= n3;
        boolean num2 = n1 >= n3 && n1 <= n2;
        System.out.println(num1 || num2);
    }
}