package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����>>");
		int first = scanner.nextInt();
		String oper = scanner.next();
		int second = scanner.nextInt();
		
		switch(oper) {
		case "+":
			System.out.println(first + oper + second +"�� ��� ����� " +(first+second));
			break;
		case "-":
			System.out.println(first + oper + second +"�� ��� ����� " +(first-second));
			break;
		case "*":
			System.out.println(first + oper + second +"�� ��� ����� " +(first*second));
			break;
		case "/":
			if(second == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else {
				System.out.println(first + oper + second +"�� ��� ����� " +(first/second));
		    }
			break;
	    }
		scanner.close();
   }
}
