package algorithms_Java01_h;

import java.util.*;
import java.io.*;

public class baekjoon_9012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			if(isValid(input)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
                stack.push(c);
            } else if (c == ')'){
                if (stack.isEmpty()) {
                    return false; //닫친 괄호만 있음 
                } else {
                    stack.pop(); // () 1개 
                }
            }    
		}
		return stack.isEmpty(); //스택이 비어있으면 짝을 다 찾은것 True
	}

}
