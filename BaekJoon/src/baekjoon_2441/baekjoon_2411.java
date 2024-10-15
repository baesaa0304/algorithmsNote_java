package baekjoon_2441;

import java.io.*;

public class baekjoon_2411 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i  < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = N; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
