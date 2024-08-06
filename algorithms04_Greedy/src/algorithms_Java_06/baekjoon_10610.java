package algorithms_Java_06;

import java.io.*;
import java.util.*;
public class baekjoon_10610 {

	public static void main(String[] args) throws IOException{
		char[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
	      int sum = 0;
	      Arrays.sort(input);
	      StringBuilder sb = new StringBuilder();
	 
	      for(int i=input.length-1;i>=0;i--){
	         sum +=input[i]-'0';
	         sb.append(input[i]);
	      }
	 
	      //3의 배수,10의 배수 가능성 체크
	      if(sum%3!=0 || input[0]!='0'){
	         System.out.println(-1);
	         return;
	      }
	 
	      System.out.println(sb);
	   }
	}
