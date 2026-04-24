import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m * n];

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        int k = 0;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                result[k++] = matrix[top][i];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[k++] = matrix[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[k++] = matrix[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[k++] = matrix[i][left];
                }
                left++;
            }
        }

        // 🔥 Convert array to List
        List<Integer> ans = new ArrayList<>();
        for (int num : result) {
            ans.add(num);
        }

        return ans;
    }
}