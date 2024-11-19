package day091;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] datas = new int[N];
		for(int i=0; i<datas.length;i++) {
			datas[i]=sc.nextInt();
		}
		// N마리의 소
		// N개의 배열
		// 배열에 소들의 키를 저장
		int count = 0;
		// index - --->> N 헤어를 확인
		for(int i=0; i<N; i++) {
			/* datas[0]이랑 datas[1]랑 비교하고,
			 datas[0]이랑 datas[2]랑 비교하고,,,
			 datas[0]이랑 datas[3]랑 비교하고,
			 datas[1]이랑 datas[2]랑 비교하고..
			 ctrl c+v네?
			 끝이 정해져 있으므로
			*/
			// 1) 범위가 정해져 있다.
			for(int j=i+1; j<N; j++) {
				if(datas[i] <= datas[j]) {
					break;
				}
				
				count++;
			}
			
			// 2) 정확한 반복횟수를 모른다.
			int j = i+1;
			while(datas[i] > datas[j] && j<N) {
				count++;
				j++;
			}
			
		}
		// datas[0] > datas[1] 헤어 확인 가능
		//		계속 확인 가능
		// datas[0] <= datas[1] 헤어 확인 불가능
		// 더이상 확인할 수 없음
		
		// 확인횟수를 출력
		
		System.out.println(count);
		
	}
}
