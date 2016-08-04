
public class Ex_1_3_09_me {

	public static void main(String[] args) {
		String readLine = StdIn.readLine();
		StdOut.print(fix(readLine));
	}

	private static String fix(String readLine) {
		Stack<String> values = new Stack<>();
		Stack<String> operation = new Stack<>();

		String[] split = readLine.split(" ");
		for (String string : split) {
			if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")
					|| string.equals("sqrt")) {
				operation.push(string);
			} else if (string.equals(")")) {
				String pop = values.pop();
				String pop2 = operation.pop();
				if (pop2.equals("+") || pop2.equals("-") || pop2.equals("*") || pop2.equals("/")) {

					values.push(String.format("(%s %s %s)", values.pop(), pop2, pop));
				}else if (	pop2.equals("sqrt")) {
				
					values.push(String.format("(%s %s)", pop2, pop));
				}

			}else{
				values.push(string);
			}
		}

		return values.pop();
	}

}
