public class Palindrome {

    static boolean isPalindrome(String userInput) {
        userInput = userInput.toLowerCase();
        int i = 0;
        while (i < userInput.length() / 2) {
            char first = userInput.charAt(i);
            char last = userInput.charAt(userInput.length() - i - 1);
            if (first != last) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String sample = "racecar";
        System.out.println(sample + " -> " + isPalindrome(sample));
    }
}
