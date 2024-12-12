package baekjoon_11656;

import java.io.*;
import java.util.*;


public class baekjoon_11656 {

	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 List<String> result = new ArrayList<String>();
		 String s = br.readLine();
		 for(int i = 0; i < s.length(); i++) {
			 result.add(s.substring(i));
		 }
		 Collections.sort(result);
		 for(String baekjoon : result) {
			 System.out.println(baekjoon);
		 }
	}

}
