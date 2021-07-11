package kr.or.bit;
import java.util.Scanner;
import java.util.Random;

public class Lotto {
    private int[] numbers;  //초기화 
    private Scanner scanner;
    private Random r; 
    
    public Lotto() { 
           numbers = new int[6]; 
           scanner = new Scanner(System.in);
           r = new Random();
           
           for(int i = 0; i < numbers.length; i++) {
               numbers[i] = (int)(Math.random()*45 + 1);
               
               for(int j = 0; j < i-1; j++) {
                   while(numbers[i] == numbers[j]){
                       numbers[j] = (int)(Math.random()*45 + 1);  
               }
           }
    }
    for(int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i]+ " ");
    }
    }

    public void selectLottoNumbers() {
        
       
    }
}
    
    

