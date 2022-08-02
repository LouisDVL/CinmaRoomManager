import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final Long firstNumber = Long.parseLong(scanner.next());
        final String operation = scanner.next();
        final Long secondNumber = Long.parseLong(scanner.next());
        Long result = null;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Unknown operator");
        }

        if (result != null) {
            System.out.println(result);
        }
    }
}