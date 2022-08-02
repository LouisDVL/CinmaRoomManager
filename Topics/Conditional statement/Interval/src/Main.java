import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int userInput = scanner.nextInt();
        final int negativeFifteen = -15;
        final int twelve = 12;
        final int fourteen = 14;
        final int seventeen = 17;
        final int nineteen = 19;

        boolean firstStatement = negativeFifteen < userInput && userInput <= twelve;
        boolean secondStatement = fourteen < userInput && userInput < seventeen;
        boolean thirdStatement = nineteen <= userInput;

        boolean result = firstStatement || secondStatement || thirdStatement;
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}