package day0126;
// 사용자로부터 로또 번호를 입력받는 프로그램
// 단 해당 번호가 중복이거나 1~45를 벗어나는 값이면
// 다시 입력을 받도록 만드시오

import java.util.Scanner;
public class Ex02LottoNumbers01 {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lottoNumbers = new int[SIZE]; 
        
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.println("로또번호를 선택해주세요.");
            System.out.println((i+1) +"번째 숫자: ");
            int userChoice = scanner.nextInt();
            
            while(userChoice < 1 || userChoice > 45) {
                System.out.println("1부터 45 사이의 번호를 선택해주세요.");
                System.out.println((i+1) +"번째 숫자: ");
                userChoice = scanner.nextInt();
            }
            
            for(int j = 0; j < lottoNumbers.length; j++) {
                if(userChoice == lottoNumbers[j]) {
                System.out.println("중복입니다. 다시입력해주세요.");
                System.out.println((i+1) +"번째 숫자: ");
                userChoice = scanner.nextInt();
                
                while(userChoice < 1 || userChoice > 45) {
                    System.out.println("1부터 45 사이의 번호를 선택해주세요.");
                    System.out.println((i+1) +"번째 숫자: ");
                    userChoice = scanner.nextInt();
                }
                j--;
            }

            }
            lottoNumbers[i] = userChoice;
            
        }
        

        for(int i = 0; i < lottoNumbers.length - 1; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            }
        }
        
        
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i]+" ");
        }
        
        
        
        scanner.close();
    }
}
