import java.util.Arrays;

class MedianOfSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        //Merge Arrays
        int combinedArr[] = new int[len];

        System.arraycopy(nums1, 0, combinedArr, 0, m);
        System.arraycopy(nums2, 0, combinedArr, m, n);

        //Sort it
        Arrays.sort(combinedArr);

        int calMidIdx = (0+(len-1))/2;
        double median = 0.00; 
        //search for middle value 
        if(len%2!=0){
            median = (double)combinedArr[calMidIdx];
        }else{
            double mid1 = (double)combinedArr[calMidIdx];
            double mid2 = (double)combinedArr[calMidIdx+1];
            median = (mid1+mid2)/2;
        }

        return median;
    }

    public static void main(String[] args) {
        //odd number of elements
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + result); // Output: Median: 2.0

        //even number of elements
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        double result2 = findMedianSortedArrays(nums3, nums4);
        System.out.println("Median: " + result2); // Output: Median: 2.5
    }

}