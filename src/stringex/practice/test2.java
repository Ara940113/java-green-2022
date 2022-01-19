package stringex.practice;

import java.util.Scanner;

class 개인정보 {
    private String name; // 이름
    private String tel; // 전화번호
    private char gender; // 성별
    private int age; // 나이

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        String[] tokens = data.split("-");

        if (tokens[0] == "A01") {
            for (int i = 1; i < 5; i++) {
                System.out.println(tokens[i]);
            }
        } else {
            System.out.println("프로그램 종료");
        }

        String name = tokens[1];
        String tel = tokens[2];
        // char gender = tokens[3];
        int age = Integer.parseInt(tokens[4]);
        // tokens[4]=age.trim();

        개인정보 doc1 = new 개인정보(

        );

    }
}
