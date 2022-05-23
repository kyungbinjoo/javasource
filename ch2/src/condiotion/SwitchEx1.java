package condiotion;
/* 조건문
 * switch (변수) {
 *    case 값1 :
 *      수행할 문장;
 *      break;
 *    case 값2 :
 *      수행할 문장;
 *      break;
 *    default:
 *      수행할 문장;
 * }     
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		
		
		int num = (int)(Math.random()*6)+1;

		switch(num) {//스위치 값 안에는 변수만 올수 있다.
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
			
		}
	}

}
