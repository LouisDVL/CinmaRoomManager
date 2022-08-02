import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfInput = 3;
        final int twenty = 20;
        boolean pairToTwentyExists = false;
        int[] arrayOfInput = new int[numberOfInput];
        for (int i = 0; i < numberOfInput; i++) {
            arrayOfInput[i] = scanner.nextInt();
        }
        final int first = arrayOfInput[0];
        final int second = arrayOfInput[1];
        final int third = arrayOfInput[2];
        final int firstAndSecond = first + second;
        final int firstAndThird = first + third;
        final int secondAndThird = second + third;
        if (firstAndSecond == twenty) {
            pairToTwentyExists = true;
        } else if (firstAndThird == twenty) {
            pairToTwentyExists = true;
        } else if (secondAndThird == twenty) {
            pairToTwentyExists = true;
        }

        System.out.println(pairToTwentyExists);
    }
}