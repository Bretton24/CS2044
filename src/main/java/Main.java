import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator(); // Create an instance of Calculator

    while (scanner.hasNextLine()) {
      String input = scanner.nextLine();
      String[] parts = input.split(" ");

      String command = parts[0];

      // Parse the numbers, if the command involves numbers
      int num1 = 0;
      int num2 = 0;

      if (parts.length >= 2) {
        num1 = Integer.parseInt(parts[1]);
      }
      if (parts.length >= 3) {
        num2 = Integer.parseInt(parts[2]);
      }

      switch (command) {
        case "add":
          System.out.println(calculator.add(num1, num2));
          break;
        case "subtract":
          System.out.println(calculator.subtract(num1, num2));
          break;
        case "multiply":
          System.out.println(calculator.multiply(num1, num2));
          break;
        case "divide":
          System.out.println(calculator.divide(num1, num2));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(num1));
          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(num1));
          break;
        default:
          System.out.println("Unknown command: " + command);
      }
    }

    scanner.close();
  }
}
