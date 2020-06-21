class Solution {
    public List<String> letterCombinations(String digits) {
        // Error catching in input format
        try{
           int numValue = Integer.parseInt(digits);
        }catch(NumberFormatException e){
            List<String> emptyList = new ArrayList<String>();
            return emptyList;
        }
        
        // General variables used for the entire program 
        ArrayList<String> combinations = new ArrayList<String>();
        ArrayList<Character[]> letters = new ArrayList<Character[]>();
        int strLen = digits.length();
        
        // Building a 2-D array that will be utilized in string building
        for(int ind = 0; ind < strLen; ind++){
            int digit = Integer.parseInt(digits.substring(ind, ind+1));
            letters.add(getLetterArray(digit));
        }
        
        // Return all possible strings from the result array
        int numDigits = letters.size();
        int[] indices = new int[numDigits];
        int firstLetterSize = letters.get(0).length;
        
        /* So it basically works like this:
         It's kind of like counting up in digits, except that some numbers
         Have three and some have four letters
         For example we have four digits 2, 4, 7, 8
         Which has capacities 3, 3, 4, 3
         We start with indices (0, 0, 0, 0) which we initialized in indices
         Then keep incrementing the last digit
         When the last digit hits 4 reset it and contribute 1 to the second to last
         When second to last hits 5 reset and contribute q1 to third to last...
         Repeat til the first digit hits 4
        */ 
        while(indices[0] < letters.get(0).length){
            // Build the string
            String result = "";
            
            for( int strInd = 0; strInd < numDigits; strInd++ ){
                result = result.concat((letters.get(strInd))[indices[strInd]].toString());
            }
            combinations.add(result);
            
            // Increment the digits
            indices[numDigits - 1]++;
            for( int ind = numDigits - 1; ind >0; ind-- ){
                if( indices[ind] >= letters.get(ind).length ){
                    indices[ind] = 0;
                    indices[ind - 1]++;
                }
            }
        }
        
        return combinations;
    }
    
    /* Gives an array of possible characters from a digit */ 
    private Character[] getLetterArray(int num){
        Character[] array = null;
        switch(num){
            case 2:
                array = new Character[]{'a', 'b', 'c'};
                break;
            case 3:
                array = new Character[] {'d', 'e', 'f'};
                break;
            case 4:
                array = new Character[] {'g', 'h', 'i'};
                break;
            case 5:
                array = new Character[] {'j', 'k', 'l'};
                break;
            case 6:
                array = new Character[] {'m', 'n', 'o'};
                break;
            case 7:
                array = new Character[] {'p', 'q', 'r', 's'};
                break;
            case 8:
                array = new Character[] {'t', 'u', 'v'};
                break;
            case 9:
                array = new Character[] {'w', 'x', 'y', 'z'};
                break;
            default:
                array = null;
        }
        return array;
    }
}