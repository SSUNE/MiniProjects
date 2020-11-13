package Mini_Bank12;

import static Mini_Bank12.Bank_v12.getCompany;

//유저 조회클래스
public class Show extends UserCheck implements Bank_Controller {
    @Override
    public void exec(Bank_v12 user1) {
        if (verifyinfo(user1)) { // 정보가 맞아서 true를 받았다면 if 실행
            System.out.println("=====[ 조회결과 ]=====");
            System.out.println(getCompany());
            System.out.println("ID : " + user1.getId() + " PASS : " + user1.getPass() + " BALANCE : " + user1.getBalance());
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }

}