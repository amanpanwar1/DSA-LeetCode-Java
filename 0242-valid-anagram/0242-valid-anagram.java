class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] freq = new int[26];
        for(char A : s.toCharArray()) {
            int i = A -'a';
            freq[i]++;

        }
        for(char A : t.toCharArray()) {
            int i = A -'a';
            freq[i]--;
        }
        for ( int i : freq) {
            if(i!=0) {
                return false;
            }
        }
        return true;

    }
}