import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String trimmedFirst = firstString.trim().replaceAll(" ", "");
        String trimmedSecond = secondString.trim().replaceAll(" ", "");

        System.out.println(trimmedFirst.equals(trimmedSecond));
    }
}