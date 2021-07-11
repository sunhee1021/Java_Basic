import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
보조
DataOutPutStream, DataInPutStream
장점 : Java 8가지 기본타입 형식(write, read)
단 지들끼리만 놀아라...
>> txt 기록 >> 규칙적인 방법 >> 801002265 (읽을수가 없다(80점,100점...))
                        >> 80,100,22,65 >> split(구분점이 있어야한다.) > 배열 > 정수 > 연산
 */
public class Ex13_DataOutPutStream {

    public static void main(String[] args) {
        int[] score = {100,60,55,94,23};
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream("score.txt");
            dos = new DataOutputStream(fos);
            for(int i = 0; i < score.length; i++) {
                dos.writeInt(score[i]); //단 무조건 read DataInPutStream으로 읽어야함
                //dos.writeUTF(null); 한글, 영문 2또는 3byte 기준
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }finally {
            try {
                dos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }

    }

}
