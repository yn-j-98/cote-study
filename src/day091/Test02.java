package day091;

import java.util.Scanner;
import java.util.Stack;

// 3117
public class Test02 {

	public static void main(String[] args) {
		
		
		// N 크기 만큼의 스택 공간 형성
		Scanner sc = new Scanner(System.in);
		System.out.print("N 크기 만큼의 스택 공간 형성 \n"); 
		int N = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// ※ ctrl C, V ==>> 반복문
		// ※ while VS for
		for(int i=0; i<N; i++) {
			System.out.print("data 입력 \n");
			int data = sc.nextInt();
			if(data != 0) {
				stack.push(data);
			}
			else {
				stack.pop();
			}
		}
		
		// N 개의 데이터를 입력받을것임
		//	0이 아니면 그냥 스택에 저장저장
		//	0이면 데이터 제거
		
		
		// 마지막에 스택에 남아있는 모든 데이터 총합
		int total = 0;
		for(int v:stack) {
			total += v;
		}
		System.out.println("마지막에 스택에 남아있는 모든 데이터 총합"+total);
		
		sc.close();
		
		

	}

}
