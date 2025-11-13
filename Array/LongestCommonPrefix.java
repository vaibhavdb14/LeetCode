/* 
* Write a function to find the longest common prefix string amongst an array of strings.
* If there is no common prefix, return an empty string "".

*Example 1:
  Input: strs = ["flower","flow","flight"]
  Output: "fl"
  Example 2:

*Input: strs = ["dog","racecar","car"]
  Output: ""
  Explanation: There is no common prefix among the input strings.
*/

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        int n = strs.length;

        String firstStr = strs[0];
        String lastStr = strs[n-1];

        int minStrLength = Math.min(firstStr.length(), lastStr.length());
        int idx = 0;

        while(idx < minStrLength && firstStr.charAt(idx) == lastStr.charAt(idx))
        idx++;

        return firstStr.substring(0, idx);
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs1)); 

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(strs2)); 
    }
    
}

//################# First Solution ####################
// Only passes two test cases

//     public String longestCommonPrefix(String[] strs) {
//         String base = strs[0];
//         int len = strs.length;

//         StringBuffer prefix = new StringBuffer("");
//         int count = 0;
//         int idx = 0;
//         boolean flag = true;

//         while(count<len){
//             for(int i = 1; i<len; i++){
//                 if(strs[0].charAt(idx) != strs[i].charAt(idx)){
//                     flag = false;
//                     break;
//                 }
//             }

//             if(!flag){
//                 return prefix.toString();
//             }

//             prefix.append(strs[0].charAt(idx));
//             idx++;
//             count++;
//         }

//         return strs[0];
//     }
