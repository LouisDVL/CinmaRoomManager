import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begginingPoint = 0;
        // put your code here
        int userInput = scanner.nextInt();
        String userInputString = Integer.toString(userInput);
        String[] userInputArray = userInputString.split("(?!^)");
        for (String numberString : userInputArray) {
            int number = Integer.parseInt(numberString);
            begginingPoint += number;
        }
        System.out.println(begginingPoint);
    }
}