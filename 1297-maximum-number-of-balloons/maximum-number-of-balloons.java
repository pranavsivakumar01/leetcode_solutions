import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freq = new HashMap<>();
        
      
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

       
        int minCount = Integer.MAX_VALUE;
        minCount = Math.min(minCount, freq.getOrDefault('b', 0) / 1);
        minCount = Math.min(minCount, freq.getOrDefault('a', 0) / 1);
        minCount = Math.min(minCount, freq.getOrDefault('l', 0) / 2);
        minCount = Math.min(minCount, freq.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, freq.getOrDefault('n', 0) / 1);

        return minCount; 
    }
}
