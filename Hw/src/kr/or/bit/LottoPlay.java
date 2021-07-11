package kr.or.bit;

import java.io.IOException;

public class LottoPlay {

    public static void main(String[] args) throws IOException {
        LottoGame lotto1 = new LottoGame();
        
        lotto1.LottoNum();
        lotto1.write();
        lotto1.read();
    }

}
