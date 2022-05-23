package interfacetest;

public interface RemoteControl {
	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//default 메소드( 8 버젼부터 가능)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}		
	}
	//static 메소드(8 버젼부터 가능 -지금 사용하는 버젼은 jdk11)
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}
