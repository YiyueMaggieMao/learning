class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        
        // A nested for loop to look for the results
        for( int firstInd = 0; firstInd < size; firstInd++ ){
            for( int secondInd = firstInd + 1; secondInd < size; secondInd++ ){
                // See if they match the result
                if( nums[firstInd] + nums[secondInd] == target ){
                    result[0] = firstInd;
                    result[1] = secondInd;
                }
            }
        }
        return result;
    }
}