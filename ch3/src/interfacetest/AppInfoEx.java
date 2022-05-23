package interfacetest;

public class AppInfoEx {

	public static void main(String[] args) {
//		SeperateVolume obj1 = new SeperateVolume("863ㄱ774", "개미", "베르나르");
		Lendable obj1 = new SeperateVolume("863ㄱ774","개미", "베르나르");  //상속의 개념이 있기때문에 가능
		obj1.checkOut("홍길동","2022-02-28");
		
		AppCD obj2 = new AppCD("2022-01", "oracle");
		obj2.checkOut("성춘향","2022-03-01");
		
	}

}
