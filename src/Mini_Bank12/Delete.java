package Mini_Bank12;

import java.util.Scanner;

//유저 삭제클래스
public class Delete extends UserCheck implements Bank_Controller {
    @Override
    public void exec(Bank_v12 user1) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        if (verifyinfo(user1)) {
            System.out.print("삭제 하시겠습니까?(Y/N) > ");
            str = scanner.next();
            if (str.equalsIgnoreCase("Y")) {
                user1.setId("");
                user1.setPass("");
                user1.setBalance(0);
                System.out.println("삭제되었습니다");
            }else if (str.equalsIgnoreCase("N")){
                System.out.println("취소 되었습니다");
            }
        }//바깥 if end
        else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}
