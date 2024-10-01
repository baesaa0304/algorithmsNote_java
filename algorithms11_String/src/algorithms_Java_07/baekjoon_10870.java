package algorithms_Java_07;

import java.io.*;


public class baekjoon_10870 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
        } else if (N == 1) {
            System.out.println(1);
        }
		int result[] = new int [N +1];
		result[0] = 0;
		result[1] = 1;
		for(int i = 2; i <= N; i++) {
			result[i] = result[i - 1] + result[i - 2];	
		}
		System.out.println(result[result.length -1]);
	}

}
