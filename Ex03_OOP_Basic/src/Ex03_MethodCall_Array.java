
class Human{
	String name;
}

class Test{
	int add(int i, int j) {
		return i + j;
	}
	
	//배열은 객체다 (배열은 주소값을 가지고 있다 : heap 생성)
	int[] add2(int[] param) { //int[] 주소값을 리턴, int[] 배열의 주소값을 받겠다
		//return null;
		//return new int[5]; //return new Tv() 이거랑 같은것
		int[] arr = new int[param.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = param[i]+1;
		}
		return arr;
	}
	
	int[] add3(int[] so, int[] so2) {
		int[] arr2 = new int[so.length];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = so[i] + so2[i];
			
		}
		return arr2;
		
	}
	//함수안에 코드를 여러분 마음대로 작성하시고
	//main 안에서 가지고 놀아보세요
}
public class Ex03_MethodCall_Array {
	public static void main(String[] args) {
		Test t = new Test();
		int result = t.add(10, 10);
		System.out.println("result : "+result);
		
		int[] array = {10,20,30};
		int[] resultarray = t.add2(array);
		for(int i : resultarray) {
			System.out.println("i : "+i);
		}
		
		int[] array2 = {9,18,27};
		int[] array3 = {1,2,3};
		int[] resultarray2 = t.add3(array2, array3);
		for(int i : resultarray2) {
			System.out.println("두개의 합 : " +i);
		}
		//add3() error 없이 가지고 노세요
	}

}
