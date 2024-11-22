package programmers;

public class Game369 {
	class Solution {
	    public int solution(int order) {
	        int answer = 0;

	        // order가 0이 될 때까지
	        while (order > 0) {
	            int digit = order % 10;  // order의 마지막 자릿수
	            if (digit == 3 || digit == 6 || digit == 9) {
	                answer++;  // 3, 6, 9가 있으면 박수 횟수 증가
	            }
	            order /= 10;  // 마지막 자릿수를 제거
	        }

	        return answer;
	    }
	}

}
