class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] freq = new int[26];
        for(char C : s.toCharArray()) {
            int i = C -'a';
            freq[i]++;

        }
        for(char C : t.toCharArray()) {
            int i = C -'a';
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