class Solution {
    public int firstUniqChar(String s) {
        int n =s.length();
        int[] count = new int[26];
        char[] ch = s.toCharArray(); 
        for (char X :ch) count[X-'a']++;
        for (int i=0 ; i<n ; i++) {
            char x = s.charAt(i);
            if(count[x-'a'] == 1) return i;
            }
        return -1;
    }     
}