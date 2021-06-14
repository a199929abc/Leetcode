/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.
 */
class Solution {
    public String sortSentence(String s) {
        String[] arrStr = s.split(" ");
        String[] a= new String[arrStr.length+1];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String element : arrStr) {
             count = Integer.parseInt(element.substring(element.length()-1));
            a[count] = element.substring(0,element.length()-1);
            
            }
        for(int i=1; i<a.length;i++){
            sb.append(a[i]+" ");    
        }
        
         return sb.toString().substring(0,sb.length()-1);
    }
}
/**
 重点：StringBuilder sb = new StringBuilder(); 
 1. 如何使用和新建stringbuilder，Stringbuilder 有 append的方法，记得最后用toString
 将builder 变成一条 字符串

 2. String 分割字符串的方法
 String[] arrStr = s.split(" ");
 split将会把string分割成 一个 string array
 
 3. 如何遍历 string array 中的元素 ： 
  for (String element : arrStr) {
             count = Integer.parseInt(element.substring(element.length()-1));
            a[count] = element.substring(0,element.length()-1);
            
            }
该方法跟python for e in list ：  很像
4. 字符串 子字符串的获取， 由于java 不能使用 slice， 所以要明确 substring的 明确位置

5.  count = Integer.parseInt(element.substring(element.length()-1));
使用 Integer.parseInt() 来转换 字符串形式的数字，变为 整数
 */