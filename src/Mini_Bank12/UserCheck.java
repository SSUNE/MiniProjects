package Mini_Bank12;

import java.util.Scanner;

public class UserCheck {
    public UserCheck() {
    }
    boolean verifyinfo(Bank_v12 user1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String tmp_id = scanner.next();
        System.out.print("PASS: ");
        String tmp_pass = scanner.next();
        if (tmp_id.equals(user1.getId()) && tmp_pass.equals(user1.getPass())) {
            return true; // 정보가 맞다면 true리턴
        }
        return false;
    }

}
