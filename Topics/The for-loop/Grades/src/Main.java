import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final String aGrade = "A";
        final String bGrade = "B";
        final String cGrade = "C";
        int countOfA = 0;
        int countOfB = 0;
        int countOfC = 0;
        int countOfD = 0;

        final int numberOfInputs = Integer.parseInt(scanner.nextLine());
        String[] arrayOfGrades = new String[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            arrayOfGrades[i] = scanner.nextLine();
        }

        for (int i = 0; i < numberOfInputs; i++) {
            if (arrayOfGrades[i].equals(aGrade)) {
                countOfA++;
            } else if (arrayOfGrades[i].equals(bGrade)) {
                countOfB++;
            } else if (arrayOfGrades[i].equals(cGrade)) {
                countOfC++;
            } else {
                countOfD++;
            }
        }
        System.out.println(String.format("%o %o %o %o", countOfD, countOfC, countOfB, countOfA));
    }
}