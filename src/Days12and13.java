public class Days12and13
{
	
	public static void main(String[] args) {
		Stack<String> pancakes = new LinkedStack<String>();	
		pancakes.push("blueberry");
		pancakes.push("strawberry");
		pancakes.push("chocolate chip");
		
		while (!pancakes.isEmpty()) {
			String p = pancakes.pop();
			System.out.println(p);
		}
	}

}
