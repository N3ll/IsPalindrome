public class Polindrome {

	public static void main(String[] args) {
		String b = "AA2";
		//System.out.println(b.replaceAll("[^a-zA-Z]", "").toLowerCase());

		String expr1 = "ABCBA";

		if (isPalindrome(expr1)) {
			System.out.printf("The expression %s is a palindrome.\n", expr1);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr1);
		}

		String expr2 = "ABCCBA";

		if (isPalindrome(expr2)) {
			System.out.printf("The expression %s is a palindrome.\n", expr2);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr2);
		}

		String expr3 = "ABCBDA";

		if (isPalindrome(expr3)) {
			System.out.printf("The expression %s is a palindrome.\n", expr3);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr3);
		}

		String expr5 = "ABCMBDA";

		if (isPalindrome(expr5)) {
			System.out.printf("The expression %s is a palindrome.\n", expr5);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr5);
		}

		String expr4 = "AA2";

		if (isPalindrome(expr4)) {
			System.out.printf("The expression %s is a palindrome.\n", expr4);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr4);
		}

		String expr6 = null;

		if (isPalindrome(expr4)) {
			System.out.printf("The expression %s is a palindrome.\n", expr6);
		} else {
			System.out
					.printf("The expression %s is NOT a palindrome.\n", expr6);
		}
	}

	public static boolean isPalindrome(String s) {

		if (s == null || s.length() == 1)
			return false;

		String temp = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		StackADT<Character> expressionHalf = new LinkedStack<Character>();
		int count = 0;

		for (int i = temp.length() / 2 - 1; i >= 0; i--) {
			expressionHalf.push(temp.charAt(i));
			System.out.println(expressionHalf.peek());
		}

		for (int i = temp.length() - 1; i >= temp.length() / 2; i--) {

			if (expressionHalf.peek() != null
					&& temp.charAt(i) == expressionHalf.pop()) {
				//System.out.println(temp.charAt(i));
				count++;
			} else {
				if (count != temp.length() / 2) {
					return false;
				}
			}
		}

		return true;
	}
}
