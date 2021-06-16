/**
 * 
 * Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

 

Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:

Input: arr = [1,1]
Output: 1
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 105
 */
class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int border = len/4;
        int count = 0;
        
        if(len==1){
            return arr[0];
        }
        
        for(int i=1;i<len; i++){
            
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                count=0;
            } 
            if(count>=border){
                return arr[i];
            }
        }
    return 0;
}
}

/**
 * 
 * 重点： 可以使用  Boyer-Moore algorithm
 * 网友使用了 binary search 或者是 hashmap
 * 我觉得不太需要
 * link：https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/discuss/505114/simple-Java-solution-100-mm-and-100-runtime
 */
class Solution1 {
    public int findSpecialInteger(int[] arr) {
        int quater = arr.length / 4;
        int count = 1;
        
        if(arr.length == 1 ) return arr[0];
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(count>quater){
                    return arr[i];
                }
            }
            else{
                count=1;
            }
        }
        return 0;
    }
}