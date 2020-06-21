class Solution {
    public int lengthOfLongestSubstring(String s) {
        // We start by looking at the first index
        int index = 0;
        int maxLen = 0;
        int strlen = s.length();
        
        // Then we go through the entire string!
        while(index < s.length()){
            
            // Don't bother checking if it's impossible to find a longer string
            if((strlen - index) < maxLen){
                break;
            }
            
            // Our checking range is the entire remainder of the string
            String range = s.substring(index, strlen);
            int len = firstRepeatedIndex(range); // This gives the length of the sequence
            if(len == -1){len = strlen - index;}
            
            // Maybe updates the max length
            if( len > maxLen ){
                maxLen = len;
            }

            index ++;  // Updates the index
            
        }
        return maxLen;
    }
    
    /**
     *  Function name : firstRepeatedIndex(String str)
     *  Finds the first index where we find a repeating character in String s
     *  
     *  @param str: The String that we look into
     *
     *  @return : -1 is nothing is repeated, first repeated index if otherwise
     */
    private int firstRepeatedIndex( String str ){
        // If the string literally has one character, return -1 immediately
        int strlen = str.length();
        if( strlen ==1 ){return -1;}
        
        int currInd = 1;
        while(currInd < strlen){
            // Check if the new letter is contained in the string body
            String checkedPart = str.substring(0, currInd);
            String toBeChecked = str.substring(currInd, currInd + 1);
            
            // If the checked part does contain the new letter, return the index of the letter
            if( checkedPart.contains(toBeChecked) ){
                return currInd;
            }
            
            // Otherwise, move on to the next index
            currInd ++;
        }
        
        return -1;
    }
}