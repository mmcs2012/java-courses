import java.util.Scanner;

public class InteractRunner {
	public static void main (String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Enter operation type: add/minus");
				String operation_type = reader.next();
				switch (operation_type.toLowerCase()) {
					case "add":
						System.out.println("You decide add");
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "minus":
						System.out.println("You decide minus");
						calc.minus(Integer.valueOf(first), Integer.valueOf(second));
						break;
					default:
						System.out.println("Unknown operation, default operation");
						calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
				}
				
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ?");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}