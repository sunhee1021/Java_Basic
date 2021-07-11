import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
대상 read, write (File) >> 1.txt , 메모.txt

>>FileInputStream
>>FileOutputStream
//c드라이브에 Temp 폴더(a.txt파일만듬)
 */
public class Ex02_Point_FileStream {
    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path="C:\\Temp\\a.txt";
        
        try {
            fs = new FileInputStream(path);
            //fos = new FileOutputStream("C:\\Temp\\new.txt");
            fos = new FileOutputStream("C:\\Temp\\new.txt",true);
            
            //FileOutputStream
            //1.write 하는 파일이 존재하지 않으면 >> 파일을 생성
            //2.new FileOutputStream("C:\\Temp\\new.txt",false)
            //false가 의미하는게 -> overwrite(덮어쓰라는 의미)
            //append >> true 값을 가지게 해주면 됨
            //true를 해서 돌리면 덮어쓰는게 아니라 추가(?)연결됨
            //C드라이브에 temp폴더에 new파일 열어보면 
            //hello가 여러번 붙은게 확인됨
            
            int data = 0;
            while((data=fs.read()) != -1) {
                System.out.println("정수 : " + data); //char 정수 변환해서
                //문자값으로 캐스팅해야함
                System.out.println("문자 : " + (char)data);
                fos.write(data);
                //new.txt 파일에 data 값을 write 하겠다
                //돌렸더니 Temp 폴더에 new.txt 파일이 생성됬어
                //FileOutputStream write 할려고 하는 파일 없으면
                //파일도 생성(생성가능)
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //정상, 비정상 코드 수행 (강제적 실행) : return 있어도 실행
            //자원해제
            //명시적인 자원 해제(객체) >> 가비지 컬렉터 관리
            //가비지 컬렉터가 >> 관리하지 못하는 자원
            //I/O 자원, NetWork 자원 들은 관리 못함 >> 개발자가 직접 (명시적으로) 자원을 해제 시켜줘야함
            //ex.엑셀파일 작업 하고 있는데 다른 사람이 열면 >> 읽기 전용 or 작업중이라 수정할수없다 등등 안내
            //생성자 <-> 소멸자 호출
            try {
                fs.close();
                fos.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        
    }

}
