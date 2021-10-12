import java.util.Scanner;

public class Days12and13
{
	public static boolean checkParens(String text) {
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Type an expression (blank to stop): ");
			String expression = scanner.nextLine();
			if (expression.equals(""))
				break;
			if (checkParens(expression))
				System.out.println("Syntax ok.");
			else
				System.out.println("Syntax NOT ok!");
		}
		
		
//		Stack<String> pancakes = new ArrayStack<String>();	
//		pancakes.push("blueberry");
//		pancakes.push("strawberry");
//		pancakes.push("chocolate chip");
//		
//		while (!pancakes.isEmpty()) {
//			String p = pancakes.pop();
//			System.out.println(p);
//		}
	}

}
