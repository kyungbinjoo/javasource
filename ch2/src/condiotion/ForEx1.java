package condiotion;
/*반복문
 * 어떤 작업이 반복적으로 실행되도록 할 때 사용
 * for / while / do~ while
 */
public class ForEx1 {

	public static void main(String[] args) {
		
		for (int i=0;i<10;i++) {
			//1) int i=0; (처음 한번만 실행)
			//2) i < 10; true가 결과값으로 나오는 경우만 for 실행
			//3) for 블럭 안으로 진입 => {} 안 구문 실행
			//4) i++(i=i+1) i=1
			//5) i<10; (1 < 10)
			//6) for 블럭 안으로 진입 => {} 안 구문 실행
			//7) i++(i=i+1) i=2
			//8) i<10; (2 < 10)
			//9) for 블럭 안으로 진입 => {} 안 구문 실행
			// ........
			// i < 10 (10 < 10) false가 되는 순간 반복문 종료
			
			System.out.println("안녕하세요");
		}

	}

}
