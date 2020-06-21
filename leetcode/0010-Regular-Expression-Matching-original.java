class Solution {
    public boolean isMatch(String s, String p) {
        // Base cases
        if(s.isEmpty()){return isIgnorable(p);}
        if(p.isEmpty()){return s.isEmpty();}
        
        // First get the lengths of the two strings
        int sLen = s.length();
        int pLen = p.length();
        
        // Case 1: Non-star
        if(pLen == 1 || p.charAt(1)!='*'){
            if( !chMatch( s.charAt(0), p.charAt(0) ) ) {return false;}
            return isMatch( s.substring(1, sLen), p.substring(1, pLen) );
        }
        
        // Case 2: followed by a star
        // Case 2a: first chars don't match
        if( !chMatch( s.charAt(0), p.charAt(0)) ){
            return isMatch( s, p.substring( getFirstNonStarInd(p, 1), pLen ));
        }
            
        // Case 2b: first chars do match
        boolean matchResult = false;
        int repeatNum = numContinuous(s, p.charAt(0));
            
        for( int ind = 0; ind <= repeatNum; ind++ ){
            matchResult = matchResult || isMatch(s.substring(ind, sLen), 
                                                 p.substring( getFirstNonStarInd(p, 1), pLen ));
            if(matchResult == true){return true;}
        }
        return matchResult;
            
    }
    
    /* 
     * Helper method to determine wheter or not two characters match
     */
    boolean chMatch( char sChar, char pChar ){
        if(pChar == '.' || sChar == pChar){return true;}
        return false;
    }
    
    /**
     * Helper method to get the first index that is not a star
     */
    int getFirstNonStarInd(String p, int startInd){
        int pLen = p.length();
        for(int ind = startInd; ind < pLen; ind++){
            if( p.charAt( ind ) != '*' ){return ind;}
        }
        return pLen;
    }
    
    /**
     * Helper method to determine how many matching chars there are in a row
     */
    int numContinuous(String s, char ch){
        int count = 0;
        int sLen = s.length();
        for(int ind = 0; ind <sLen; ind++ ){
            if( chMatch(s.charAt(ind), ch) ){
                count++;
                continue;
            }
            break;
        }
        return count;
    }
    
    /**
     * Helper method to determine if a string is ignorable
     */
    boolean isIgnorable( String p ){
        if(p.isEmpty()){return true;}
        int pLen = p.length();
        for(int ind = 0; ind < pLen; ind++){
            if( p.charAt(ind) != '*' && (ind == pLen - 1 || p.charAt(ind + 1)!='*' ) ){
                return false;
            }
        }
        return true;
    }
}