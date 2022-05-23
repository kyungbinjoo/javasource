package condiotion;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		// q가 입력되기 전까지 문자를 입력받기
		
		
		//sc.nextInt() : 숫자만 입력
		
		
//		String msg = sc.nextLine();
//		문자,숫자 등등 모두 입력 가능
//		
//		
//		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지 입력해");
		System.out.println("종료 버튼은 q입니다.");
		
		String msg="";
		
		do {
			
			System.out.println(">> ");
			
			msg = sc.nextLine();
			System.out.println(msg);
			
		}while(!msg.equals("q"));
		//문자 비교 equals
		
		System.out.println("\n프로그램 종료");
		sc.close();
		

	}

}
