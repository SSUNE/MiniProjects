package Mini_Bank12;

import java.util.InputMismatchException;
import java.util.Scanner;

//출금 클래스
public class Withdraw extends UserCheck implements Bank_Controller {
    @Override
    public void exec(Bank_v12 user1) {
        Scanner scanner = new Scanner(System.in);
        int tmp_balance = 0;

        if (verifyinfo(user1)) {// 정보가 맞아서 true를 받았다면 if 실행
            System.out.print("출금할 금액 > ");
            //예외처리
            try {
                tmp_balance = scanner.nextInt();
                if (tmp_balance <= user1.getBalance()) {
                    user1.setBalance(user1.getBalance() - tmp_balance);
                } else {
                    System.out.println("입금할 금액을 확인해주세요.");
                }
            }catch(InputMismatchException e){
                System.out.println("숫자만 입력해주세요.");
            }// 예외처리 end

        }else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}