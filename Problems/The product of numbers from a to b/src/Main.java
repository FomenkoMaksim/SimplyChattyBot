import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = 1;

        for (long i = a; i < b; i++) {
            c = c * i;
        }
        System.out.println(c);
    }
}