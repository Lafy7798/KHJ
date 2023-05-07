package org.javastudy.javashcool.homework;

import java.util.*;
class Word {
    private String english;
    private String korean;
    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }
    public String getEnglish() { return english; }
    public String getKorean() { return korean; }
 
}
public class Homework6 {
    private String name; // 퀴즈 프로그램 이름
    private Vector<Word> v;
    private Scanner scanner;
    public Homework6(String name) {
        this.name = name;
        v = new Vector<Word>();
        scanner = new Scanner(System.in);
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("human", "인간"));
        v.add(new Word("stock", "주식"));
        v.add(new Word("trade", "거래"));
        v.add(new Word("society", "사회"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("honey", "꿀"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("example", "보기"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("statue", "조각상"));
    }
 
    private int makeExample(int ex[], int answerIndex) {
        int n[] = {-1, -1, -1, -1}; 
        int index;
        for(int i=0; i<n.length; i++) {
            do {
                index = (int)(Math.random()*v.size());
            } while(index == answerIndex || exists(n, index)); // 다시 시도
            n[i] = index;
        } 
        for(int i=0; i<n.length; i++) ex[i] = n[i];
        return (int)(Math.random()*n.length); // 정답
    }
 
    private boolean exists(int n[], int index) {
        for(int i=0; i<n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }
    private void test(){
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");
        while(true) {
            int answerIndex = (int)(Math.random()*v.size());  
            String eng = v.get(answerIndex).getEnglish(); // 문제 영어 단어
 
           
            int example[] = new int [4];
 
            int answerLoc = makeExample(example, answerIndex); 
            example[answerLoc] = answerIndex; 
 
            // 문제
            System.out.println(eng + "?");
            for(int i=0; i<example.length; i++)
                System.out.print("(" + (i+1) + ")" + v.get(example[i]).getKorean() + " "); // 보기 
 
            System.out.print(":>"); 
            try {
                int in = scanner.nextInt(); // 정답 입력
                if(in == -1) {
                    break; 
                }
                in--; 
                if(in == answerLoc)
                    System.out.println("Excellent !!");
                else
                    System.out.println("No. !!");
            }
            catch(InputMismatchException e) {
                scanner.next(); 
                System.out.println("숫자를 입력하세요 !!");
            }
        }
    } 
    public void run() {
        boolean flag = true;
        System.out.println("**** 영어 단어 테스트 프로그램" + "\"" + name + "\"" + "입니다.");
        while(flag){
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int select = scanner.nextInt();
            switch(select){
                case 1:
                    this.test();
                    break;
                case 2:
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true){
                        System.out.print("영어 한글 입력 >> ");
                        String english = scanner.next();
                        if(english.equals("그만")){
                            break;
                        }
                        String korean = scanner.next();
                        v.add(new Word(english, korean));
                    }
                    break;
                case 3:
                    System.out.print("\"" + name + "\"를 종료합니다...");
                    flag = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("잘못입력했습니다.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
    	Homework6 quiz = new Homework6("명품영어");
        quiz.run();
    }
}