import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main mainObject = new Main();
        // start coding here
        final int numberOfInputs = 3;
        int[] arrayOfInputs = new int[numberOfInputs];
        int numberOfDivisibles = 0;

        for (int i = 0; i < numberOfInputs; i++) {
            arrayOfInputs[i] = scanner.nextInt();
        }

        for (int i = arrayOfInputs[0]; i < (arrayOfInputs[1] + 1); i++) {
            if (mainObject.isDivisible(i, arrayOfInputs[2])) {
                numberOfDivisibles++;
            }
        }

        System.out.println(numberOfDivisibles);
    }

    public boolean isDivisible(int numberToDivide, int numberToUse) {
        return (numberToDivide % numberToUse) == 0 ? true : false;
    }
}