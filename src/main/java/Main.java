import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");

		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while(true) {
			System.out.println("Enter a command:");
			String command = scanner.next();

			switch (command.charAt(0)) {
				case 'a':
					System.out.println(calculator.add(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case 's':
					System.out.println(calculator.subtract(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case 'm':
					System.out.println(calculator.multiply(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case 'd':
					System.out.println(calculator.divide(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
					break;
				case 'f':
					System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(scanner.next())));
					break;
				case 'b':
					System.out.println(calculator.intToBinaryNumber(Integer.parseInt(scanner.next())));
					break;
				case 'q':
					return;
				default:
					System.out.println("Invalid command");
			}

		}
	}
}
