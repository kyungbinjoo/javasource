package condiotion;

/*조건이 여러개 인 경우
 * if (조건1) {
 * 
 * } else if (조건2) {
 * 
 * } else if (조건3) {
 * 
 * } else {
 * }
 */
public class ifEx5 {

	public static void main(String[] args) {
		// 점수가 90 이상이면 A
		// 80 이상이면 B
		// 70 이상이면 C
		// 60 이상이면 D : else if
		// 나머지 점수는 D : else
		
		int jumsu = 60;
		
		if (jumsu >= 90) { 
			System.out.println("A");
				
		} else if (jumsu >=80) {
			System.out.println("B");
			
		}else if (jumsu >= 70) {
			System.out.println("C");
			
		}else if (jumsu >= 60){
			System.out.println("D");
			
		}
	}

}
