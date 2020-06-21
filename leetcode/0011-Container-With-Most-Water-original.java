class Solution {
    public int maxArea(int[] height) {
        int width = height.length;
        int maxArea = 0;
        int currTallest = 0;
        
        // Loop between the bars until max area found
        for(int vline1 = 0; vline1 < width - 1; vline1++){
            int vline1Height = height[vline1];
            
            // Inner Loop does farthest to closest to reduce runtime
            for( int vline2 = width - 1; vline2 > vline1; vline2-- ){
                int vline2Height = height[vline2];
                
                // If a line is closer and not taller, then its area is definitely smaller
                if(vline2Height < currTallest){continue;}
                currTallest = vline2Height;
                // Gets height and width
                int currHeight = Math.min(vline1Height, vline2Height);
                int currWidth = vline2 - vline1;
                
                // Calculates the area, and update if necessary
                int currArea = currHeight * currWidth;
                if(currArea > maxArea){
                    maxArea = currArea;
                }
            }
            // Resets the current tallest bar
            currTallest = 0;
        }
        return maxArea;
    }
}