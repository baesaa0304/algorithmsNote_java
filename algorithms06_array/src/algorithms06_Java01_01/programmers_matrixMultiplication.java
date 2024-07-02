package algorithms06_Java01_01;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length; // 행
        int col = arr2[0].length; // 열
        System.out.print(col);
        int[][] answer = new int[row][col]; // ex answer[3][2]
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
public class programmers_matrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{1, 0}, {0, 1}};

        Solution solution = new Solution();
        int[][] result = solution.solution(arr1, arr2);

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

	}

}
