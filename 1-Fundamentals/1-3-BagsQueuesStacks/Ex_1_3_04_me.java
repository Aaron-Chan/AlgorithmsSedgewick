
public class Ex_1_3_04_me {
	public static void main(String[] args) {

		String string = StdIn.readLine().trim();
		
		boolean is = isMaster(string);
		System.out.println(is);
	}

	private static boolean isMaster(String string) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (c == ')' ||c == ']'||c == '}' ) {
				switch (c) {
				case ')':
					if (stack.isEmpty() ||stack.peek() != '(') {
						return false;
					}
					break;
				case ']':
					if (stack.isEmpty() ||stack.peek() != '[') {
						return false;
					}
					break;
				case '}':
					if (stack.isEmpty() ||stack.peek() != '{') {
						return false;
					}
					break;
				default:
					break;
				}
				stack.pop();
			}else{
				stack.push(c);
			}
			
		}
		return true;
	}

}
