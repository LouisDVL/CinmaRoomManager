import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSequence = 0;
        String currInt;
        final String zero = "0";
        // start coding here
        while (!(currInt = scanner.nextLine()).equals(zero)) {
            numberOfSequence++;
        }

        System.out.println(numberOfSequence);
    }
}