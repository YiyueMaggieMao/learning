class Solution {
    public int numTeams(int[] rating) {
        int arrLen = rating.length;
        if(arrLen < 3){return 0;}
        int count = 0;
        
        // It's soooo slow... But okay
        for(int i = 0; i < arrLen; i++){
            int val1 = rating[i];
            // First half look for increasing...
            for(int j = i + 1; j < arrLen; j++ ){
                int val2 = rating[j];
                if(val1 < val2){
                    for(int k = j + 1; k < arrLen; k++){
                        int val3 = rating[k];
                        if(val2 < val3){count++;}
                    }
                }
            }
            
            // Second half look for decreasing...
            for(int j = i + 1; j < arrLen; j++ ){
                int val2 = rating[j];
                if(val1 > val2){
                    for(int k = j + 1; k < arrLen; k++){
                        int val3 = rating[k];
                        if(val2 > val3){count++;}
                    }
                }
            }
        }
        return count;
    }
}