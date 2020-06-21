class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        // It's actually such a genius way :0
        // I need to use 2-pointers more lol
        Arrays.sort(nums);
        int arrLen = nums.length;
        ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();

        if(arrLen < 3){return results;}
        
        // Go through every element of the array and use 2-pointers in there
        for(int i = 0; i < arrLen - 2; i++){
            // Skip dupilcates
            if(i != 0 && nums[i] == nums[i - 1]){continue;}
            int num = nums[i];
            int sum = 0 - nums[i];
            int low = i + 1;
            int high = arrLen - 1;
            
            // 2-pointers here I come uwu
            while(low < high){
                int currSum = nums[low] + nums[high];
                
                // If we have the exact sum, add it on! :D
                if(currSum == sum){
                    ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(num, nums[low], nums[high]));
                    results.add(triplet);
                    
                    // This is to ensure we don't have duplicates
                    low++;
                    high--;
                    while( low < high && nums[low-1] == nums[low] ){low++;}
                    while( low < high && nums[high+1] == nums[high] ){high--;}
                    continue;
                }
                
                // Otherwise, move the pointers accordingly
                if(currSum < sum){low++;}else{
                    high--;
                }
            }    
        }
        return results;
    }
}