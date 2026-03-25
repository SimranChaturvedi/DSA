package Strings.Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersShorterWay {
    public static void main(String[] args) {
        String str = "aabbbcc";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);  //Get current value → if not present use 0 → add 1 → update map
        }

        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// Both approaches have O(n) time complexity.
// getOrDefault() just improves readability and reduces code size.
//Lonked Hashmap maintains insertion order.