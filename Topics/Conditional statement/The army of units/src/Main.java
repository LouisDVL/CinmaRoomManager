import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int noArmy = 1;
        final int pack = 19;
        final int throng = 249;
        final int zounds = 999;
        final int legion = 1000;
        // start coding here
        int armySize = scanner.nextInt();
        if (armySize < noArmy) {
            System.out.println("no army");
        } else if (armySize <= pack) {
            System.out.println("pack");
        } else if (armySize <= throng) {
            System.out.println("throng");
        } else if (armySize <= zounds) {
            System.out.println("zounds");
        } else if (armySize >= legion) {
            System.out.println("legion");
        }
    }
}