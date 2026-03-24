package Strings.Problems;

//Input: "madam" → true  
// Input: "hello" → false
// Concept
// Two pointer (left & right)

public class Pallindrome {

public static boolean isPallindrome(String str){

    if (str == null || str.length() <= 1) {
            return true;
        }
        str = str.toLowerCase();
        int start=0; int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
    return true;
}

    public static void main(String[] args) {
        String str="madam";
        if(isPallindrome(str)){
            System.out.println("given string is pallindrome");
        }
        else{
            System.out.println("given string is not pallindrome");
        }
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n) (due to toLowerCase()), otherwise O(1)