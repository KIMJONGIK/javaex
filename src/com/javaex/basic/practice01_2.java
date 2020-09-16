package com.javaex.basic;

import java.util.Scanner;

public class practice01_2 {

	public static void main(String[] args) {
//		Problem06();
		Problem07();
//		Problem08();
		}
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
		scanner.close();

	}
	public static void Problem07() {
		System.out.println("================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("================");
		
		double m = Math.random();
		int num = (int)(m*100);
		boolean key = true;
		while(key) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(">>");
			int ans = scanner.nextInt();
			
			if (ans==num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >> ");
				String a = scanner.next();
				
				if (a.equals("y") ) {
					System.out.println("================");
					System.out.println("[숫자맞추기게임 종료]");
					System.out.println("================");
					key = false;
					
				} else if ( a.equals("n")){
					m = Math.random();
					num = (int)(m*100);
					continue;
				}
			
				
			} else if ( ans > num ) {
				System.out.println("더 낮게");
				continue;
			} else if ( ans < num ) {
				System.out.println("더 높게");
				continue;
			}scanner.close();
		}
			
	}
		
		
	
	public static void Problem08() {
		boolean key = true;
		int account = 0;
		while(key) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.print("선택>");
			int num = scanner.nextInt();
			
			
			switch(num) {
			
			case 1:
				System.out.print("예금액>");
				int money = scanner.nextInt();
				account += money;
				System.out.println();
				continue;
			case 2:
				System.out.print("출금액>");
				money = scanner.nextInt();
				account -= money;
				System.out.println();
				continue;
			case 3:
				System.out.print("잔고액>");
				System.out.println(account);
				System.out.println();
				continue;
			case 4:
				System.out.println("프로그램 종료");
				key = false;
				break;
			default:
				
				System.out.println("다시 입력해주세요.");
				System.out.println();
				continue;
			}
			scanner.close();
		}
	
	}
}