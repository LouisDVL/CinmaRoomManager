import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String yearsOfExperience = scanner.next();
        String cuisinePreference = scanner.next();

        System.out.println("The form for " + name +
                " is completed. We will contact you " +
                "if we need a chef who cooks "
                + cuisinePreference + " dishes and has " +
                yearsOfExperience + " years of experience.");
    }
}