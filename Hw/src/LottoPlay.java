

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LottoPlay {

    public static void main(String[] args) throws IOException {
        LottoGame lotto1 = new LottoGame();
        
        lotto1.write();
    }
}