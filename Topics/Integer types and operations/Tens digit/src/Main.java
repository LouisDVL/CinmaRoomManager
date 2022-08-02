import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tensNumber = 2;
        // put your code here
        int inputNumber = scanner.nextInt();
        String inputNumberString = Integer.toString(inputNumber);
        char[] inputArray = new char[inputNumberString.length()];
        for (int i = 0; i < inputNumberString.length(); i++) {
            inputArray[i] = inputNumberString.charAt(i);
        }
        if (inputArray.length < tensNumber) {
            System.out.println('0');
        } else if (inputArray.length == tensNumber) {
            System.out.println(inputArray[0]);
        } else {
            System.out.println(inputArray[inputArray.length - 2]);
        }
    }
}