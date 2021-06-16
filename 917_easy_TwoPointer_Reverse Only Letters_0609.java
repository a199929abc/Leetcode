/**
 * 
 * Given a string s, return the "reversed" string where all 
 * characters that are not a letter stay in the same place, 
 * and all letters reverse their positions.

 
Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Note:

s.length <= 100
33 <= s[i].ASCIIcode <= 122 
s doesn't contain \ or "
 */
class Solution {
    public String reverseOnlyLetters(String s) {
    
        int head = 0;
        int end = s.length()-1;
        char ch[] = s.toCharArray();
        
        while(head<end){
            if(!Character.isLetter(ch[head])){
                head++;
                continue;
            }
            if(!Character.isLetter(ch[end])){
                end--;
                 continue;
            }
            char temp = ch[head];
            ch[head] = ch[end];
            ch[end]  = temp;
            head++;
            end--;
            
        }
        return new String(ch);
    }
}
/**
 * 重点： 解题思路为 使用2个指针来做这道题，第一个指针到char array的头部
 * 第二个指针指到char array 的尾部，然后将头和尾进行swap。 然后一直循环直到头指针
 * 大于和尾指针相遇。当遇到特殊符号的时候跳过
 * 
 * 
将 String转换成 char array 方便处理
String S = " aaa ";
char[ ] = s.toCharArray();
最终通过 new String(charterarray); 组合成全新String


Character.isLetter(); 该方法是用来判断 character 是特殊符号还是字符
 */