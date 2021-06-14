/**
 * 
 * 
 * 
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer>hashMap = new HashMap<>();
        int sum = 0;
        for (int i =0;i< nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
                
            }else {
                hashMap.put(nums[i], 1);    
            }
            
        }
        
        for (int i =0; i< nums.length; i++){
            if(hashMap.get(nums[i])==1){
                sum +=nums[i];
            }    
        }   
        
        return sum;
    }
}
/**
 * 重点重点:
 * 1. 什么是hashmap
 * 2. hashmap 如何使用
 * 3. hashmap的default 方法https://blog.csdn.net/wxgxgp/article/details/79194360
 * 4. 本题使用到了 ： hashmap.put(k,v) 放key和 varible 到map 中
 *  hashmap.containsKey(v) 遍历整个map找到有没有 map到的值, 如果有 return T else F
 * hashmap.get(K); 遍历整个map 返回key的value
 * 
 * 更多信息在连接中
 */