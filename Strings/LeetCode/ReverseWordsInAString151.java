package Strings.LeetCode;

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

// //\\s → means any whitespace (space, tab, etc.)
//+ → means one or more
//\\s+ = multiple spaces treated as one

//Result:
//["a","good","example"]

public class ReverseWordsInAString151 {

    public String reverseWords(String s) {

        String words[] = s.trim().split("\\s+");
        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = "a good     example";
        ReverseWordsInAString151 obj = new ReverseWordsInAString151();
        String result = obj.reverseWords(s);
        System.out.println(result);

    }
}

// Time Complexity = O(n)
// Space Complexity = O(n)