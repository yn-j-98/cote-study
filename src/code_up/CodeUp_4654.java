package code_up;

import java.util.Scanner;

// 탑
public class CodeUp_4654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n; // 탑의 수
		while(true) {
			System.out.print("탑 수 입력 1 ~ 500,000 \n");
			n = sc.nextInt();
			if(n >= 1 && n <= 500000) {
				break;
			}
			System.out.println("1 ~500,000 사이로 다시 입력해주세요.");
		}
		
		int [] height = new int[n]; // 탑의 높이 배열
		
		// 입력한 탑의 수만큼 높이 입력받기
		for(int i=0; i <n; i++) {
			height[i] = sc.nextInt(); // 각 탑의 높이 입력
		}
		
		
		
		
		sc.close();
	}

}
