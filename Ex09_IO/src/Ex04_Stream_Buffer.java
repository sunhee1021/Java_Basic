import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
File 처리 (Disk) : 원칙 한 Byte 단위로 read , write
모아 모아서 한번에 하고 싶음 read, write (버스대절(ex.20명 한도일때) >> 20명 타)
                                 //한번에 최대수 태워서 내려놓고 또 다시 최대수 태워서 내려놓고 하는 작업
버스 : buffer
1. I/O 성능(횟수)
2. Line 단위 (엔터)

보조 스트림 : BufferedInputStream (주 클래스 의존)
개발자 의무적 사용...


 */
public class Ex04_Stream_Buffer {
    public static void main(String[] args) {
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    
    try {
        fos = new FileOutputStream("data.txt"); //data.txt.가 없으면 파일도 생성하고 write까지 같이한다
        bos = new BufferedOutputStream(fos); //혼자 못쓰임 default 생성자가 없어서 , 그래서 fos를 넣어줘야함
        
        for(int i = 0; i < 10; i++) {
            bos.write('A');
        }
        //bos.flush();
        
        //JAVA Buffer 크기 : 8kbyte : 8192byte
        //1. buffer 안에 내용이 채워지면 스스로 출발(비운다) : flush
        //2. buffer 강제로 비우기 (명시적으로 flush를 호출) : flush()
        //3. bos.close(); 자원해제 >> 자동으로 flush 함수를 호출
        
        
        
    } catch (Exception e) {
        // TODO: handle exception
    }finally {
        try {
            bos.close(); //flush 동반
            fos.close();
        } catch (Exception e2) {
            // TODO: handle exception
        }
    }
    
    
        
    }

}
