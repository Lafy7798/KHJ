package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산>>");
		int first = scanner.nextInt();
		String oper = scanner.next();
		int second = scanner.nextInt();
		
		switch(oper) {
		case "+":
			System.out.println(first + oper + second +"의 계산 결과는 " +(first+second));
			break;
		case "-":
			System.out.println(first + oper + second +"의 계산 결과는 " +(first-second));
			break;
		case "*":
			System.out.println(first + oper + second +"의 계산 결과는 " +(first*second));
			break;
		case "/":
			if(second == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(first + oper + second +"의 계산 결과는 " +(first/second));
		    }
			break;
	    }
		scanner.close();
   }
}
