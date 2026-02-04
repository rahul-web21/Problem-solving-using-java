public class PalindromeString {
    public int isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        input = input.toLowerCase();

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return 1; // Not palindrome
            }
            left++;
            right--;
        }
        return 2; // Palindrome
    }
}