package baekjoon_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 10진
        int B = Integer.parseInt(st.nextToken()); // 진
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int number = N % B;
            if (number < 10) {
                sb.append(number);
            } else {
                sb.append((char) ('A' + (number - 10))); 
            }
            N /= B;
        }
        
        System.out.println(sb.reverse().toString());
        //System.out.println(sb.toString());
    }

}
