class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max_Area = 0;
        //step 1
        int left = 0;
        int right = n-1;

        while(left<right){
            //step 2:
            int width = right - left;

            //step 3: calculate water height only the length of minimum bar
            int waterHeight = Math.min(heights[left],heights[right]);

            //step 4: area covered by water
            int area = waterHeight * width;

            //step 5: update the max area 
            max_Area = Math.max(max_Area,area);
               
               //step 6: move forward left or right
            if(heights[left]<heights[right]){
                left++;
            }
            else if(heights[left]>heights[right]){
                right--;
            }
            else{
                right--; //you can also do left++ but only one either left increase or right decrease
            }

        }
        return max_Area;
    }
}
