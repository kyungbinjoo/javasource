package op;

//-변수명-
// 소문자로 시작(대소문자구별 -자바의 특성) 
// 두개의 단어가 붙을 경우 첫 문자를 대문자로 한다.(관례) - fisrtName, maxSpeed
// $, _로 시작하는 것은 허용
//

public class Pencil {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 당 몇 개를 가질 수 있고
		//최종적으로 몇 개가 남는지 출력하시오.
		//변수 사용, 산술 연산자 사용
		
	//	int x = 534;
	//  int y = 30;
	//  int result = x / y;
	//  int result2 = x % y;
	//    		System.out.println("학생한명당연필개수="+result);
	//    		System.out.println("나머지연필개수="+result2);
	    		
		
		int pens = 534;
	    int stu = 30;
	  
	    		System.out.println("학생한명당연필개수="+pens/stu);
	    		System.out.println("나머지연필개수="+pens%stu);
	    
	

	}

}
