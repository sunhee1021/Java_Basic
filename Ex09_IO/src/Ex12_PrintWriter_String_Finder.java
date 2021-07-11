import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
    String basedir = "C:\\Temp"; //검색할 폴더
    String word = "HELLO"; //검색한 단어
    String save = "result.txt"; //HELLO라는 단어가 들어있는 파일목록을 저장
    
    void Find() throws IOException{
        File dir = new File(basedir);
        if(!dir.isDirectory()) {
            System.out.println("is not dirctory");
            System.exit(0);
        }
        
        PrintWriter writer = new PrintWriter(save); //함수안에 쓴다는것은 여기에서 쓰고 버린다는소리
                                //new PrintWriter(new FileWriter(save));라고 해도됨
        BufferedReader br = null;
        
        File[] files = dir.listFiles();  //목록(파일, 폴더)
        for(int i = 0; i < files.length; i++) {
            if(!files[i].isFile()) {
                continue; //파일이 아닌경우에는 아래 코드를 실행하지않고 skip(다시 for문 돌겠다)
            }
            //파일이라면
            br = new BufferedReader(new FileReader(files[i]));
            
            //파일안에 한문장씩 read하면서 검색하겠다 (HELLO 검색)
            String line = "";
            while((line = br.readLine()) != null) {
                if(line.indexOf(word) != -1) { //현재 read 문장에 HELLO 단어가 하나라도 있는거임
                    writer.write("word =" + files[i].getAbsolutePath() + "\n");
                }
            }
            writer.flush();
        }
        br.close();
        writer.close();
        }
    
    public static void main(String[] args) {
        Ex12_PrintWriter_String_Finder StringFinder
                = new Ex12_PrintWriter_String_Finder();
        
        try {
            StringFinder.Find(); //위에서 throw를 해놨기때문에 강제로 예외처리(try-catch)를 하지않으면
                                 //빨간줄 에러가 난다.
        } catch (Exception e) {
            e.printStackTrace();
        }
           
                             
        
    }

}
