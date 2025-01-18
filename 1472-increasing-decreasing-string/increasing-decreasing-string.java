
class Solution {
    public String sortString(String s) {
        int [] freq = new int[26];
        for (char ch: s.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i=0; i<26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] -= 1;
                }
            }
            for (int i=25; i>=0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] -= 1;
                }
            }
        }
        return sb.toString();
    }
}