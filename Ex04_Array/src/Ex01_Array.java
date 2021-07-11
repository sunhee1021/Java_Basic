

public class Ex01_Array {

    public static void main(String[] args) {
        //다차원 배열(2차원)
        //[행][열]
        //좌석(교실의 좌석), 지도 좌표값(경도, 위도), 바둑, 영화관 좌석
        
        int[][] score = new int[3][2];
        System.out.println(score[0][0]); //초기화를 한것이 아니고 default
        score[0][0] = 100;
        score[0][1] = 200;
        
        score[1][0] = 300;
        score[1][1] = 400;
        
        score[2][0] = 500;
        score[2][1] = 600;
        
        //2차원 배열의 값을 출력
        //for 2개
        //행의 개수 : 배열이름.length >> score.length
        //열의 개수(열의 개수는 행마다 다를 수 있다) : 배열이름[0].length
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
            }
            System.out.println();
        }
        
        //3행2열짜리 초기화
        int[][] score3 = new int[][] {
            {11,12},
            {13,14},
            {15,16}
        };
        
        //퀴즈
        //개선된 for문을 통해서 score3이 갖고 있는 배열의 값을 출력 (2개)
        //for(int value : Array){}
        //잔머리를 사용해서
        //2차원 배열의 그림
        int[] arr = {10,20,30};
        for(int value : arr) {
            System.out.println(value);
        }
        for(int[] col : score3) {
            for(int value : col) {
                System.out.println("값 : " + value);
            }
        }
        
      
    }

}














