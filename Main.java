import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        System.out.println("это ветка main");
    }
    import java.util.Scanner;

    public class Main {
        public static void main(String[] agrs){
            System.out.println("это ветка dev");

        }

        public class Calculator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter operation (+ or -): ");
                String operation = scanner.next();

                double result;

                if (operation.equals("+")) {
                    result = num1 + num2;
                }
                else if (operation.equals("-")) {
                    result = num1 - num2;
                }
                else {
                    System.out.println("Unsupported operation!");
                    return;
                }

                System.out.println("Result: " + result);
            }
        }
    }

}
