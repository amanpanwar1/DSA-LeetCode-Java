class Solution {
    public int titleToNumber(String columnTitle) {
        char [] ch = columnTitle.toCharArray();
        int res = 0;
        for (int i=0 ; i<ch.length; i++) {
            int num = ch[i] -65+1; // A=65 on ascii value 
            res = res*26 +num; // 26 alphabets
        }
        return res;
    }
}