import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

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
          System.out.println(add(num1, num2));
          break;
        case "subtract":
          System.out.println(subtract(num1, num2));
          break;
        case "multiply":
          System.out.println(multiply(num1, num2));
          break;
        case "divide":
          System.out.println(divide(num1, num2));
          break;
        case "fibonacci":
          System.out.println(fibonacciNumberFinder(num1));
          break;
        case "binary":
          System.out.println(intToBinaryNumber(num1));
          break;
        default:
          System.out.println("Unknown command: " + command);
      }
    }

    scanner.close();
  }
}
