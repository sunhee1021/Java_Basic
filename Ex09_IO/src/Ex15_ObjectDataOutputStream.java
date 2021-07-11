import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;
//분해해서 보내는 남자친구 입장
public class Ex15_ObjectDataOutputStream {
    public static void main(String[] args) {
        String filename = "Userdata.txt"; //여기다가 객체를 직렬화해서 write해놓을거임
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(filename, true);
            bos = new BufferedOutputStream(fos);
            //직렬화 하고 싶으면
            out = new ObjectOutputStream(bos); 
            //버스(bos)에 태울때는 큰덩어리인데 내릴때는 쪼개서 내리게해
            //객체를 직렬화해서 내보내주는 기능
            
            //직렬화 대상(객체)
            UserInfo u1 = new UserInfo("홍길동", "super", 500); //완제품
            UserInfo u2 = new UserInfo("scott", "tiger", 50); //완제품
            
            //벽에 구멍을 만들고 보낼거에요
            //직렬화 "Userdata.txt"
            out.writeObject(u1); //writeObject가 분해해서 Userdata.txt에 쓴거(write)에요
            out.writeObject(u2); //분해해서 Userdata.txt에 쓴거(write)
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                out.close();
                bos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
        
        
    }

}
