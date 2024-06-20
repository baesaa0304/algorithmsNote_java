package algorithms_Java01_06;

import java.io.*;
import java.util.*;

public class baekjoon_9093_Collections {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수 T를 입력받음
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 테스트 케이스의 모든 단어를 포함하는 문자열을 입력받음
            StringBuilder sb = new StringBuilder(); // StringBuilder를 사용하여 출력할 문자열을 구성
            while (st.hasMoreTokens()) { // 입력받은 문자열에서 처리할 단어가 남아있는 동안 반복
                String word = st.nextToken(); // 다음 단어를 가져옴
                char[] arr = word.toCharArray(); // 단어를 문자 배열로 변환
                List<Character> list = new ArrayList<>(); // 문자 배열의 각 문자를 저장할 리스트
                for(char c : arr) { // 문자 배열의 각 문자를 리스트에 추가
                    list.add(c);
                }
                Collections.reverse(list); // 리스트에 저장된 문자의 순서를 거꾸로 뒤집음
                for(char c : list) { // 뒤집힌 리스트의 각 문자를 StringBuilder에 추가
                    sb.append(c);
                }
                sb.append(" "); // 단어 사이에 공백 추가
            }
            System.out.println(sb.toString().trim()); // StringBuilder에 저장된 문자열을 출력하고 줄을 바꿈
        }
    }
}
