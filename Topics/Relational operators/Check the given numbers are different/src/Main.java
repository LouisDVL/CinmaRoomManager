import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfNumbers = 3;
        // put your code here
        int[] arrayOfNumbers = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        if (arrayOfNumbers[0] == arrayOfNumbers[1] ||
            arrayOfNumbers[0] == arrayOfNumbers[2] ||
            arrayOfNumbers[1] == arrayOfNumbers[2]
        ) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}