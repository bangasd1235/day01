package day01;

import java.util.Scanner;

public class ExClass02 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String name;
		int a,b,c ,sum;
		
		System.out.println("당신의 이름은 무엇입니까?");
		name = input.next();
		System.out.println(name + "님의 국어점수: ");
		a = input.nextInt();
		System.out.println(name + "님의 영어점수: ");
		b = input.nextInt();
		System.out.println(name + "님의 수학점수: ");
		c = input.nextInt();
		sum= a+b+c;
		System.out.println("=================================");
		System.out.println("이름 : "+name);
		System.out.println("=================================");
		System.out.println("국어"+a);
		System.out.println("영어"+b);
		System.out.println("수학"+c);
		System.out.println("=================================");
		System.out.println(sum);
		System.out.println("=================================");
		
		
	}
}
