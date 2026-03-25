package Strings.Problems;
//use Hashmap

import java.util.HashMap;

public class FrequencyOfCharacters{
    public static void main(String[] args) {
        String str = "aabbbcc";
        
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            if(map.containsKey(c)){
                map.put(c,(map.get(c)+1));     // map.get(c)--> Gets the current value (count) of character c
            }
            else{
                map.put(c, 1);
            }
        }
        //print using keySet
        for(char key : map.keySet()){
            System.out.println(key +" -> "+ map.get(key));
        }
    }
}
//Time Complexity - O(n)
//Space Complexity - O(n)

//If interviwer wants you to maintain order use Linked Hashmap instaed of hashmap.