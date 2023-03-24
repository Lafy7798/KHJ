package org.javastudy.javashcool.homework;
import java.util.Scanner;
public class Homework2{

    public static void main(String[] args){
        System.out.print("연산>>");
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
                System.out.print("0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }
            else{
                ans = a / b;
            }
        }
        else{
            System.out.print("잘못된 입력입니다.");
            scanner.close();
            return;
        }
        System.out.print(a+s+b+"의 계산 결과는 " + ans);

        scanner.close();
    }
}