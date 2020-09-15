package com.javaex.basic;

import java.util.Scanner;

public class practice01_2 {

	public static void main(String[] args) {
//		Problem06();
//		Problem07();
		Problem08();	}
	public static void Problem06() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			int k = num/2;
			System.out.printf("%d", k*k + k);
	} else {
			int k = (num + 1)/2;
			System.out.printf("%d", k*k);
			}

	}
	public static void Problem07() {
		
	}
	public static void Problem08() {
		boolean key = true;
		while(key) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.print("선택>");
			int num = scanner.nextInt();
			
			switch(num) {
			
			case 1:
				System.out.println("예금액>");
				continue;
			case 2:
				System.out.println("출금액>");
				continue;
			case 3:
				System.out.println("잔고액>");
				continue;
			case 4:
				System.out.println("프로그램 종료");
				key = false;
				break;
			default:
				
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
		}
	
	}
}