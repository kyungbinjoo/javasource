package condiotion;

/*if(조건문) {
 * } else {
 * }
 */


public class ifEx2 {

	public static void main(String[] args) {
		int score = 90;
		
		// score 가 90이상이면 메시지 출력
		// score 가 90미만이면 메시지 출력
		
/*		if(score >= 90) {
			
		}
		if (score < 90) {
			
		}
*/
		if (score >= 90) {
			System.out.println("점수는 90이상입니다.");
			System.out.println("등급은 A입니다");
			
		
		}else {
			System.out.println("점수는 90미만입니다.");
			System.out.println("등급은 B입니다.")
			;
			
		}

	}

}
