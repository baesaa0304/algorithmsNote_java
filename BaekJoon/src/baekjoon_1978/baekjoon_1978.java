package baekjoon_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1978 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < T; i++) {
        	int number = Integer.parseInt(st.nextToken());
        	if(number == 1) {
        		continue;
        	}
        	 boolean isPrime = true;
        	for(int j = 2; j < number; j++) {
        		if(number % j == 0) {
        			isPrime = false; // 나누어지면 소수가 아님
                    break;
        		}
        	
        	}
        	 if (isPrime) {
                 count++; // 소수라면 개수 증가
             }
        }
        System.out.println(count); // 소수의 개수 출력
	}

}
