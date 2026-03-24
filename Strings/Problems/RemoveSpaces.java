// Input: "i love java"
// Output: "ilovejava"
// Concept - StringBuilder

package Strings.Problems;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str= "i love java ";
        
        StringBuilder result =new StringBuilder();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!=' '){
               result.append(str.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)

//Can you do better?
//Using StringBuilder gives O(n) time.
//Using String concatenation gives O(n²), so StringBuilder is preferred.

//StringBuilder class creates a mutable sequence of characters,
// allowing efficient modification of a string's content without creating a new object in memory for every change.
//it is not thread-safe (non-synchronized), making it ideal for single-threaded applications.