package algorithms_Java_01;

class Solution{
    public int solution(int n, int a, int b) {
        int answer = 0;
     // 참가자 A와 B가 같은 라운드에 만날 때까지 반복
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
public class programmers_12985 {

	public static void main(String[] args) {
		Solution so = new Solution();
		int i = 8;
		int j = 4;
		int m = 7;
		int result = so.solution(i, j, m);
		System.out.println(result);

	}

}
