import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userNumber = scanner.nextInt();
        final int one = 1;
        final int two = 2;
        final int three = 3;
        int firstStep = userNumber + one;
        int secondStep = firstStep * userNumber + two;
        int thirdStep = secondStep * userNumber + three;
        System.out.println(thirdStep);
    }
}