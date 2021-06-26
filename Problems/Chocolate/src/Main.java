import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int width = scanner.nextInt();
        int part = scanner.nextInt();

        if (part == lenght) {
            System.out.println("YES");
        } else if (part > lenght * width) {
            System.out.println("NO");
        }else if (part == width) {
            System.out.println("YES");
        } else if (part % lenght == 0 ) {
            System.out.println("YES");
        } else if (part % width == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}