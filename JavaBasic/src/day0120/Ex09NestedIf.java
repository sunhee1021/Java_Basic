package day0120;
// 중첩 if문(Nested if)
// 한개의 if block 안에
// 새로운 if block이 들어가는것을
// 중첩 if문이라고 한다.
import java.util.Scanner;
public class Ex09NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("성별을 입력해주세요 : ");
        int gender = scanner.nextInt();
        
        if(gender == 1) {
            System.out.print("나이를 입력해주세요 : ");
            int age = scanner.nextInt();
            
            if(age >= 19) {
                System.out.print("신체등급을 입력해주세요 : ");
            }else {
                System.out.println("아직 미성년자에게는 신체등급이 부여되지 않습니다.");
            }
            
            int grade = scanner.nextInt();
           
            if(grade <= 3) {
                System.out.println("현역");
            }else if (grade == 4) {
                System.out.println("공익");
            }else{
                System.out.println("면제");
            }
        }else if(gender == 2){
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
        
            
        scanner.close();
    }
    
}
