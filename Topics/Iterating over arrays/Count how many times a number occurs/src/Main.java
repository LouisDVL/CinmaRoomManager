import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int sizeOfArray = scanner.nextInt();
        int[] arrayOfNumbers = new int[sizeOfArray];
        int numberOfOccurence = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }

        final int numberToCheckFor = scanner.nextInt();

        for (int i = 0; i < sizeOfArray; i++) {
            if (arrayOfNumbers[i] == numberToCheckFor) {
                numberOfOccurence++;
            }
        }

        System.out.println(numberOfOccurence);
    }
}