/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome. */

package Strings.LeetCode;

public class ValidPallindrome {

    public static boolean isPalindrome(String s) {

        String finalstring = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = finalstring.length() - 1;
        while (left < right) {
            if (finalstring.charAt(left) != finalstring.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
// Can you optimize this yes by using no extra space O(1) --> refer to
// ValidPalindromeOptimized.