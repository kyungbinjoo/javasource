package op;

import java.util.Scanner;

//System.out : 모니터


public class ScannerEx1 {

	public static void main(String[] args) {
		//키보드(system.in)에서 입력을 받고 싶을때 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력");
		//sc.nextInt : 사용자가 입력한 숫자를 받아들여 주는 부분(문자 입력시 exeption 발생)
		int num = sc.nextInt();
		
		System.out.println("입력한 숫자는"+num);
		
		sc.close();
		
		
	}

}
