package day0120;
// 사용자로부터 월을 입력받아서 해당 월의 가장 마지막 날을 출력하는 프로그램

import java.util.Scanner;
public class Ex13Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("월을 입력해주세요 : ");
        int month = scanner.nextInt();
        
        switch(month) {
            case 2:
                System.out.println("28일까지입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일까지입니다.");
                break;
            default:
                System.out.println("31일까지입니다.");
                break;
        }

        scanner.close();
    }

}
