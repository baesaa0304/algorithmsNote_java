package algorithms_Java_08;

import java.util.*;
import java.io.*;

public class baekjoon_2309 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int[] dwarfs = new int[9]; 
	        int total = 0;
	        int a = -1 , b = -1;
	        for (int i = 0; i < 9; i++) {
	            int n = Integer.parseInt(br.readLine());
	        	dwarfs[i] = n;
	            total += dwarfs[i];
	        }
	        for (int i = 0; i < 9; i++) {
	            for (int j = i + 1; j < 9; j++) {
	                if (total - dwarfs[i] - dwarfs[j] == 100) {
	                	i = a; 
	                    j = b;
	                    break;     
	                }
	            }
	        }
	        Arrays.sort(dwarfs);  
	        for (int i = 0; i < 9; i++) {
	            if (dwarfs[i] != -1) {  
	                System.out.println(dwarfs[i]);
	            }
	        }
	    }
	}

