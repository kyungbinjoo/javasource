package array;

import java.util.Scanner;

public class ArrayEx11 {

	public static void main(String[] args) {
		//단어 맞추기
		
		String[] words = {"television","computer","mouse","phone"};//대괄호 타입 옆에 와도 되고 배열명 옆에 와도 됨
		
		
		//euoms => mouse 
//		String word = "mouse";
//		char[] question =word.toCharArray();//char[] question = {'m','o','u','s','e'}
//		
//		for(int i=0;i<question.length;i++) {
//			System.out.print(question[i]+" ");
//			
//		}
		
		//words 배열 값을 읽어와서 char 배열로 변경
	    
		//변경 후 자리 교환
		
		//문제 내기
		
		//사용자로부터 답 입력받기
		
		//결과 출력
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			for(int j=0;j<question.length; j++) {
			int pos	=(int)(Math.random()*question.length);
			char temp = question[j];
			question[j] = question[pos];
			question[pos] = temp;
			
			}
			
			System.out.printf("Q%d) %s의 정답을 입력하시오!!!!",(i+1),new String(question));  //new String(question) : char 배열을 String으로 객체 생성 (char 배열을 문자열로 만듬)
			
			System.out.println();
			String answer = sc.nextLine();
			
			if(answer.equals(words[i])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
			
		}
		
		

	}

}
