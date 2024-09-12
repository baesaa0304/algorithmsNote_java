package algorithms_Java_01;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int [commands.length];
    	int idx = 0;
    	for(int i =0; i <commands.length; i++ ) {
    		int a = commands[i][0] - 1;
    		int b = commands[i][1];
    		int c = commands[i][2] - 1;
    		int[] arrs = new int[b - a];
    		int index = 0;
    		for(int j = a; j < b; j++) {
    			arrs[index++] = array[j];
    			
    		}
    		Arrays.sort(arrs);
    		answer[idx++] = arrs[c];
    	}
        
        return answer;
    }
}

public class programmers_42748 {

	public static void main(String[] args) {
		int arr[] = {1, 5, 2, 6, 3, 7, 4};
		int[][] com = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		Solution s = new Solution();
		int result[]= s.solution(arr, com);
		for(int i : result) {
			System.out.println(i);
		}

	}

}
