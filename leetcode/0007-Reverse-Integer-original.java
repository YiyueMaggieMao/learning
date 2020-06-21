class Solution {
    public int reverse(int x) {
        
        int result = 0;
        int num = x; 
        while( num != 0 ){
            
            // Check for overflow
            if( result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10 ){
                return 0;
            }
            
            if(result != 0){result *= 10;}
            
            // Add stuff to result
            result += num % 10;
            num /= 10;
        }
        
        return result;
    }
}