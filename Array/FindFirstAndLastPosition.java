/*  
 Leetcode Problem 34: Find First and Last Position of Element in Sorted Array (Medium)
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
    Example 1:
        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
    Example 2:
        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]
    
My initial logic fails for multiple occurrences of target.
Hence, implemented a simpler linear search approach. but it has O(n) time complexity.
*/
class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        
        if (n == 0) return new int[]{-1, -1};
        
        int left = 0;
        int right = n - 1;
        
       while (left < n && nums[left] != target) {
            left++;
        }
        
        if (left == n) {
            return new int[]{-1, -1};
        }
        
        while (right >= 0 && nums[right] != target) {
            right--;
        }
        
        return new int[]{left, right};
    }

    public static void main(String[] args) {
        FindFirstAndLastPosition finder = new FindFirstAndLastPosition();
        
        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        int[] result1 = finder.searchRange(nums1, target1);
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]"); // Expected: [3,4]
        
        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;
        int[] result2 = finder.searchRange(nums2, target2);
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]"); // Expected: [-1,-1]
    }
}

// Initial Logic - Fails for multiple occurrences
/* 
    public int[] searchRange(int[] nums, int target){
        
        int n = nums.length;
        int low = 0, high = n-1;
        
        if(n < 1) return new int[]{-1, -1};
        
        if(n == 1){
            if(nums[0] == target) return new int[]{0,0}; 
            else return new int[]{-1, -1};
        }
            
        while(low <= high){
            int mid = low + (high-low) / 2;

            if(nums[mid] == target){
                
                if(mid + 1 < n && nums[mid + 1] == target){ 
                    return new int[]{mid, mid + 1};
                    
                } else if(mid - 1 >= 0 && nums[mid - 1] == target){ 
                    return new int[]{mid - 1, mid};
                    
                } else {
                    return new int[]{mid, mid};
                }
            }

            if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return new int[]{-1, -1};
    }
*/