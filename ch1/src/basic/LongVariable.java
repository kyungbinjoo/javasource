package basic;

//정수형 -1. byte
//      2. short : 2byte
//      3. int (가장 중요) : 4byte - 자바는 모든 정수값을 기본적으로 int 로 표현
//      4. long : 8byte

public class LongVariable {
	public static void main(String[] args) {
		long var1 = 15;
		System.out.println("var1 = " + var1);

		//var1 = 12345678900; //The literal 12345678900 of type int is out of range
		var1 = 12345678900L; // L,l 대소문자 모두 가능 (long 타입은 컴파일러에게 long타입임을 알려줘야 함)
		
		
	}

}
