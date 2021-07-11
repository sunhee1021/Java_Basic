package kr.or.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class LottoGame {
    private Set<Integer> lotto;

    public LottoGame() {
        lotto = new TreeSet<Integer>();
    }

    public Set<Integer> LottoNum(){
       
        for(int i = 0; lotto.size() < 6; i++) {
            lotto.add((int)(Math.random()*45+1));
    
        }
        return lotto;
    }

    public void write() throws IOException{

        FileWriter fw = new FileWriter("Lotto_Result.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("당첨번호 : " + LottoNum());
        bw.newLine();
        bw.flush();
    }

    public void read() throws IOException{

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("Lotto_Result.txt"); 
            br = new BufferedReader(fr);
            
            String line = "";
            for(int i = 0; (line = br.readLine()) != null; i++) {
                System.out.println(line);
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
        }
}

}
