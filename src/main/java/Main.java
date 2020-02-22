import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");

		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while(scanner.hasNext()) {
			System.out.println("Enter a command:");
			String command = scanner.next();

			switch (command) {
				case "add":
					System.out.println(calculator.add(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case "subtract":
					System.out.println(calculator.subtract(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case "multiply":
					System.out.println(calculator.multiply(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case "divide":
					System.out.println(calculator.divide(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case "fibonacci":
					System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(scanner.next())));
					break;
				case "binary":
					System.out.println(calculator.intToBinaryNumber(Integer.parseInt(scanner.next())));
					break;
				case "quit":
					return;
				default:
					System.out.println("Invalid command");
			}

		}
	}
}
