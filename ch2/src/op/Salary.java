package op;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		//사용자로부터 한달 월급을 입력받은 후 
		//한달 월급을 10년동안 저축했을 때 금액 확인하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한달 월급 입력 :");
		int salary = sc.nextInt();
		
		int deposit = salary * 12 * 10;
		System.out.println("10년뒤는"+deposit);
		
		sc.close();
		
	}

}
