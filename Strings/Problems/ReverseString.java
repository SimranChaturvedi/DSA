// Input: "hello"
// Output: "olleh"
// two-pointer swap

package Strings.Problems;

class ReverseString {

    public static void reverseString(char[] s) {
        if (s == null || s.length <= 1) return;

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        String str = "hello";
        char[] s = str.toCharArray();

        reverseString(s);
        // print the reversed string
         System.out.println("Reversed String: " + new String(s));
    }

}

//Can you do it without extra space?
//If input is a String → No, because Java strings are immutable (O(n) space required)
//If input is a char array → Yes, we can reverse it in-place using two pointers (O(1) space)

//Time Complexity: O(n)
//Space Complexity: O(n)
