public class SumOfDigits {
    public int sumOfsumOfDigits(int n) {
        String num = String.valueOf(n);
        int total = 0;

        for (int i = 0; i < num.length(); i++) {
            int sum = 0;
            for (int j = i; j < num.length(); j++) {
                sum += num.charAt(j) - '0';
            }
            total += sum;
        }
        return total;
    }
}