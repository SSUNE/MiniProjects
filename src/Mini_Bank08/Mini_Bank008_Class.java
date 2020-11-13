package Mini_Bank08;

import java.util.Scanner;

class Bank{
    //멤버변수
    String id;
    String pass;
    double balance;
    static String Company = "(주) SSUNE COMPANY";

    // 정보 받아서 유저 확인하기
    boolean verifyinfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String tmp_id = scanner.next();
        System.out.print("PASS: ");
        String tmp_pass = scanner.next();
        if (this.id.equals(tmp_id) && this.pass.equals(tmp_pass)) {
            return true; // 정보가 맞다면 true리턴
        }
        return false;
    }

    //0. menu
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("======BANK=====");
        System.out.println("1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
        System.out.print("입력 >> ");
        num = scanner.nextInt();
        return num;
    }

    //1. 신규가입
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("■ 추가기능입니다.");
        System.out.print("ID : ");
        this.id = scanner.next();
        System.out.print("PASS: ");
        this.pass = scanner.next();
        System.out.print("BALANCE : ");
        this.balance = scanner.nextDouble();

        System.out.println("등록된 정보 : " + this.id + ", " + this.pass + ", " + this.balance);

    }
    //2. 조회
    public void show() {
        if (verifyinfo()) { // 정보가 맞아서 true를 받았다면 if 실행
            System.out.println("=====[ 조회결과 ]=====");
            System.out.println(Company);
            System.out.println("ID : " + this.id + " PASS : " + this.pass + " BALANCE : " + this.balance);
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //3. 입금
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;

        if (verifyinfo()) {// 정보가 맞아서 true를 받았다면 if 실행
            System.out.print("입금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance >= 0) {
                this.balance = balance + tmp_balance;
            } else {
                System.out.println("입금할 금액을 확인해주세요.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //4. 출금
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;

        if (verifyinfo()) {// 정보가 맞아서 true를 받았다면 if 실행
            System.out.print("출금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance <= this.balance) {
                this.balance = balance - tmp_balance;
            } else {
                System.out.println("입금할 금액을 확인해주세요.");
            }
        }else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //5. 삭제
    public void delete() {

        if (verifyinfo()) {// 정보가 맞아서 true를 받았다면 if 실행
            this.id = "";
            this.pass = "";
            this.balance = 0;
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //9. 종료

    //생성자
    public Bank() {}

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Mini_Bank008_Class {
    public static void main(String[] args) {
        Bank  user1 = new Bank();
        int num = 0;
        do {
            switch (num = user1.menu()) {
                case 1: user1.input(); break;
                case 2: user1.show(); break;
                case 3: user1.deposit(); break;
                case 4: user1.withdraw(); break;
                case 5: user1.delete(); break;
            }
        } while (num != 9);
    }
}
