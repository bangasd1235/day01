package day01;

import java.util.Scanner;

public class ExClass02 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num;
		num = a.nextInt();
		System.out.println("입력값 : " + num);
		
		double dou;
		System.out.println("실수 입력: ");
		dou = input.nextDouble();
		System.out.println("입력값 : " + dou);
		
		String str;
		System.out.println("문자열 입력: ");
		str = input.next();
		System.out.println("문자열 입력: " + str);
		
		
	}
}
