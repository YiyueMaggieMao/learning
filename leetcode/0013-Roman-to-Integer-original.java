class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int ind = 0;
        int strLen = s.length();
        
        while( ind < strLen ){
            char c = s.charAt(ind);
            
            switch(c){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if( ind != strLen - 1 ){
                        char next = s.charAt(ind + 1);
                        if( next == 'D'){
                            result += 400;
                            ind++;
                        }
                        
                        else if( next == 'M' ){
                            result += 900;
                            ind++;
                        }
                        
                        else{ result+= 100; }
                    }
                    else{ result+= 100; }
                break;
                
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if( ind != strLen - 1 ){
                        char next = s.charAt(ind + 1);
                        if( next == 'L'){
                            result += 40;
                            ind++;
                        }
                        
                        else if( next == 'C' ){
                            result += 90;
                            ind++;
                        }
                        
                        else{ result+= 10; }
                    }
                    else{ result+= 10; }
                break;
                    
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if( ind != strLen - 1 ){
                        char next = s.charAt(ind + 1);
                        if( next == 'V'){
                            result += 4;
                            ind++;
                        }
                        
                        else if( next == 'X' ){
                            result += 9;
                            ind++;
                        }
                        
                        else{ result+= 1; }
                    }
                    else{ result+= 1; }
                break;
            }
            
            ind++;
        }
        return result;
    }
}