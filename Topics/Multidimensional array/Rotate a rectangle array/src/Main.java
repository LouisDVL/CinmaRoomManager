import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        int[][] inputMatrix = new int[n][m];
        int[][] outputMatrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int z = 0; z < m; z++) {
                inputMatrix[i][z] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int[] currRow = inputMatrix[i];
            for (int z = 0; z < m; z++) {
                int currNumber = currRow[z];
                outputMatrix[z][(n - 1) - i] = currNumber;
            }
        }

        for (int i = 0; i < m; i++) {
            int[] currRow = outputMatrix[i];
            for (int z = 0; z < currRow.length; z++) {
                System.out.print(currRow[z] + " ");
            }
            System.out.print("\n");
        }
    }
}