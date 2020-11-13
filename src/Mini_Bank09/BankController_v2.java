package Mini_Bank09;

import java.util.Scanner;

public class BankController_v2 {

    BankDto_v2 Bd = new BankDto_v2();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("======BANK=====");
            System.out.println("0. MENU\n1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
            System.out.print("입력 >> ");
            num = scanner.nextInt();
            switch (num) {
                case 0:
                    break;
                case 1:
                    input();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    delete();
                    break;
            }
        } while (num != 9);
    }


    // 정보 받아서 유저 확인하기
    boolean verifyinfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String tmp_id = scanner.next();
        System.out.print("PASS: ");
        String tmp_pass = scanner.next();
        if (tmp_id.equals(Bd.getId()) && tmp_pass.equals(Bd.getPass())) {
            return true; // 정보가 맞다면 true리턴
        }
        return false;
    }

    //1. 추가
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("■ 추가기능입니다.");
        System.out.print("ID : ");
        Bd.setId(scanner.next());
        System.out.print("PASS: ");
        Bd.setPass(scanner.next());
        System.out.print("BALANCE : ");
        Bd.setBalance(scanner.nextInt());
        System.out.println("등록된 정보 : " + Bd.getId() + ", " + Bd.getPass() + ", " + Bd.getBalance());
    }

    //2. 조회
    public void show() {
        if (verifyinfo()) { // 정보가 맞아서 true를 받았다면 if 실행
            System.out.println("=====[ 조회결과 ]=====");
            System.out.println(BankDto_v2.getCompany());
            System.out.println("ID : " + Bd.getId() + " PASS : " + Bd.getPass() + " BALANCE : " + Bd.getBalance());
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
                Bd.setBalance(Bd.getBalance() + tmp_balance);
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
            if (tmp_balance <= Bd.getBalance()) {
                Bd.setBalance(Bd.getBalance() - tmp_balance);
            } else {
                System.out.println("출금할 금액을 확인해주세요.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //5. 삭제
    public void delete() {

        if (verifyinfo()) {// 정보가 맞아서 true를 받았다면 if 실행
            Bd.setId("");
            Bd.setPass("");
            Bd.setBalance(0);
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //9. 종료

}
