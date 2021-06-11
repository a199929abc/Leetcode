/**
 * Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
Example 3:

Input: s = "25#"
Output: "y"
Example 4:

Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
Output: "abcdefghijklmnopqrstuvwxyz"
 

Constraints:

1 <= s.length <= 1000
s[i] only contains digits letters ('0'-'9') and '#' letter.
s will be valid string such that mapping is always possible.
 */
class Solution {
    public String freqAlphabets(String s) {
  
      int strLen = s.length();
        var sb = new StringBuffer();

        for (int i = strLen - 1; i >= 0; i--) {
            if (s.charAt(i) == '#' && i-2>=0) {

               int t = s.charAt(i-1)-48+(s.charAt(i-2)-48)*10+96;
                sb.append((char)(t));
                
                i-=2;
            } else {
                sb.append((char) (s.charAt(i) - 48 + 96));

            }
        }//end for loop
        String an = sb.toString();
        var sba = new StringBuffer();
        
        for(int j =an.length()-1; j>=0; j--){
            sba.append(an.charAt(j));
            
        }
        

        return (sba.toString());
    }
}

/**
 * 重点： 本体着重研究了ASCII table的使用和java 如何取特定位置的字符和遍历
 * 如何使用 string append
 *         首先创建 string buffer 
 *         var sb = new StringBuffer();
 * String buffer 可以实现和python 类似的字符串append，但是只能append char 类型的参数
 * 
 * 解题思路：反向读取string
 *         假如遇到 “#” #号后面的2位数字为十位数，否则都是个位数，通过对 ASCII table 中的加减
 *          最终得出特定 char 从而完成对数字的解析
 *           由于我们是用 反向读取 string，最后需要将 string buffer reverse 然后return
 */