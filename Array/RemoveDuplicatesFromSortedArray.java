/*
 * LeetCode Problem 26: Remove Duplicates from Sorted Array (easy)
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4]
 * 
 * Credits: I implemented the two-pointer technique to solve this problem efficiently.
*/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int ptr1 = 0;
        int ptr2 = 1;
        
        while(ptr2<nums.length){
            if(nums[ptr1] != nums[ptr2]){
                nums[++ptr1] = nums[ptr2];
            }
            ptr2++;
        }

        return ptr1+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdsa = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = rdsa.removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
