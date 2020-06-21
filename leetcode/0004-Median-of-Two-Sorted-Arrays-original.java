class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arrlen1 = nums1.length;
        int arrlen2 = nums2.length;
        
        // If either arrays are empty, return the median of the other array
        if(arrlen1 == 0){return ((double)(nums2[(arrlen2-1)/2]) + (double)(nums2[arrlen2/2]))/2;}
        if(arrlen1 == 0){return ((double)(nums1[(arrlen1-1)/2]) + (double)(nums1[arrlen1/2]))/2;}

        
        // Otherwise, zig-zag them together! :D
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int ind1 = 0;
        int ind2 = 0;
        while( ind1 < arrlen1 || ind2 < arrlen2 ){
            // Case where we depleted one of the arrays
            if(ind1 >= arrlen1){
                nums.add(nums2[ind2++]);
                continue;
            }
            if(ind2 >= arrlen2){
                nums.add(nums1[ind1++]);
                continue;
            }

            // Otherwise, we just compare which one to add
            int num1 = nums1[ind1];
            int num2 = nums2[ind2];
            if(num1 < num2){
                nums.add(num1);
                ind1++;
            }else{
                nums.add(num2);
                ind2++;
            }
        }
        
        int arrSiz = nums.size();
        return ( (double)(nums.get((arrSiz - 1) / 2)) + (double)(nums.get(arrSiz / 2 )) ) / 2;
    }
}