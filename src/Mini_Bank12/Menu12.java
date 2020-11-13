package Mini_Bank12;

import java.util.Scanner;

//메뉴판클래스
public class Menu12 implements Bank_Controller {
    Input input = new Input(); // 사용자정보저장
    Show show = new Show(); // 사용자정보조회
    Deposit deposit = new Deposit(); // 사용자 입금
    Withdraw withdraw = new Withdraw(); // 사용자 출금
    Delete delete = new Delete(); // 사용자 삭제

    @Override
    public void exec(Bank_v12 user1) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("======BANK=====");
            System.out.println("0. MENU\n1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
            System.out.print("입력 >> ");
            num = scanner.nextInt();
            switch (num) {
                case 0:
                    break;
                case 1:
                    input.exec(user1);
                    break;
                case 2:
                    show.exec(user1);
                    break;
                case 3:
                    deposit.exec(user1);
                    break;
                case 4:
                    withdraw.exec(user1);
                    break;
                case 5:
                    delete.exec(user1);
                    break;
            }
        } while (num != 9);
    }// Overrid end
}
