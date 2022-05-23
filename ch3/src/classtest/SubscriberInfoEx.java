package classtest;

public class SubscriberInfoEx {
   public static void main(String[] args) {
		
		SubscriberInfo info = new SubscriberInfo();
		//초기화
		info.id = "hong1234";
		info.name = "홍길동";
		info.password = "hong1234#";
		
		//리턴 타입이 void인 경우 호출만 
		info.changeAddress("구로구"); //null => 구로구
		objectPrint(info);
		
		//첫번째 가입자 정보 출력		
//		System.out.println("아이디 : " + info.id);
//		System.out.println("이름 : " + info.name);
//		System.out.println("비밀번호 : " + info.password);
//		System.out.println("주소 : " + info.address);
//		System.out.println("전화번호 : " + info.phone);

		System.out.println();
		
		 
		 
		//두번째 가입자
		SubscriberInfo info2 = new SubscriberInfo ("성춘향", "sung1234", "sung4567#");
		objectPrint(info2);
		
        //두번째 가입자 정보 출력
//		System.out.println("아이디 : " + info2.id);
//		System.out.println("이름 : " + info2.name);
//		System.out.println("비밀번호 : " + info2.password);
//		System.out.println("주소 : " + info2.address);
//		System.out.println("전화번호 : " + info2.phone);
		
		System.out.println();

		
		
        //세번째 가입자
      	SubscriberInfo info3 = new SubscriberInfo("송중기", "song1234", "song12345#","010-2313-2244", "강남구");
      	objectPrint(info3);
      	//세번째 가입자 정보 출력
//		System.out.println("아이디 : " + info3.id);
//		System.out.println("이름 : " + info3.name);
//		System.out.println("비밀번호 : " + info3.password);
//		System.out.println("주소 : " + info3.address);
//		System.out.println("전화번호 : " + info3.phone);
	}
   
   static void objectPrint(SubscriberInfo info) {
	   //가입자 정보 출력
	    System.out.println("아이디 : " + info.id);
		System.out.println("이름 : " + info.name);
		System.out.println("비밀번호 : " + info.password);
		System.out.println("주소 : " + info.address);
		System.out.println("전화번호 : " + info.phone);
   }

}
