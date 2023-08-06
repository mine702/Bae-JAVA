import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String result = br.readLine();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')') {
				if (stack.isEmpty()) {
					stack.add(ch);
				} else {
					int count = stack.size();
					if (ch == '+' || ch == '-') {
						for (int j = 0; j < count; j++) {
							char ch2 = stack.peek();
							if (ch2 == '(') {
								break;
							} else {
								sb.append(ch2);
								stack.pop();
							}
						}
						stack.add(ch);
					} else if (ch == '*' || ch == '/') {
						for (int j = 0; j < count; j++) {
							char ch2 = stack.peek();
							if (ch2 == '*' || ch2 == '/') {
								sb.append(ch2);
								stack.pop();
							} else {
								break;
							}
						}
						stack.add(ch);
					} else if (ch == '(') {
						stack.add(ch);
					} else {
						int count2 = stack.size();
						for (int j = 0; j < count2; j++) {
							char ch2 = stack.pop();
							if (ch2 == '(')
								break;
							else
								sb.append(ch2);
						}
					}
				}
			} else
				sb.append(ch);
		}
		if (!stack.isEmpty()) {
			int numbers = stack.size();
			for (int j = 0; j < numbers; j++) {
				char ch3 = stack.pop();

				sb.append(ch3);
			}
		}
		System.out.println(sb);
	}
}