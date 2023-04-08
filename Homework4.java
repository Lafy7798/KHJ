package org.javastudy.javashcool.homework;
import java.util.Scanner;

class Phone{
    private String name;
    private String phoneNumber;
    public Phone(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public void show(){
        System.out.println(this.name + "의 번호는 " + this.phoneNumber + " 입니다.");
    }
}
class PhoneBook{
    private Phone[] phones;
    private Scanner scanner;
    private String name;
    private boolean flag = false;
    public PhoneBook(){
        scanner = new Scanner(System.in);
    }
    public void run(){
        System.out.print("인원수>>");
        phones = new Phone[scanner.nextInt()];
        for(int i=0; i<phones.length; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            phones[i] = new Phone(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");
        while(true){
            System.out.print("검색할 이름>>");
            name = scanner.next();
            if(name.equals("그만")){
                break;
            }
            for(int i=0; i< phones.length; i++){
                if(phones[i].getName().equals(name)){
                    phones[i].show();
                    flag = true;
                }
            }
            if(!flag){
                System.out.println(name + "이 없습니다.");
            }
            else{
                flag = false;
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
public class Homework4 {
    public static void main(String[] args){
        new PhoneBook().run();
    }
}