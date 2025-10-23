package numbers;

public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // Double temp until it is just less than or equal to dvd
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));   // 3
        System.out.println(divide(7, -3));   // -2
        System.out.println(divide(-2147483648, -1)); // 2147483647 (overflow)
    }
}

