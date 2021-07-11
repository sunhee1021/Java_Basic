
public class Ex03_Cinema {

    public static void main(String[] args) {
        String[][] seat = new String[3][5];
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
               seat[i][j] = "__"; //좌석
           }
        }
//        for(int i = 0; i < seat.length; i++) {
//            for(int j = 0; j < seat[i].length; j++) {
//                System.out.print(seat[i][j]);//좌석
//            }
//            System.out.println();
//    }
        //좌석예매(언더바가 있는지 홍길동으로 되어있는지)
        seat[2][1] = "홍길동";
        seat[0][0] = "김유신";
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                System.out.printf("[%s]",seat[i][j].equals("__")?"좌석":"예매");//좌석
            }
            System.out.println();
        }
        
        int row, col; // 사용자 행 열 값을 받았다고 가정하고
        row = 1;
        col = 0;
        //예매를 하겠다 데이터 입력
        //입력했을때 seat이 __로 되어있으면 예약 가능
        //홍길동이나 김유신으로 바뀌어 있으면 __이 아니니까 예약 불가
        if(seat[row][col].equals("__")) {
            System.out.println("예약 가능한 좌석입니다.");
        }else {
            System.out.println("이미 예약 되었습니다.");
        }
        
        //좌석 초기화 (함수로 돌려도 될것같고)
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                seat[i][j] = "__"; //좌석
            }
        }
}

}







