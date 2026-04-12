public class Palindrome {

    static boolean isPalindrome(String userImput) {
        int i = 0;
        while (i < userImput.length() / 2) {
            char first = userImput.charAt(i);
            char last = userImput.charAt(userImput.length() - i - 1);
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
