/*LeetCode Problem 35: Search Insert Position (Easy)
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:    
    Input: nums = [1,3,5,6], target = 5
    Output: 2

 * Example 2:
    Input: nums = [1,3,5,6], target = 2 
    Output: 1
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int pos = nums.length;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(nums[mid] == target) return mid;

            if(nums[mid] >= target) {
                pos = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            } 

        }

        return pos;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        
        int target1 = 5;
        System.out.println("Output: " + sip.searchInsert(nums, target1)); 

        int target2 = 2;
        System.out.println("Output: " + sip.searchInsert(nums, target2)); 

        int target3 = 7;
        System.out.println("Output: " + sip.searchInsert(nums, target3));

        int target4 = 0;
        System.out.println("Output: " + sip.searchInsert(nums, target4)); 
    }
}
