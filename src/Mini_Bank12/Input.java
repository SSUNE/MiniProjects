package Mini_Bank12;

import java.util.InputMismatchException;
import java.util.Scanner;

//유저 추가클래스
public class Input implements Bank_Controller {
    @Override
    public void exec(Bank_v12 user1) {
        Scanner scanner = new Scanner(System.in);
        if (user1.getId()==null) {
            System.out.println("■ 추가기능입니다.");
            System.out.print("ID : ");
            user1.setId(scanner.next());
            System.out.print("PASS: ");
            user1.setPass(scanner.next());

            // 예외처리
            while (true) {
                try {
                    System.out.print("BALANCE : ");
                    user1.setBalance(scanner.nextDouble());
                    System.out.println("등록된 정보 : " + user1.getId() + ", " + user1.getPass() + ", " + user1.getBalance());
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력해주세요.");
                    scanner = new Scanner(System.in);
                    continue;
                }
                break;
            }
        }else {
            System.out.println("더 이상 가입이 안 됩니다.");
        }
    }
}