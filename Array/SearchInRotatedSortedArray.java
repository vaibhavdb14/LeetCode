/*
* LeetCode Problem 33: Search in Rotated Sorted Array
* Difficulty: Medium
* Description:
* Given an integer array nums sorted in ascending order (with distinct values), 
* and an integer target, write a function to search target in nums. If target exists, return its index. Otherwise, return -1.
* You must write an algorithm with O(log n) runtime complexity.
* Example:
* Input: nums = [4,5,6,7,0,1,2], target = 0
* Output: 4
* Explanation: The target 0 is located at index 4 in the array.
* Credit: Me, Brute Force approach O(n) not O(log n) 
*/

class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target)return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searcher.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); 
    }
}