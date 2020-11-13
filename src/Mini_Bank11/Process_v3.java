package Mini_Bank11;

import java.util.Arrays;
import java.util.Scanner;

public class Process_v3 {

    Bank_v4 Bd = new Bank_v4();

    public void menu(Bank_v4[] users) {
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
                    input(users);
                    break;
                case 2:
                    show(users);
                    break;
                case 3:
                    deposit(users);
                    break;
                case 4:
                    withdraw(users);
                    break;
                case 5:
                    delete(users);
                    break;
            }
        } while (num != 9);
    }


    // 정보 받아서 유저 확인하기
    public int verifyinfo(Bank_v4[] users) {
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String tmp_id = scanner.next();
        System.out.print("PASS: ");
        String tmp_pass = scanner.next();
        //유저목록을 싹 돌면서 비어있는 것이 있으면 그 시점에서 모든걸 종료하고 리턴,
        //해당 위치의 인덱스를 반환하고 싹돌면서 비는게 없으면 -1를 반환
        for (int i = 0; i < users.length; i++) {
            if (tmp_id.equals(users[i].getId()) && tmp_pass.equals(users[i].getPass())) {
                return i;
            }
        }
        return -1;
    }

    // 아이디 추가 가능한지 확인 - 1번에서 사용
    public int checknull(Bank_v4[] users){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == null && users[i].getPass() == null) { // 0부터 돌면서 비어있는 위치를 찾는 것 -> 비어있으면 할당을 받아 아래에서 정보를 입력받은 것을 넣게된다.
                return i;
            }
        }
        return -1;
    }


    //1. 추가
    public void input(Bank_v4[] users) {
        Scanner scanner = new Scanner(System.in);
        int index = checknull(users);
        System.out.println(Arrays.deepToString(users));
        if (index != -1) {
            System.out.println("■ 추가기능입니다.");
            System.out.print("ID : ");
            users[index].setId(scanner.next());
            System.out.print("PASS: ");
            users[index].setPass(scanner.next());
            System.out.print("BALANCE : ");
            users[index].setBalance(scanner.nextInt());
            //System.out.println("등록된 정보 : " + Bd.getId() + ", " + Bd.getPass() + ", " + Bd.getBalance());
        } else {
            System.out.println("더 이상 신규가입이 불가능 합니다.\n");
        }
    }


    //2. 조회
    public void show(Bank_v4[] users) {
        int index = verifyinfo(users);

        if (index != -1) { // 정보가 맞아서 true를 받았다면 if 실행
            System.out.println("=====[ 조회결과 ]=====");
            System.out.println(Bank_v4.getCompany());
            System.out.println("ID : " + users[index].getId() + " PASS : " + users[index].getPass() + " BALANCE : " + users[index].getBalance());
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //3. 입금
    public void deposit(Bank_v4[] users) {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;

        int index = verifyinfo(users);

        if (index != -1) {// 정보가 맞아서 true를 받았다면 if 실행
            System.out.print("입금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance >= 0) {
                users[index].setBalance(users[index].getBalance() + tmp_balance);
            } else {
                System.out.println("입금할 금액을 확인해주세요.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //4. 출금
    public void withdraw(Bank_v4[] users) {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;

        int index = verifyinfo(users);

        if (index != -1) {// 정보가 맞아서 true를 받았다면 if 실행
            System.out.print("출금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance <= users[index].getBalance()) {
                users[index].setBalance(users[index].getBalance() - tmp_balance);
            } else {
                System.out.println("출금할 금액을 확인해주세요.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //5. 삭제
    public void delete(Bank_v4[] users) {

        int index = verifyinfo(users);

        if (index != -1) {// 정보가 맞아서 true를 받았다면 if 실행
            users[index].setId(null);
            users[index].setPass(null);
            users[index].setBalance(0);
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
    //9. 종료

}
