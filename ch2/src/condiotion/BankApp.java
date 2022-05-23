package condiotion;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance =0; //잔고
		
		Scanner sc = new Scanner(System.in);
		while(run){
	    System.out.println("--------------------------");
		System.out.println("1.예금: 2.출금: 3.잔고: 4.종료 ");
	    System.out.println("--------------------------");
	    System.out.print("선택>");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			//예금액 입력받은 후 잔고에 추가
			System.out.print("예금액>> ");
			balance+= sc.nextInt();
			
			break;
			
		case 2:
			//출금액 입력받은 후 잔고에서 감소
			System.out.print("출금액>> ");
			balance-= sc.nextInt();
			break;
		case 3:
			//잔고 출력
			System.out.println("잔고액 >> "+balance);
			break;
		case 4:
			System.out.println("*********");
			System.out.println("안녕히 가세요");
			System.out.println("*********");
			run = false;
			break;
			default:
				break;
		}
				

	}

  }
}