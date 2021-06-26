import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //int c = scanner.nextInt();
        //int d = scanner.nextInt();

        //System.out.println(--a + " " + --b + " " + --c + " " + --d);
        boolean b1 = false;
        boolean b2 = false;
        System.out.println(!(b1 || b2));
        System.out.println(!b1 && !b2);
        System.out.println(!b1 || b2);
        System.out.println(!b1 && b2);
        System.out.println(b1 || !!b2);
    }
}