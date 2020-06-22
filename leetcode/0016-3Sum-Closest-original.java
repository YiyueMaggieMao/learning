class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int arrlen = nums.length;
        if(arrlen < 3){return -1;}
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE; // Absolute value of difference
        int closest = Integer.MAX_VALUE; // Closest sum so far
        
        // For loop + two-pointer yeet
        for(int i = 0; i < arrlen; i++){
            int currVal = nums[i];
            int left = i+1;
            int right = arrlen - 1;
            while(left < right){
                int sum = currVal + nums[left] + nums[right];
                // See if we update anything
                int currDiff = Math.abs(sum - target);
                if(currDiff < diff){
                    diff = currDiff;
                    closest = sum;
                }
                // Change pointer depending on comparison
                if(sum < target){left++;}
                else if(sum > target){right--;}
                else{return target;}
            }
        }
        return closest;
    }
}