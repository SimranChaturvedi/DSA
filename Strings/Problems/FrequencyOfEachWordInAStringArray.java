package Strings.Problems;

import java.util.HashMap;

public class FrequencyOfEachWordInAStringArray {
    public static void main(String[] args) {
        String str[] = { "gaya", "for", "amaber", "for", "ghghgh", "gaya", "mjmj", "amaber" };

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                int count = map.get(str[i]);
                map.put(str[i], count + 1);
            } else {
                map.put(str[i], 1);
            }
        }
        // System.out.println(map); //{gaya=2, for=2, amaber=2, mjmj=1, ghghgh=1}

        // If you only want to print those string which are repeating
        for (String word : map.keySet()) {
            if (map.get(word) > 1) {
                System.out.println(word + " : " + map.get(word)); // gaya : 2 for : 2 amaber : 2
            }
        }

    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)

//you can use entrySet() check afterwards.
//Advantage of entrySet() --> TC and SC will be the same but map.get(word) takes extra lookup, while entrySet() avoids that.