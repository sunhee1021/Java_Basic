package day0121;

import java.util.Scanner;
public class StarPrinter10_T {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*******별 찍기 10번*********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int num = scanner.nextInt();
       
        //맨첫번째줄이나 마지막줄은 먼저 처리를 해줘야함
        //먼저 처리하고 중간을 위아래로 나눠서 처리
        
        for(int i = 1; i <= 2 * num - 1; i++){
            String stars = new String();
            
            int totalWidth = 2 * num - 1;
            //총 폭의 변수
            //폭에서 별의 개수를 빼면 공백의 개수니까
            //그걸 계산하기 위한 변수
            
            
            //맨마지막줄을 9라고 하면 안되고 2*num-1로 해줘야함
            if(i == 1 || i == 2 * num - 1) {
                
                //첫번째 줄 혹은 제일 마지막줄 인 경우
                //별을 2*num-1개 만큼 넣어준다
                for(int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
                
            }else if(i <= num -1) {
                
                int upperI = i - 1;
                //2,3,4 자리를 1,2,3으로 하기위함 더 편하니까
                
                int starWidth = num - upperI;
                //해당 줄의 왼쪽 혹은 오른쪽의 별의 갯수
                
                
                //왼쪽 별 부분    
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                //해당 줄의 공백의 갯수
                //= 총 너비 - 별의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                //가운데 공백 부분
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                
                //오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                               
                
                
            }else {
                // 맨 마지막 줄을 제외한 아랫부분
                int lowerI = i - num + 1;
                
                // 해당 줄의 별의 갯수
                int starWidth = lowerI;
                
                // 왼쪽 별을 담당하는 j for문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                // 해당 줄의 공백의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                // 가운데 공백을 담당하는 j for문
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                // 오른쪽 별을 담당하는 j for문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }
            
            
            System.out.println(stars);
        }
        
        
        
        scanner.close();
    }
}
