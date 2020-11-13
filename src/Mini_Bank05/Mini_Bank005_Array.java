package Mini_Bank05;

import java.util.Scanner;

public class Mini_Bank005_Array {

    public static void main(String[] args) {
        int num = 0, cnt = 0;
        int[] balance = {0, 0, 0};
        int[] age = new int[3];
        String[] id = new String[3];
        String[] pass = new String[3];
        String identi = "", password = ""; // num 2-5에서 입력받을 아이디,비번을 담을 변수
        String num2 = ""; // 아무거나 누르세요 > 변수
        int index = -1; // 유저가 아님을 의미하는 값으로 초기화해둔 것 (일치하는 유저가 없음을 의미)
        boolean verified = false; // 정보가 true일때 처리를 하기위하여 기본은 false

        Scanner scanner = new Scanner(System.in);


        for (; ; ) {

            System.out.println("======BANK=====");
            System.out.println("1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
            System.out.print("입력 >> ");
            num = scanner.nextInt();

            //TODO _1. 추가
            if (num == 1) {
                if (cnt >= 3) {
                    System.out.println("3명 초과로 등록이 불가능합니다.");
                    continue;
                }
                System.out.println("====계좌추가====");
                System.out.print("ID : ");
                id[cnt] = scanner.next();
                System.out.print("PASS: ");
                pass[cnt] = scanner.next();
                System.out.print("AGE : ");
                age[cnt] = scanner.nextInt();
                System.out.print("BALANCE : ");
                balance[cnt] = scanner.nextInt();
                System.out.println("등록된 정보 : " + id[cnt] + ", " + pass[cnt] + ", " + age[cnt] + ", " + balance[cnt]);
                cnt++;
                //break;
            }
            //TODO _2. 조회
            else if (num == 2) {
                System.out.print("ID : ");
                identi = scanner.next();
                System.out.print("PASS : ");
                password = scanner.next();
                for (int i = 0; i < id.length; i++) {
                    if (id[i] != null && id[i].equals(identi) && pass[i] != null && pass[i].equals(password)) { // 널안에는 이퀄즈라는 함수가 없어서 낫
                        verified = true;
                        index = i;
                    }
                }
                if (verified) {
                    verified = false;
                    System.out.println();
                    System.out.println("====조회결과====");
                    System.out.println("아이디 : " + id[index]);
                    System.out.println("나이 : " + age[index]);
                    System.out.println("잔액 : " + balance[index]);
                    System.out.println("암호 : " + pass[index]);
                    System.out.println("조회가 성공했습니다.");
                } else {
                    System.out.println("옳지 않은 정보입니다.");

                }
            }
            //TODO _3. 입금
            else if (num == 3) {
                System.out.print("ID : ");
                identi = scanner.next();
                System.out.print("PASS : ");
                password = scanner.next();
                for (int i = 0; i < id.length; i++) {
                    if (id[i] != null && id[i].equals(identi) && pass[i] != null && pass[i].equals(password)) { //아이디, 비밀번호 검토
                        verified = true;
                        index = i;
                    }
                }
                if (verified) {
                    verified = false;
                    System.out.print("입금액 : ");
                    balance[index] += scanner.nextInt();
                } else {
                    System.out.println("계좌 정보가 없습니다.");
                }
            }
            //TODO _4. 출금
            else if (num == 4) {
                System.out.print("ID : ");
                identi = scanner.next();
                System.out.print("PASS : ");
                password = scanner.next();
                for (int i = 0; i < id.length; i++) {
                    if (id[i] != null && id[i].equals(identi) && pass[i] != null && pass[i].equals(password)) { //아이디, 비밀번호 검토
                        verified = true;
                        index = i;
                    }
                }
                if (verified) {
                    verified = false;
                    System.out.print("출금액 : ");
                    balance[index] -= scanner.nextInt();
                } else {
                    System.out.println("계좌 정보가 없습니다.");
                }
            }
            //TODO _5. 삭제
            else if (num == 5) {
                System.out.print("ID : ");
                identi = scanner.next();
                System.out.print("PASS : ");
                password = scanner.next();
                for (int i = 0; i < id.length; i++) {
                    if (id[i] != null && id[i].equals(identi) && pass[i] != null && pass[i].equals(password)) { //아이디, 비밀번호 검토
                        verified = true;
                        index = i;
                    }

                }
                if (verified) {
                    verified = false;
                        System.out.print("삭제하시겠습니까? (Y/N) ");
                        String response = scanner.next();
                        if (response.equals("y") || response.equals("Y")) {
                            id[index] = null;
                            pass[index] = null;
                            balance[index] = 0;
                            age[index] = 0;
                        }
                    } else {
                        System.out.println("계좌 정보가 없습니다.");
                    }
                cnt--;
            }
            //TODO _9. 종료
            else if (num == 9) {
                break;
            }
        } //main for close
    }
}











