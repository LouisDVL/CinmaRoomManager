import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        int[][] inputMatrix = new int[n][m];
        int currentHighestValue = 0;
        int highestNIndex = 0;
        int highestMIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int z = 0; z < m; z++) {
                int currValue = scanner.nextInt();
                if (i == 0 && z == 0) {
                    currentHighestValue = currValue;
                    continue;
                }
                if (currValue > currentHighestValue) {
                    currentHighestValue = currValue;
                    highestNIndex = i;
                    highestMIndex = z;
                }
                inputMatrix[i][z] = currValue;
            }
        }



        System.out.println(highestNIndex + " " + highestMIndex);
    }
}