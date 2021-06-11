/**
 * 
 * Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
 

Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
 */

class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length-1;
        int sum = 0;
        
        for(int i =0; i<mat.length; i++){
            
            sum+= mat[i][i];
            sum+=mat[len][i];
            len--;
            
        }
    if(mat.length%2!=0){
        int c = mat.length/2;
        sum = sum - mat[c][c];
    }
        return sum;
    }
}
/**重点：分清 % 和 / 之间的区别，% 为取模，得到的是余数，然而 / 是除法
int  a = b / 2; 这段code 将会给a 复制 int 保留到整数 改题建议画出来几个sample 就很容易找到规律
*/