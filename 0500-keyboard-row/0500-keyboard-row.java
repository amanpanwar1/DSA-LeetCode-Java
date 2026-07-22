import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        // Step 1: Define the keyboard row for each alphabet letter (a-z)
        // Row 1: q w e r t y u i o p
        // Row 2: a s d f g h j k l
        // Row 3: z x c v b n m
        int[] letterToRow = {
            2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 
            3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };
        
        List<String> result = new ArrayList<>();
        
        // Step 2: Check each word
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            // Get the row number of the very first character (case-insensitive)
            int targetRow = letterToRow[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean isValid = true;
            
            // Verify if all other characters belong to the same row
            for (int i = 1; i < word.length(); i++) {
                if (letterToRow[Character.toLowerCase(word.charAt(i)) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            // If the whole word is in one row, save it
            if (isValid) {
                result.add(word);
            }
        }
        
        // Step 3: Convert the dynamic list back to a primitive String array
        return result.toArray(new String[0]);
    }
}
