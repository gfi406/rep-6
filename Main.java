import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] agrs){
        System.out.println("это ветка main");
    }


    public class Calculator {

        private static final List<String> history = new ArrayList<>();
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            String operation = scanner.next();

            double result;

            if (operation.equals("+")) {
                result = num1 + num2;
            }
            else if (operation.equals("-")) {
                result = num1 - num2;
            }
            else if (operation.equals("*")) {
                result = num1 * num2;
            }
            else if (operation.equals("/")) {
                result = num1 / num2;
            }
            else {

                return;
            }

            System.out.println("Result: " + result);
        }


    }
}
