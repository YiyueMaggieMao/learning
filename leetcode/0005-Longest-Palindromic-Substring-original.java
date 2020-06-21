class Solution {
    public String longestPalindrome(String s) {
        int strlen = s.length();
        
        // Empty strings : return empty string
        if(strlen == 0){
            return "";
        }
        
        // Non-empty strings : initiailize properties
        int maxlen = 1;
        String longest = s.substring(0,1);
        
        // Go through the entire string to find repeating/ mirroring characters
        // Note : It goes to strlen -1 because there's really no point checking last char
        // since it can only have length 1
        for( int currInd = 0; currInd < strlen - 1; currInd++ ){
            
            int currlen = 0;
            int currmax = 0;
            int maxLeft = 0;
            int maxRight = 0;
            int leftInd = 0;
            int rightInd = 0;
            int maxLeft1 = 0;
            int maxRight1 = 0;
            int currmax1 = 0;
            
            // If there are two identical chars in a row, expand outwards
            if((s.charAt(currInd))==(s.charAt(currInd + 1))){
                maxLeft = currInd;
                maxRight = currInd + 1;
                leftInd = currInd - 1;
                rightInd = currInd + 2;
                currlen = 2;
                currmax = 2;
                
                // Start expansion!
                while( leftInd >=0 && rightInd < strlen ){
                    // If equal, keep expanding
                    if(s.charAt(leftInd) == s.charAt(rightInd)){
                        leftInd--;
                        rightInd++;
                        currlen+= 2;
                    }
                    
                    // Update currMax if necessary
                    if(currlen > currmax){
                        currmax = currlen;
                        maxLeft = leftInd + 1;
                        maxRight = rightInd - 1;
                    }
                    
                    // If not, immediately stop the expansion
                    else{
                        break;
                    }
                }
            }
            
            // If the character to the left and right of currInd are identical, 
            // Also do the expansion
            if(currInd != 0){ // This line is to prevent IndexOutOfBounds
                if(s.charAt(currInd - 1) == s.charAt(currInd + 1)){
                    maxLeft1 = currInd - 1;
                    maxRight1 = currInd + 1;
                    leftInd = currInd - 2;
                    rightInd = currInd + 2;
                    currlen = 3;
                    currmax1 = 3;
                    
                    if(currmax1 > currmax){
                        maxLeft = maxLeft1;
                        maxRight = maxRight1;
                        currmax = currmax1;
                    }
                    
                    // Start expansion!
                    while( leftInd >=0 && rightInd < strlen ){
                        // If equal, keep expanding
                        if(s.charAt(leftInd) == s.charAt(rightInd)){
                            leftInd--;
                            rightInd++;
                            currlen+= 2;
                        }// If not, immediately stop the expansion
                        else{
                            break;
                        }
                        
                        // Update currMax if necessary
                        if(currlen > currmax1){
                            currmax1 = currlen;
                            maxLeft1 = leftInd + 1;
                            maxRight1 = rightInd - 1;
                        }
                    
                        if(currmax1 > currmax){
                            maxLeft = maxLeft1;
                            maxRight = maxRight1;
                            currmax = currmax1;
                        }
                    }
                }
                
            }
            
            // Update the variables, if necessary
            if(maxLeft != 0 || maxRight != 0){ // Checking for initialization
                
                if(currmax > maxlen){
                    maxlen = currmax;
                    longest = s.substring(maxLeft, maxRight + 1);
                }
            }
            
        }
        return longest;
    }
}