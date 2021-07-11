package kr.or.bit;

public class NoteBook {
    private String color;
    private int year;
    
    //직접할당을 막고 간접 할당
    //간접할당의 구현 (함수) >> 특수한 목적(setter, getter)
    //왠만하면 자동화로 하세요
    //자동화 코드(이점>코드생략)
    public void setYear(int y) { //setter
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }
    
    public int getYear() {  //getter
        return year;
    }
    
    //자동화(alt_shift_s)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //마우스를 가지고 있다
    //여러개의 속성과 기능
    //Mouse mouse;
    //노트북이 마우스를 조정하는거지 가지고 있지는 않다.
    
    public void handle(Mouse m) { //Mouse 주고값을 받아서
       m.x = 100;
       m.y = 200;
        
    //public Mouse handle(Mouse m) { //Mouse 주고값을 받아서
    //m.x = 100;
    //m.y = 200;
    //return m;
        //노트북이랑 마우스랑 별개인데
        //노트북에서 굳이 마우스로 값을 리턴?
    }
    
    public void noteBookInfo() {
        System.out.println("color : " + color + " year : " + year);
    }
    
    
}
