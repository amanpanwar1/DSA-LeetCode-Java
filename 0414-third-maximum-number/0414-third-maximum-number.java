class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for (int i : nums) {
            if (i == largest || i == second || i == third) {
                continue;
            }
            
            if (i > largest) {
                third = second;     
                second = largest;   
                largest = i;        
            } 

            else if (i > second) {
                third = second;     
                second = i;         
            } 
            else if (i > third) {
                third = i;          
            }
        }
        
        if (third == Long.MIN_VALUE) {
            return (int) largest;
        }
        return (int) third;
    }
}
