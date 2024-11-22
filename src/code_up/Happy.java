package code_up;

import java.util.Scanner;

// 4891
public class Happy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n; // 학생 수
		// 학생수 유효값 검사
        while(true) {
            System.out.print("학생 수를 입력하세요 2 ~ 1000 \n");
            n = sc.nextInt();
            if (n >= 2 && n <= 1000) {
                break;
            }
            System.out.println("학생 수는 2 이상 1000 이하로 입력해야 합니다.");
        }
        
        // 점수 배열 
		int[] scores = new int[n];
		
		// 점수 입력
        System.out.println("학생들의 점수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // 최대값 / 최소값 점수 변수 초기화
        
		int max = scores[0];
		int min = scores[0];
		
		// 점수 비교를 통해 최대값, 최소값 찾기
        for (int i = 1; i < n; i++) {
        	
        	// 배열에 저장된 값이 max 값보다 크다면
            if (scores[i] > max) {
            	// 해당 값을 max에 저장
                max = scores[i];
            }
            
            // 배열에 저장된 값이 min 값보다 작다면
            if (scores[i] < min) {
            	// 해당 값을 min에 저장
                min = scores[i];
            }
        }

        
        System.out.println("가장 높은 점수 : "+max);
        System.out.println("가장 낮은 점수 : "+min);
        System.out.println("두 점수의 차이 : "+(max-min));
		
		

		sc.close();
	}
	
  
}
