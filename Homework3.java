package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
		int n = (int)(Math.random()*3);
		System.out.println("���� ���� ��!>>");
		String rsp = sc.next();
		if(rsp.equals("�׸�")) {
			System.out.println("������ �����մϴ�.");
			break;
		}
			 if(str[n].equals(rsp)){
	                System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �����ϴ�.");
	            }
	            else {
	                if(str[n].equals("����")){
	                    if(rsp.equals("��")){
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �̰���ϴ�.");
	                    }
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �����ϴ�.");
	                    }
	                }
	                else if(str[n].equals("����")){
	                    if(rsp.equals("����")){
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �̰���ϴ�.");
	                    }
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �����ϴ�.");
	                    }
	                }
	                else if(str[n].equals("��")){
	                    if(rsp.equals("����")){
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �̰���ϴ�.");
	                    }
	                    else{
	                        System.out.println("��ǻ�� = " + str[n] + ", ����� = " + rsp + ", �����ϴ�.");
	                    }
	                }
	            }

	        }
	        sc.close();
	    }
	}
