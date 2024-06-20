package algorithms_Java01_06;

import java.io.*;
import java.util.*;

public class baekjoon_9093_char {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String input = br.readLine(); // 새로운 문장을 입력받음
            StringTokenizer st = new StringTokenizer(input); // 입력받은 문장을 단어별로 분리
            while(st.hasMoreTokens()) { // 단어가 있는 동안 반복
                String word = st.nextToken();
                char[] arr = word.toCharArray();
                char[] reversedArr = new char[arr.length];
                for(int j = 0; j < arr.length; j++) { // 수정된 부분
                    reversedArr[arr.length-1-j] = arr[j]; // 수정된 부분
                }
                String reversedStr = new String(reversedArr);
                System.out.print(reversedStr + " "); // 뒤집힌 단어 출력 후 공백 추가
            }
            System.out.println(); // 각 테스트 케이스 후 줄바꿈
        }
    }
}
