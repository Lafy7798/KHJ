package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework2{

    public static void main(String[] args){
        System.out.print("����>>");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        int ans = 0;
        if(s.equals("+")){
            ans = a + b;
        }
        else if(s.equals("-")){
            ans = a - b;
        }
        else if(s.equals("*")){
            ans = a * b;
        }
        else if (s.equals("/")){
            if(b == 0){
                System.out.print("0���� ���� �� �����ϴ�.");
                scanner.close();
                return;
            }
            else{
                ans = a / b;
            }
        }
        else{
            System.out.print("�߸��� �Է��Դϴ�.");
            scanner.close();
            return;
        }
        System.out.print(a+s+b+"�� ��� ����� " + ans);

        scanner.close();
    }
}