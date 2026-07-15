class Solution {
    public int countAsterisks(String s) {
        int n = s.length();
        int str = 0;
        int count = 0;
        for(int i =0;i<n;i++) {
            if (s.charAt(i)== '|') 
              count++;
            if(count%2 == 0 && s.charAt(i) == '*') str++;
        }
        return str;
    }
}