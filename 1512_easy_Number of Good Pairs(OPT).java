/** Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 **/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int cur=0;
        int goodPair=0;
        
        for(int i=0;i < nums.length; i++){
            cur = nums[i];
            for(int j=0;j<nums.length; j++){
                
                if(i<j&&nums[i]==nums[j]){
                    goodPair++;
                }else{
                    continue;
                }
            }
        }
        return goodPair;
    }
}

重点：  解题思路很简单，但是需要注意，这道题可以使用 hashmap来运算，有更优解法，以后学到会回来重写思路
