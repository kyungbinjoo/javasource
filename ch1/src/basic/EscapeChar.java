package basic;

public class EscapeChar {

	public static void main(String[] args) {
		// \로 시작하는 문자는 약속된 규칙이 있음
		// \n(엔터), \t(탭)

		System.out.println("\n안녕하세요");
		System.out.println("안녕하세요\t반갑습니다");
		System.out.println("'hello'");
		System.out.println(" \"hello\" ");
		
		
		System.out.print("hello\n\n\n");
		System.out.print("wo\nrld\n");
		
		// \하나를 표현하려면 => \\
		
		System.out.println("c:\\");
		
	}

}
