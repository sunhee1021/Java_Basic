import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {

    public static void main(String[] args) {
        //출력형식의 정의
        //printf , String.format
        //출력물에 대한 형식 정의(레포팅) >> txt >> 이쁘게
        //현업 : 레포팅 : 툴 >> 오즈, 크리스탈 레포트 소프트웨어
        //PrintWriter 그림
        try {
            /*
            PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt"); //생성기능
            pw.println("********************************************");
            pw.println("******************HOMEWORK******************");
            pw.println("********************************************");
            pw.printf("%3s : %5d  %5d  %5d  %5.1f", "아무개",100,90,50,(float)(100+90+50)/3);
            pw.println();
            pw.close();
            */
           
            //line 단위로 기록하고 있음(PrintWriter가)
            //read도 line 단위로
            FileReader fr = new FileReader("C:\\Temp\\homework.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            
            br.close();
            fr.close();
        }catch (Exception e) {
            // TODO: handle exception
        }
    }

}
