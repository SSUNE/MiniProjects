package Mini_Bank04;

import java.util.Scanner;

public class Mini_Bank004 {

    public static void main(String[] args) {
        // 변수
        Scanner scanner = new Scanner(System.in);
        int num = 0;                // 입력받는 변수 및 초기화
        String id = "";
        String pass = "";  // ID, PASSWORD 변수 및 초기화
        double balance = 10000;
        int inputmoney = 0, outputmoney = 0;

        // 입력
        for (; ; ) {
            for (; ; ) {
                System.out.println("======Bank======");
                System.out.println("1. 추가 \n" + "2. 조회\n" + "3. 입금\n" + "4. 출금\n" + "5. 삭제\n" + "9. 종료");
                System.out.println("입력 >>>  ");
                num = scanner.nextInt();
                if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9) {
                    break;
                }
            }

            if (num == 1) {
                System.out.println("■ 추가기능입니다.");
                System.out.println("▷ ID : ");
                id = scanner.next();
                if (id.equals("seon")) {
                    System.out.println("▷ PASS : ");
                    pass = scanner.next();
                    if (pass.equals("1986")) {
                        System.out.println("[설정되었습니다.]");
                        System.out.println("▷ ID : " + id);
                        System.out.println("▷ PASS : " + pass);
                    }

                } else if (num == 2) {
                    System.out.println("■ 조회기능입니다.");
                    System.out.println("▷ ID : ");
                    id = scanner.next();
                    if (id.equals("seon")) {
                        System.out.println("▷ PASS : ");
                        pass = scanner.next();
                        if (pass.equals("1986")) {
                            System.out.println("◆환영합니다 고객님!◆\n" + "본인확인ID : " + id + "\n본인확인PASS : " + pass + "\nbalance : " + balance);
                        } else if (!pass.equals("1986")) {
                            System.out.println("--다시 확인해 주세요!--");
                            return;
                        }
                    } else if (!id.equals("seon")) {
                        System.out.println("--다시 확인해 주세요.--");
                        return;
                    }
                } else if (num == 3) {
                    System.out.println("■ 입금기능입니다.");
                    System.out.println("▷ ID : ");
                    id = scanner.next();
                    if (id.equals("seon")) {
                        System.out.println("▷ PASS : ");
                        pass = scanner.next();
                        if (pass.equals("1986")) {
                            System.out.println("입금할 금액을 입력해주세요 >> ");
                            inputmoney = scanner.nextInt();
                            if (inputmoney >= 0) {
                                System.out.println("== 잔액확인" + "본인확인ID : " + id + "\n본인확인PASS : " + pass + "\nbalance : " + (balance + inputmoney));
                                balance += inputmoney;
                            } else {
                                System.out.println("금액이 모자랍니다.\n종료합니다.");
                                return;
                            }

                        } else if (!pass.equals("1986")) {
                            System.out.println("--다시 확인해 주세요!--");
                            return;
                        }
                    } else if (!id.equals("seon")) {
                        System.out.println("--다시 확인해 주세요.--");
                        return;
                    }
                } else if (num == 4) {
                    System.out.println("■ 출금기능입니다.");
                    System.out.println("▷ ID : ");
                    id = scanner.next();
                    if (id.equals("seon")) {
                        System.out.println("▷ PASS : ");
                        pass = scanner.next();
                        if (pass.equals("1986")) {
                            System.out.println("출금할 금액을 입력해주세요 >> ");
                            outputmoney = scanner.nextInt();
                            if (outputmoney >= 0) {
                                System.out.println("== 잔액확인" + "\n본인확인ID : " + id + "\n본인확인PASS : " + pass + "\nbalance : " + (balance - outputmoney));
                                balance -= outputmoney;
                            } else {
                                System.out.println("금액이 모자랍니다.\n종료합니다.");
                                return;
                            }

                        } else if (!pass.equals("1986")) {
                            System.out.println("--다시 확인해 주세요!--");
                            return;
                        }
                    } else if (!id.equals("seon")) {
                        System.out.println("--다시 확인해 주세요.--");
                        return;
                    }

                } else if (num == 5) {
                    id = "";
                    pass = "";
                    balance = 0;
                    System.out.println("■ 삭제기능입니다.");
                    System.out.println("== 잔액확인\n" + "본인확인ID : " + id + "\n" + "본인확인PASS : " + pass + "\n" + "balance : " + balance);
                    return;
                } else if (num == 9) {
                    System.out.println("■ 종료기능입니다.");
                    return;
                } else {
                    System.out.println("--없는 기능입니다.--");
                    return;
                }
            }
        }
    }
}
