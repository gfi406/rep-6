import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operation (sin, cos, tan, log, ln, sqrt, quit): ");
            String operation = scanner.nextLine();

            if (operation.equals("quit")) {
                break;
            }

            System.out.print("Enter number: ");
            double number = scanner.nextDouble();

            switch (operation) {
                case "sin":
                    System.out.println("Sin(" + number + ") = " + Math.sin(number));
                    break;
                case "cos":
                    System.out.println("Cos(" + number + ") = " + Math.cos(number));
                    break;
                case "tan":
                    System.out.println("Tan(" + number + ") = " + Math.tan(number));
                    break;
                case "log":
                    System.out.println("Log(" + number + ") = " + Math.log10(number));
                    break;
                case "ln":
                    System.out.println("Ln(" + number + ") = " + Math.log(number));
                    break;
                case "sqrt":
                    System.out.println("Sqrt(" + number + ") = " + Math.sqrt(number));
                    break;
                default:
                    System.out.println("Unknown operation");
            }

            scanner.nextLine(); // consume newline left in scanner after nextDouble()
        }

        scanner.close();
    }
}