import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String firstName;
        String cuisinePreference;

        Scanner scan = new Scanner(System.in);
        firstName = scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        cuisinePreference = scan.nextLine();

        System.out.print("The form for " + firstName + " is completed.");
        System.out.print(" We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}