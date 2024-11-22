package day091;

import java.util.Arrays;
import java.util.Scanner;

// 행복
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// 배열이 주어졌을 때
		int[] datas = new int[N];
		for(int i=0; i<datas.length;i++) {
			datas[i] = sc.nextInt();
		}

		// 가장 큰 점수를 찾고,		
		// 가장 작은 점수를 찾는다.
		int max = Arrays.stream(datas).max().getAsInt();
		int min = Arrays.stream(datas).min().getAsInt();
		
		int res = max-min;
		System.out.println(res);
		
		// 큰 수 - 작은 점수 = 정답
	}

}
