package datastructures.problems.twopointers;

public class IsPalindrome {

    //reverse string: time comp O(n) | space comp O(n)
    public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().contentEquals(newStr.reverse());
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        String t = "tab a cat";
        System.out.println("Sorting: " + isPalindrome(s));
        System.out.println("Hash Map: " + isPalindrome(s));
        System.out.println("Array: " + isPalindrome(t));
    }
}
