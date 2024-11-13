package baekjoon_9093;

import java.io.*;


public class baekjoon_9093 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N = Integer.parseInt(br.readLine());
		 StringBuilder result = new StringBuilder();
		 for (int i = 0; i < N; i++) {
			 String s = br.readLine();
			 String[] word = s.split(" ");
			 for(String t : word) {
				 StringBuilder sb = new StringBuilder(t);
				 result.append(sb.reverse().append(" "));
			 }
			 result.append("\n");
		}
		 System.out.print(result.toString());
		

	}

}
