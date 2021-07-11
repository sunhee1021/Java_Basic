import java.io.FileReader;
import java.io.FileWriter;

/*
 한글처리 ....
 문자기반의 데이터 처리가 가능한 형태로 - (String 데이터를 처리하겠다 >> char[] 관리)
 
 한글 1자, 영문자 1자 >> 2바이트로 통일해서 가겠다
 
 Reader, Writer
 
 대상 : 앞에 File만 붙이면 됨

 */
public class Ex05_Reader_Writer {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); //이 파일을 read해서
            fw = new FileWriter("copy_Stream.txt"); //파일을 생성하고 그 파일을 write까지 하는 작업
            
            int data = 0;
            while((data = fr.read()) != -1) {
                //System.out.print((char)data);
                
                //배포 하는 파일은 보통 압축파일(압축: 엔터 공백 스페이스가 없는 파일)
                if(data != '\n' && data != '\r' && data!= '\t' && data !=' ') {
                    fw.write(data);    
                }
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            try {
                fw.close();
                fr.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
    }

}
