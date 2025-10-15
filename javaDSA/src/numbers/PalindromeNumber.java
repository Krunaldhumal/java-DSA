package numbers;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		int original = x;
		int reversed = 0;

		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return original == reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 121;
		System.out.println(isPalindrome(x));
		int y = -121;
		System.out.println(isPalindrome(y));
		int z = 10;
		System.out.println(isPalindrome(z));
		

	}

}
