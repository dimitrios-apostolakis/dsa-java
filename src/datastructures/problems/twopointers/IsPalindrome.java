package datastructures.problems.twopointers;

public class IsPalindrome {

    //reverse string: time comp O(n) | space comp O(n)
    public static boolean isPalindromeSB(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().contentEquals(newStr.reverse());
    }

    //Two pointers: time comp O(n) | space comp O(1)
    public static boolean isPalindromeP(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && notAlphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && notAlphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public static boolean notAlphaNum(char c) {
        return !(c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        String t = "tab a cat";
        System.out.println("Reverse: " + isPalindromeSB(s));
        System.out.println("Reverse: " + isPalindromeSB(t));

        System.out.println("\nTwo pointer: " + isPalindromeP(s));
        System.out.println("Two pointer: " + isPalindromeP(t));
    }
}
