public class ggg {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
        System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));
    }
}
