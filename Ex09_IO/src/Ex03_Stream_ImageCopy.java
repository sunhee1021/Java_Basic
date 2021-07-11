import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
    public static void main(String[] args) {
        String orfile = "C:\\Temp\\1.jpg";
        String tarfile = "copy.jpg";
        //경로를 주지않고 그냥 copy를 하면
        //dafault 경로 : 프로젝트 폴더
        //C:\Users\bitcamp\eclipse-workspace\Ex09_IO\copy.jpg
        
        FileInputStream fs = null;
        FileOutputStream fo = null;
        //이게 try안으로 들어가면 block변수가 되버려서
        //finally 에서 밑에 try에서 인식을 못함
        //그래서 위에서 쓰는거임
        
        try {
            fs = new FileInputStream(orfile);
            fo = new FileOutputStream(tarfile,false); //파일이 없으면 생성하고 write까지 같이한다
            int data  = 0;
            while((data = fs.read()) != -1){
                fo.write(data); //copy.jpg 에서 byte값을 write 하는 거임
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fs.close();
                fo.close();
            } catch (Exception e2) {

            }
        }
    }

}
