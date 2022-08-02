import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final String shape = scanner.nextLine();
        final Double pi = 3.14;
        Double a = null;
        Double b = null;
        Double result = null;
        switch (shape) {
            case "triangle":
                Double c = null;
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                c = Double.parseDouble(scanner.nextLine());
                result = heronsFormula(a, b, c);
                break;
            case "rectangle":
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                result = a * b;
                break;
            case "circle":
                final Double r = Double.parseDouble(scanner.nextLine());
                result = pi * Math.pow(r, 2);
                break;
            default:
                System.out.println("Unsupported shape!");
                break;
        }
        System.out.println(result);
    }

    public static Double heronsFormula(Double a, Double b, Double c) {
        final Double s = (a + b + c) / 2;
        final Double bodyOfSqrt = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(bodyOfSqrt);
    }
}