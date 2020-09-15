package com.javaex.basic;

import java.util.Arrays;
import java.util.Scanner;

public class practice01_1 {

	public static void main(String[] args) {
//		Problem01();
//		Problem02();
//		Problem03();
//		Problem04();
		Problem05();
	}
	
	public static void Problem01() {
		for (int i = 1; i <= 100; i++)
			if (i % 5 == 0 && i % 7 == 0)
				System.out.println(i);
	}
	public static void Problem02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d", i);
			}System.out.println("");
		}
			
	}
	public static void Problem03() {
		for (int i = 1; i <= 9; i++) {
			for ( int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println("");
		}
	}
	public static void Problem04() {
		for (int i = 1; i <= 10; i ++) {
			for (int j = 0; j <= 9; j ++) {
				System.out.printf("%d \t", i+j);
			}System.out.println("");
		}
	}
	public static void Problem05() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		int num1 = scanner.nextInt();
		System.out.print("숫자: ");
		int num2 = scanner.nextInt();
		System.out.print("숫자: ");
		int num3 = scanner.nextInt();
		System.out.print("숫자: ");
		int num4 = scanner.nextInt();
		System.out.print("숫자: ");
		int num5 = scanner.nextInt();
		
		int array[] = {num1, num2, num3, num4, num5};
		Arrays.sort(array);
		System.out.printf("최대값은 %d입니다.", array[array.length - 1]);	
	}
}
