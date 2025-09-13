
public class Palindrome {
    public static boolean isPalindrome(int i, int j, String str) {
        if (i >= j) {
            return true;
        }

        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }

        // check for next ith and previous jth character
        return isPalindrome(i + 1, j - 1, str);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("The palindrome of the string " + str + " is " + isPalindrome(0, str.length()-1, str));
    }
}
