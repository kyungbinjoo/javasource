package classtest;

public class MethodTest1 {
	
	
	//true, false 리턴하는 메소드 작성 = isRedirect()
	//인자는 없음
	//
	boolean isRedirect(){
		 return true; // (or) return false;
	}

	
	//정수타입 리턴, sum()
	//인자는 정수타입 2개를 입력받음
	//넘어온 정수타입 2개를 더하기 한 후 결과값 리턴
	
	
	int sum(int num1, int num2) {
		return num1 + num2; 
	}
	
	
	//문자 하나 리턴, method1()
	//인자 없음
	
	char method1() {
		return 'c';
	}
	
	
	//실수 리턴, devide1()
	//인자 실수 값 2개를 입력받음
	
	double devide1(double num1, double num2) {
		return num1 / num2; 
	}
	
	
	//int 타입의 배열 리턴
	//array() : 입력받은 배열을 리턴
	//인자는 int 타입의 배열
	
	int[] array(int arr[]) {
		arr[0] = 8;
		return arr;
	}
	
	
	//문자열 타입 리턴
	//method2() : 인사말 리턴
	//인자는 없음
	
	String method2() {
		return "안녕하세요";
	}
	
	
}
