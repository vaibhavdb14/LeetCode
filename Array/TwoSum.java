// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int value = target;

        int x =0;
        int y = 0;

        for(int i=0; i<nums.length; ++i){
            x= nums[i];
            y = value - x;
            for(int j=i+1; j<nums.length; ++j){
                if(y==nums[j]){
                    int res[] = {i, j};
                    return res;
                }
            }
        }
        int res[] = {-1, -1};
        return res;
    }

    public static void main(String args[]){
        TwoSum ts = new TwoSum();
        Scanner sc = new Scanner(System.in);

        System.out.println("Two Sum Problem");
        System.out.println("Enter the lenght of array:");
        int length = sc.nextInt();
        int arr[] = new int[length];

        System.out.println("Enter the elements of array:");
        for(int i=0; i<length; ++i)
            arr[i] = sc.nextInt();

        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        System.out.println("Finding two indices whose values sum to " + target);
        int result[] = ts.twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        sc.close();
    }
}