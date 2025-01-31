import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canBeTypedInOneRow(word.toLowerCase(), row1) ||
                canBeTypedInOneRow(word.toLowerCase(), row2) ||
                canBeTypedInOneRow(word.toLowerCase(), row3)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }

    private boolean canBeTypedInOneRow(String word, Set<Character> row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(c)) return false;
        }
        return true;
    }
}
