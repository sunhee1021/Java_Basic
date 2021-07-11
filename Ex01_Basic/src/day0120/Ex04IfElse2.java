package day0120;

import java.util.Scanner;

public class Ex04IfElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1. 사용자로부터 숫자를 입력 받아서 홀수인지 짝수인지 출력하는 코드를 작성하세요.
        System.out.print("숫자를 입력해주세요: ");
        int number = scanner.nextInt();
        if((number%2)!=0) {
            //or (number % 2 == 1)
            System.out.println("홀수입니다.\n");
        }else {
            System.out.println("짝수입니다.\n");
        }
        
        // 2. 나이를 입력받아서 성인인지 미성년자인지 출력하는 코드를 작성하시오.
        System.out.print("나이를 입력해주세요: ");
        int age = scanner.nextInt();
        if(age>=19) {
            System.out.println("성인입니다.\n");
        }else {
            System.out.println("미성년자입니다.\n");
        }
        
        // 3. 사용자로부터 id와 비밀번호를 입력받아서
        //    id가 admin, 비밀번호가 12345가 맞으면 로그인성공
        //    그 외에는 로그인 실패가 출력되는 코드를 작성하시오.
        
        System.out.print("ID: ");
        //nextInt를 쓰다가 nextLine을 쓰려니 scanner.nextLine을 써줘야함
        scanner.nextLine();
        String id = scanner.nextLine();
        
        System.out.print("PW: ");
        //여기는 scanner.nextLine을 안적어도됨
        String password = scanner.nextLine();
        
        if(id.equals("admin") && password.equals("12345")) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
        
        scanner.close();
    }

}
