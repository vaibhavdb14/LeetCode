/*
 * LeetCode Problem 31: Next Permutation (medium)
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation
 * of numbers. If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
 * The replacement must be in place and use only constant extra memory.
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * Example 2:
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * Example 3:
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 * 
 * Credits: Refferred Apna College video to understand the approach and implemented the same in Java.
 */

class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

         if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return ;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(nums);
        
        for(int i = 0; i < nums.length; i++)
        System.out.print(nums[i] + " ");
    }
}