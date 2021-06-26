class Main {
    public static void main(String[] args) {
       //System.out.println("Hello, Max!");
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        if (b1 && b2) {
            System.out.println(b1);
        } else if (b2 || b3) {
            System.out.println(b2);
        } else {
            System.out.println(b3);
        }
    }
}