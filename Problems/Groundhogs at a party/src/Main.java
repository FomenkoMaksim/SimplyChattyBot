import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean good = cups >= 10 && cups <= 20 && !weekend;
        boolean goodWeekend = cups >= 15 && cups <= 25 && weekend;
        boolean bad = cups < 10 && cups > 20 && weekend;
        boolean badWeekend = cups < 15 && cups > 25 && !weekend;

        System.out.println(good || goodWeekend || bad || badWeekend);

    }
}