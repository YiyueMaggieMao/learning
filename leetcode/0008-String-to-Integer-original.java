class Solution {
    public int myAtoi(String str) {
        // The value to be returned, along with the positive / negative indicator
        int result = 0;
        boolean isNegative = false;
        
        // Removes all the white spaces of the input string
        String trimmedStr = str.trim();
        int strlen = trimmedStr.length();
        
        // Return 0 right away if the string is all white space
        if(strlen == 0){
            return 0;
        }
        
        // Handles the potential plus / minus sign
        if(trimmedStr.charAt(0) == '-'){
            isNegative = true;
            trimmedStr = trimmedStr.substring(1, strlen);
            strlen--;
        }
        else if(trimmedStr.charAt(0) == '+'){
            trimmedStr = trimmedStr.substring(1, strlen);
            strlen--;
        }
        
        // Now handle the numerical part, hopefully
        for(int ind = 1; ind <= strlen; ind++){
            
            String subst = trimmedStr.substring(0, ind);
            
            // As long as there is no exception, keep on updating result
            try{
                result = Integer.parseInt(subst);
            }
            catch(NumberFormatException e){
                String letter = trimmedStr.substring(ind - 1, ind);
                
                // If it is caused by a non-digit, return the value
                try{
                    int tmp = Integer.parseInt(letter);
                }catch(NumberFormatException exc){
                    // Determine positivity or negativity
                    if(isNegative){ result = 0 - result; }
                    return result;
                }
                
                // If caused by overflow, return max or min value
                if(isNegative){return Integer.MIN_VALUE;}
                return Integer.MAX_VALUE;
            }
        }
        
        // Negativity check
        if(isNegative){result = 0 - result;}
        return result;
    }
}