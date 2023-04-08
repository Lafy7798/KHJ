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
        System.out.println(this.name + "�� ��ȣ�� " + this.phoneNumber + " �Դϴ�.");
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
        System.out.print("�ο���>>");
        phones = new Phone[scanner.nextInt()];
        for(int i=0; i<phones.length; i++){
            System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
            phones[i] = new Phone(scanner.next(), scanner.next());
        }
        System.out.println("����Ǿ����ϴ�...");
        while(true){
            System.out.print("�˻��� �̸�>>");
            name = scanner.next();
            if(name.equals("�׸�")){
                break;
            }
            for(int i=0; i< phones.length; i++){
                if(phones[i].getName().equals(name)){
                    phones[i].show();
                    flag = true;
                }
            }
            if(!flag){
                System.out.println(name + "�� �����ϴ�.");
            }
            else{
                flag = false;
            }
        }
        System.out.println("���α׷��� �����մϴ�.");
        scanner.close();
    }
}
public class Homework4 {
    public static void main(String[] args){
        new PhoneBook().run();
    }
}