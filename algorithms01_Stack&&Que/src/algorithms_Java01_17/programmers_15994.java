package algorithms_Java01_17;


import java.util.*;
/*
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    	Queue<String> queue = new LinkedList<>();
    	boolean Cards2 = false;
    	for(int i =0; i < cards1.length; i++) {
    		queue.offer(cards1[i]);
    		if(!Cards2) {
    			for(String j : cards2) {
    				queue.offer(j);
    			}
    			Cards2 = true; 
    		}
    	}
    	System.out.println(queue);
    	for(String s : goal) {
    		if(queue.isEmpty() || !queue.poll().equals(s)) {
                return "No";
    		}
    	}		
    	return "Yes";
    }
}
*/
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
//    	Queue<String> queue1 = new LinkedList<>();
//        Queue<String> queue2 = new LinkedList<>();
//        for(String i : cards1) {
//        	queue1.offer(i);
//        }
//        for(String i : cards2) {
//        	queue2.offer(i);
//        }
        for (String s : goal) {
            if (!queue1.isEmpty() && queue1.peek().equals(s)) {
                queue1.poll();
            } else if (!queue2.isEmpty() && queue2.peek().equals(s)) {
                queue2.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
public class programmers_15994 {

	public static void main(String[] args) {
		String card_1[] = {"i", "drink", "water"};
		String card_2[] = {"want", "to"};
		String goal[] = {"i", "want", "to", "drink", "water"};
		Solution solution = new Solution();
		String result = solution.solution(card_1, card_2, goal);
		System.out.println(result);
	}

}
