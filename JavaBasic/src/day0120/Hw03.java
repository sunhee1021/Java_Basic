package day0120;

import java.util.Scanner;
public class Hw03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year, month, day;
        
        System.out.print("태어난 년도: ");
        year = scan.nextInt();
        System.out.print("태어난 달: ");
        month = scan.nextInt();
        System.out.print("태어난 날: ");
        day = scan.nextInt();
        
        System.out.println("당신은 "+year+"년 "+month+"월 "+day+"일에 태어났습니다.");
        System.out.printf("당신의 주민번호 앞자리는 %d%d%d", year % 100,month,day);
        
        // 1999
        // 1999 / 100 = 19
        // 1999 % 100 = 99 (나머지)
        
        scan.close();

}

}