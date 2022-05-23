package condiotion;

public class ifEx6 {

	public static void main(String[] args) {
		// 주사위 프로그램
		
		//random() :    0.0 <= Math.random() < 1.0 
		//System.out.println(Math.random());
		
		int dice = (int)(Math.random()*6) +1;
		
		if(dice == 1) { 
			System.out.println("주사위1번");
		} else if (dice == 2) {
			System.out.println("주사위2번");
		} else if (dice == 3) {
			System.out.println("주사위3번");
		} else if (dice == 4) {
			System.out.println("주사위4번");
		} else if (dice == 5) {
			System.out.println("주사위5번");
		} else if (dice == 6) {
			System.out.println("주사위6번");
		}
	}
}

