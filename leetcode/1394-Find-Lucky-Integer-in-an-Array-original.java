class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> keys = new ArrayList<Integer>();
        
        for(int i : arr){
            // Integer not in map yet
            if(map.get(i)==null){
                map.put(i, 1);
                keys.add(i);
                continue;
            }
            
            // Integer in map
            map.replace(i, map.get(i)+1);
        }
        
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();
        for(int k : keys){
            if(map.get(k) == k && !luckyNumbers.contains(k)){luckyNumbers.add(k);}
        }
        
        int arrSize = luckyNumbers.size();
        if(arrSize == 0){return -1;}
        Collections.sort(luckyNumbers);
        return luckyNumbers.get(arrSize - 1);
    }
}