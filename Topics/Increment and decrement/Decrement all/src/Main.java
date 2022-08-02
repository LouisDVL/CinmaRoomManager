import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int numberOfInputs = 4;
        int[] arrayOfInputs = new int[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            arrayOfInputs[i] = scanner.nextInt() - 1;
        }
        for (int num : arrayOfInputs) {
            System.out.print(Integer.toString(num) + " ");
        }
    }
}