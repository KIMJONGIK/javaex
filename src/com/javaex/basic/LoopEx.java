package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		dowhileEx();
//		forEx();
//		continueEx();
//		breakEx();
//		randomEx();
//		guguFor();
//		starsFor();
		guguwhile();
	}
	public static void randomEx() {
		System.out.println(Math.random());	//	0.0	이상 1.0 미만의 실수값
		//	정수 난수의 공식: (int)Math.random() * 최댓값 + 최솟값
		
		//	1 ~ 45 사이의 임의의 숫자를 6개 추출해 봅시다.
		for (int i = 1; i <= 6; i++) {
			System.out.print((int)(Math.random() * 45) + 1);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void breakEx() {
		//	루프 도중, break문을 만나면
		//	해당 루프문을 종료하고 탈출
		
		//	1부터 증가시키면서 6과 14로 모두 나누어 떨어지는 수를 구하자
		int num = 1;
		
		while(true) {	//	무한루프
			if (num % 6 == 0 && num % 14 == 0) break;
			num ++;
		}
		System.out.print(num);
	}
	
	public static void continueEx() {
		//	루프 도중, continue를 만나면
		//	남은 코드를 실행하지 않고 다음 번 루프를 수행
		
		//	1부터 100까지 루프를 돌면서 2의 배수, 3의 배수는 출력하지 않고 다음 번 루프 수행
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) continue;
			
			System.out.print(i + " ");
		}
	}
	public static void guguwhile() {
		//	2단부터 9단까지의 구구단을 while문을 이용하여 출력
		int i = 1;		
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {			
				System.out.print(j + " * " + i + " = " + j*i + "\t");
				j++;
			} i++;
			System.out.println("");
		}
		
	}
	public static void guguFor() {
		//	2단부터 9단까지의 구구단을 for문을 이용하여 출력
		
		for (int i = 1; i <= 9; i++) {
			for ( int j = 1; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println("");
		}
				
	}
	public static void starsFor() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}System.out.println(" ");	
		}
	}
	public static void forEx() {
		//	단을 입력 받아서 해당 단의 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = scanner.nextInt();
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + dan * num);
		}
		scanner.close();
	}
	public static void dowhileEx() {
		//	while문은 조건 비교부터 -> 초기 조건 자체가 false면 단 한번도 실행되지 않음
		int value = 0;
		int total = 0;
		
		//	최소 1회는 실행하는 반복문 -> do ~ while
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요[0이면 quit]:");
		
		do {
			value = scanner.nextInt();
			total += value;
			System.out.println("합계:" + total);
		} while(value != 0); 		//	입력 값이 0이 아니면 반복
				
		scanner.close();
	}
	public static void whileEx() {
		//	단을 입력 받아서 해당 단의 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = scanner.nextInt();
		
		//	제어용 변수
		int num = 1;
		
		while(num <= 9) {	// 9이하일 때 반복
			System.out.println(dan + " * "+ num + " = " + dan * num);
			//	while 문은 종료 조건을 개발자가 맞춰주어야 한다.
			num++;
		}
		scanner.close();
	}
}
