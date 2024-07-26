package algorithms_Java_05;

import java.util.HashMap;
import java.util.HashSet;
//
//class Solution {
//    public int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = new int[id_list.length];
//        // 각 아이디에 신고한 유저들을 넣어준다.
//        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
//        HashMap<String, Integer> reportCount = new HashMap<>();
//
//        // 신고 처리
//        for (String r : report) {
//            String[] parts = r.split(" ");
//            String reporter = parts[0]; // 신고한 아이디
//            String reported = parts[1]; // 신고당한 아이디
//
//            // 신고한 아이디가 id_list에 있는 경우에만 처리
//            reportMap.putIfAbsent(reported, new HashSet<>());
//            reportMap.get(reported).add(reporter); // 신고자 추가
//            // 신고당한 횟수 증가
//            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
//            
//            
//        }
//
//        // 결과 배열 계산
//        for (String reportedId : reportCount.keySet()) {
//            int count = reportCount.get(reportedId);
//            if (count >= k) { // 신고당한 횟수가 k 이상인 경우
//                for (int i = 0; i < id_list.length; i++) {
//                    if (reportMap.containsKey(reportedId) && reportMap.get(reportedId).contains(id_list[i])) {
//                        answer[i]++;
//                    }
//                }
//            }
//        }
//
//        return answer; // 괄호 닫기 수정
//    }
//}


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCount = new HashMap<>();

        // 신고 처리
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0]; // 신고한 아이디
            String reported = parts[1]; // 신고당한 아이디

            // 신고한 아이디가 id_list에 있는 경우에만 처리
            reportMap.putIfAbsent(reported, new HashSet<>());
            if (!reportMap.get(reported).contains(reporter)) { // 중복 신고 확인
                reportMap.get(reported).add(reporter); // 신고자 추가
                // 신고당한 횟수 증가
                reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            }

        }

        // 결과 배열 계산
        for (String reportedId : reportCount.keySet()) {
            int count = reportCount.get(reportedId);
            if (count >= k) { // 신고당한 횟수가 k 이상인 경우
                for (int i = 0; i < id_list.length; i++) {
                    if (reportMap.containsKey(reportedId) && reportMap.get(reportedId).contains(id_list[i])) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}

public class programmers_92344 {

	public static void main(String[] args) {
		Solution so = new Solution();
		String id[] = {"muzi", "frodo", "apeach", "neo"};
		String reports[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int i = 2;
		int result[] = so.solution(id, reports, i);
		for(int j : result) {
			System.out.println(j);
		}

	}

}
