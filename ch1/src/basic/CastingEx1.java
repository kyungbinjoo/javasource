package basic;

//형변환
//1. 자동형변환(promotion) : 개발자가 신경쓰지 않아도 됨
//     큰 크기 타입 = 작은 크기 타입

//2. 강제형변환(casting) :컴파일 오류와 관련있기 때문에 신경을 써야 함
//     작은 크기 타입 = (작은 크기 타입) 큰 크기 타입

public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 1034;
		//byte byteValue = intValue;// cannot convert from int to byte
		System.out.println("intValue =" +intValue); //1034
		
		
		//강제 형변환
		byte byteValue = (byte)intValue;
		System.out.println("byteVAlue=" +byteValue); //10 -> 큰것(int)을 작은곳(byte)에 밀어 넣어서 강제로 짤림

		
		int num1 = 123456780;
		//자동 형변환
		double num2 = num1;
		System.out.println("num2=" +num2);
		//강제 형변환
		int num3 = (int)num2;
		System.out.println("num3=" +num3);
		
	}

}
