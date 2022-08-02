import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int numberOfInput = 3;
        int[] inputs = new int[numberOfInput];
        for (int i = 0; i < numberOfInput; i++) {
            inputs[i] = scanner.nextInt();
        }
        int n = inputs[0];
        int m = inputs[1];
        int k = inputs[2];

        int totalSquares = n * m;
        boolean isNEqualK = n == k;
        boolean isMEqualK = m == k;
        boolean isKLessThanTotal = k <= totalSquares;
        boolean isKMultipleOfN = k % n == 0;
        boolean isKMultipleOfM = k % m == 0;

        if (isNEqualK || isMEqualK) {
            System.out.println("YES");
        } else if (isKLessThanTotal) {
            if (isKMultipleOfN || isKMultipleOfM) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}