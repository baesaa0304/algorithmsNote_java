package baekjoon_10872;

import java.io.*;

public class baekjoon_10872 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 1; i <= N; i++) {
        	result *= i;
        }
        System.out.println(result);

	}

}
