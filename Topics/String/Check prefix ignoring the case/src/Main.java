import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        char firstCharacter = userInput.charAt(0);
        int capitalCheck = Character.compare(firstCharacter, 'J');
        int lowerCheck = Character.compare(firstCharacter, 'j');
        if (capitalCheck == 0 || lowerCheck == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}