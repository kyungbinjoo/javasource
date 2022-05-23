package interfacetest;

//인터페이스 : 추상메소드(일반 메소드 사용불가)
//          추상클래스보다 추상화 정도가 더 높음
//          상수만을 가질 수 있음
//          다른 클래스를 작성하는데 도움 줄 목적으로 작성
//          단, default, static 키워드가 붙은 메소드는 허용


public interface Adder {
	//private int num;  변수 선언 불가//only public, static & final are permitted
	public static final int SPADE = 1;
	int DIAMOND = 3; //public static final 생략 될 수 있음 (무조건 상수)
	final int HEART = 2;
	static int CLOVER = 4;
	
	
	//메소드  
	//Abstract methods do not specify a body
	//public void print() {}
	
	public void print();
	int add(int x,int y); //public 생략 가능
	
	
}