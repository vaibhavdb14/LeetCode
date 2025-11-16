import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//292 cases passed leetcode out of 294 need to find the bug to pass all cases
//what is the bug here ?
//the bug the case which is not executing is the case with large numbers so while adding four large numbers 
//it is exceeding the limit of integer in java to handle that we can use long data type to store sum
public class FourSum {
   public List<List<Integer>> fourSum(int[] nums, long target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
       
        //consider fix it for right
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            //consider fix left one 
            for(int j= i+1; j<n; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                //okey so now we have fixed tow left and right and now can iterate inside both of them to find two other
                int left = j+1;
                int right = n-1;

                //now lets iterate to find other using two pointer technique
                while(left<right){
                    //lets calulate sum first and then compare with target 
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum == target){
                        ArrayList<Integer> oneQuad = new ArrayList<>();
                        oneQuad.add(nums[i]);
                        oneQuad.add(nums[j]);
                        oneQuad.add(nums[left]);
                        oneQuad.add(nums[right]);
                        result.add(oneQuad);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left-1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> quadruplets = fs.fourSum(nums, target);
        System.out.println(quadruplets); 
    }
}

//###Code credit : I used my logic first to fix the one left right and two variable pointers to find other two values
//But the unique combinations part I referred from geeksforgeeks article on four sum problem to avoid duplicates
//https://www.geeksforgeeks.org/find-all-four-sum-numbers-in-an-array
// also referred leetcode discuss to handle large number cases
//glad that I could debug and fix the issue myself although I referred some articles for help
//happly moving ahead