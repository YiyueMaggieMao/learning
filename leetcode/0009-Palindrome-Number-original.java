class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative return false immediately
        if( x < 0 ){ return false; }
        
        // Find out the// See what's the highest power of the original number
        int power = 0;
        int num = x;
        
        // Multiplies the power by 10 until it reaches "that thing", you know
        while(num != 0){
            
            num /= 10;
            
            // Initialize power to be 1
            if( power == 0 ){
                power = 1;
                continue;
            }
            
            // If already initialized, then multiply power by 10
            power *= 10;
        }
        
        // Now do the palindrome thing
        num = x;
        int lowPower = 10;
        for( int highPower = power; highPower >= lowPower; highPower /= 100){
            if( num / highPower != num % lowPower ){
                return false;
            }
            int firstDigit = num / highPower;
            num -= firstDigit * highPower;
            num /= 10;
        }
        return true;
    }
}