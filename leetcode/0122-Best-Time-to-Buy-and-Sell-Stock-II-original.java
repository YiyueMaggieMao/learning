class Solution {
    public int maxProfit(int[] prices) {
        int arrSiz = prices.length;
        if(arrSiz <= 1){return 0;}
        int profit = 0;
        int buyPrice = -1;
        
        for( int i = 0; i < arrSiz; i++ ){
            int currPrice = prices[i];
            
            if( i != arrSiz - 1){ // Checking cuz we don't want index out of bound
                
                int nextPrice = prices[i+1];
                    
                if(buyPrice == -1 && currPrice < nextPrice){
                    buyPrice = currPrice;
                    continue;
                }else if( buyPrice != -1 && currPrice > buyPrice && currPrice > nextPrice  ){
                    profit += currPrice - buyPrice;
                    buyPrice = -1;
                    continue;
                }
            }else{ // If we are on the last day, check if we should sell
                if(buyPrice != -1 && currPrice > buyPrice){profit += currPrice - buyPrice;}
            }
        }
        return profit;
    }
}