/* Maximum Water Container (Medium)
 * ------------------------------------------------------------------------------
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * ------------------------------------------------------------------------------
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * ------------------------------------------------------------------------------
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 * ------------------------------------------------------------------------------
*/

class MaximumWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right =n-1;
        int maxwater = 0;
        while(left<right){
            int area = 0;
            int width = right -left;
            int minHeight = Math.min(height[left], height[right]);
            area = width * minHeight;
            if (maxwater<area) maxwater = area;

            if(minHeight==height[left]){
                left++;
            }else{
                right--;
            }
        }

        return maxwater;
    }

    public static void main(String[] args) {
        MaximumWater mw = new MaximumWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(mw.maxArea(height)); // Output: 49
    }
}

/*
Hint1 :All pairs of the n lines define a rectangle with a height given by the shorter line and a width given by the distance between the lines. Return the area of the rectangle with the largest area."
Hint2 :Use two pointers, one at the beginning and one at the end of the array. Calculate the area formed by the lines at these two pointers. Move the pointer pointing to the shorter line inward, as this may lead to a taller line and potentially a larger area.
*/ 