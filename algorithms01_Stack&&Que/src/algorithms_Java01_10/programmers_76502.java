package algorithms_Java01_10;

import java.util.*;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        Queue<String> que = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i,i+1);
            que.add(str);
        }
        
        
        for(int i = 0; i < s.length(); i++){
            String first = que.poll();
            que.add(first);
            
            Stack<String> stack = new Stack<>();
            
            // stack에 전부 넣기
            for(int j = 0; j < s.length(); j++){
                String c = que.poll();
                que.add(c);
                
                if(stack.isEmpty()){
                    stack.push(c);
                } 
                else if(c.equals(")") && stack.peek().equals("(")){
                    stack.pop();
                }
                else if(c.equals("]") && stack.peek().equals("[")){
                    stack.pop();
                }
                else if(c.equals("}") && stack.peek().equals("{")){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
                
            }
            
            if(stack.isEmpty()){
                answer++;
            }
            
        }
        
        return answer;
    }
}

public class programmers_76502 {
	public static void main(String[] args) {
		String s = "[](){}";
        int result = Solution.solution(s);
        System.out.println("Result: " + result); // Output: Result: 3
	}
	
}
