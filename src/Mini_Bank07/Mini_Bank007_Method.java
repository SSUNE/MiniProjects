package Mini_Bank07;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_Bank007_Method {

    /*
    private static Scanner scanner = new Scanner(System.in);
    private static int num = 0;
    private static int index = -1; //배열번호가 0부터 시작하므로 음수로 초기화
    private static int tmp_balance = 0; //입출금받을 변수
    private static String tmp_id = ""; // 입력받을 ID
    private static String tmp_pass = ""; // 입력받을 PASS
    */

    // Main
    public static void main(String[] args) {

        String[][] users = {{"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}}; // id, pass, age, balance
        int num = 0;

        do {
            num = menu();
            switch (num) {
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

    // 메뉴
    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("======BANK=====");
        System.out.println("1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
        System.out.print("입력 >> ");
        num = scanner.nextInt();
        return num;
    }

    //정보 받아서 유저 확인하기
    private static int verifyinfo(String[][] users) {
        Scanner scanner = new Scanner(System.in);
        String tmp_id = "", tmp_pass = "";
        System.out.print("ID : ");
        tmp_id = scanner.next();
        System.out.print("PASS: ");
        tmp_pass = scanner.next();
        //유저목록을 싹 돌면서 비어있는 것이 있으면 그 시점에서 모든걸 종료하고 리턴,
        //해당 위치의 인덱스를 반환하고 싹돌면서 비는게 없으면 -1를 반환
        for (int i = 0; i < users.length; i++) {
            if (tmp_id.equals(users[i][0]) && tmp_pass.equals(users[i][1])) {
                return i;
            }
        }
        return -1;
    }

    // 추가 가능한지 확인
    private static int checknull(String[][] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][0].equals("")) { // 0부터 돌면서 비어있는 위치를 찾는 것 -> 비어있으면 할당을 받아 아래에서 정보를 입력받은 것을 넣게된다.
                return i;
            }
        }
        return -1;
    }

    // 1. 추가
    private static void input(String[][] users) {
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        index = checknull(users);
        System.out.println(Arrays.deepToString(users));
        if (index != -1) { // length중에서 겹치않는 수를 입력,
            System.out.println("■ 추가기능입니다.");
            System.out.print("ID : ");
            users[index][0] = scanner.next();
            System.out.print("PASS: ");
            users[index][1] = scanner.next();
            System.out.print("AGE : ");
            users[index][2] = scanner.next();
            System.out.print("BALANCE : ");
            users[index][3] = scanner.next();
            System.out.println("등록된 정보 : " + users[index][0] + ", " + users[index][1] + ", " + users[index][2] + ", " + users[index][3]);
        } else {
            System.out.println("더 이상 신규가입이 불가능합니다.");
        }
    }

    //2. 조회
    private static void show(String[][] users) {
        int index = -1;
        index = verifyinfo(users);

        if (index != -1) {
            System.out.println("=====[ 조회결과 ]=====");
            System.out.println("ID : " + users[index][0] + " PASS : " + users[index][1] + " BALANCE : " + users[index][3]);
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //입금
    private static void deposit(String[][] users) {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;
        int index = -1;

        index = verifyinfo(users);
        if (index != -1) {
            System.out.print("입금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance >= 0) {
                users[index][3] = Integer.toString(Integer.parseInt(users[index][3]) + tmp_balance);
            } else {
                System.out.println("입금할 금액을 확인해주세요.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    //출금
    private static void withdraw(String[][] users) {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;
        int index = -1;

        index = verifyinfo(users);
        if (index != -1) {
            System.out.print("출금할 금액 > ");
            tmp_balance = scanner.nextInt();
            if (tmp_balance <= Integer.parseInt(users[index][3])) {
                users[index][3] = Integer.toString(Integer.parseInt(users[index][3]) - tmp_balance);
            } else {
                System.out.println("입금할 금액을 확인해주세요.");
            }
        }else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

    // 삭제
    private static void delete(String[][] users) {
        int index = -1;
        index = verifyinfo(users);
        if (index != -1) {
            users[index][0] = "";
            users[index][1] = "";
            users[index][2] = "";
            users[index][3] = "";
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }


}

