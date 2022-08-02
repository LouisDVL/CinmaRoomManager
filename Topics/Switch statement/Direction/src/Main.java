import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfOptions = 4;
        int moveOption = scanner.nextInt();
        if (moveOption > 0 && moveOption <= numberOfOptions) {
            System.out.println("move " + switchCase(moveOption));
        } else if (moveOption == 0) {
            System.out.println("do not move");
        } else {
            System.out.println(switchCase(moveOption));
        }
    }

    public static String switchCase(int option) {
        final int up = 1;
        final int down = 2;
        final int left = 3;
        final int right = 4;
        switch (option) {
            case up:
                return "up";
            case down:
                return "down";
            case left:
                return "left";
            case right:
                return "right";
            default:
                return "error!";
        }
    }
}