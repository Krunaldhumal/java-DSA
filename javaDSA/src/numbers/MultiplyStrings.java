package numbers;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        // Multiply each digit
        for (int i = m - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int sum = a * b + result[i + j + 1];

                result[i + j + 1] = sum % 10; // current digit
                result[i + j] += sum / 10;    // carry
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));       // 6
        System.out.println(multiply("123", "456"));   // 56088
        System.out.println(multiply("0", "456"));     // 0
    }
}

