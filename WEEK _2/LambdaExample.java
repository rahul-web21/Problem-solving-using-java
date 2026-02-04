interface PerformOperation {
    boolean check(int a);
}

public class LambdaExample {

    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String s = String.valueOf(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        };
    }
}