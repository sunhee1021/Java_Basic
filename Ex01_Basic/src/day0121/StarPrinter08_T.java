package day0121;

import java.util.Scanner;
public class StarPrinter08_T {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*******별 찍기 8번*********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber -1; i++) {
            //윗부분 아랫부분 합쳐서 한번에 돌아가기 때문에
            // userNumber-1(윗부분) + userNumber(아랫부분) = 2 * userNumber - 1 이 된다.
            String stars = new String();
            
            if( i <= userNumber - 1) {
                //윗부분
                
                //공백을 담당하는 j for문
                for(int j = 1; j <= userNumber - i ; j++) {
                    stars += " ";
                }
                
                //별을 담당하는 j for문
                for(int j = 1; j <= i; j++) {
                    stars += "*";
                }
                
                
            }else {
                //5,6,7,8,9일때는 여기로 들어오는거임(->5,6,7,8,9를 1,2,3,4로 바뀔수있게 int lowerI = i - userNumber + 1;
                
                //아랫부분
                int lowerI = i - userNumber + 1;
                
                //5-5+1 
                //6-5+1
                //7-5+1
                //8-5+1
                //9-5+1 이 되는거임
                
                //공백을 담당하는 j for 문
                for(int j = 1; j <= lowerI - 1; j++) {
                    
                    stars += " ";
                    
                }
                
                //별을 담당하는 j for 문
                for(int j = lowerI; j <= userNumber; j++ ) {
                    stars += "*";
                }
            
        }
    
        System.out.println(stars);
        

    
     
        scanner.close();
    }
    }
}
