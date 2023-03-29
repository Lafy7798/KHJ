package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
		int n = (int)(Math.random()*3);
		System.out.println("가위 바위 보!>>");
		String rsp = sc.next();
		if(rsp.equals("그만")) {
			System.out.println("게임을 종료합니다.");
			break;
		}
			 if(str[n].equals(rsp)){
	                System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 비겼습니다.");
	            }
	            else {
	                if(str[n].equals("바위")){
	                    if(rsp.equals("보")){
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 이겼습니다.");
	                    }
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 졌습니다.");
	                    }
	                }
	                else if(str[n].equals("가위")){
	                    if(rsp.equals("바위")){
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 이겼습니다.");
	                    }
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 졌습니다.");
	                    }
	                }
	                else if(str[n].equals("보")){
	                    if(rsp.equals("가위")){
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 이겼습니다.");
	                    }
	                    else{
	                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + rsp + ", 졌습니다.");
	                    }
	                }
	            }

	        }
	        sc.close();
	    }
	}
