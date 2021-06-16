/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        
        if(ss.length!=tt.length){
            return false;
        }
        
        for(int i =0; i<tt.length;){
            if(ss[i]==tt[i]){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}

/**
 * 重点： java 中 如何使用 Arrays.sort();
 * 更多信息 https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 * 
 * 如何将string 分割成char array
 * 
 * 思路很简单sort后比较 
 */