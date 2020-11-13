package Mini_Bank01;

import java.util.Scanner;

public class Mini_Bank001 {
    public static void main(String[] args) {
        // 변수
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("======Bank======");
        System.out.println("1. 추가 \n" + "2. 조회\n" + "3. 입금\n" + "4. 출금\n" + "5. 삭제\n" + "6. 종료");
        System.out.println("입력 >>>  ");
        num = scanner.nextInt();

        System.out.println((num == 1) ? "추가기능입니다" :
                (num == 2) ? "조회기능입니다" :
                        (num == 3) ? "입금기능입니다" :
                                (num == 4) ? "출금기능입니다" :
                                        (num == 5) ? "삭제기능입니다" :
                                                (num == 6) ? "종료기능입니다" : "");
    }
}
