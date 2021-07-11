import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_Reader_Writer_Buffer {
    public static void main(String[] args) throws Exception {
        //Lotto
        FileWriter fw = new FileWriter("Lotto.txt",true);
        FileReader fr = new FileReader("Lotto.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("로또");
        bw.newLine();
        bw.write("1,3,6,8,9");
        bw.newLine();
        bw.flush();
        fr.read();
        
        /*
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); //2바이트씩 태우는게 아니라 
            br = new BufferedReader(fr);             //한번에 다태우려고하는거임
                                                     //fr이 들어갈수 있는이유 = 다형성
            //line 단위 처리가 가능
            String line = "";
            for(int i = 0; (line = br.readLine()) != null; i++) {
                //System.out.println(line);
                if(line.indexOf(";") != -1){
                    System.out.println(line);
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            try {
                
                fr.close();
                br.close();
                
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }*/
        
    }

}
