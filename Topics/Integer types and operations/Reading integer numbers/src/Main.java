import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfInputs = 4;
        int[] arrayOfInput = new int[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            arrayOfInput[i] = scanner.nextInt();
        }
        for (int num : arrayOfInput) {
            System.out.println(num);
        }
    }
}