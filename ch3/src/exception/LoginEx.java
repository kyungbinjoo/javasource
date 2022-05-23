package exception;

public class LoginEx {

	public static void main(String[] args) {
		
		try {
			login("white","12345");
			
		} catch (NotExistIDException | WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			login("blue","54321");
		}catch (NotExistIDException e) {
			e.printStackTrace();
		}catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		
		
		
		

	}
	
	public static void login(String id, String password) {
		
		//id 가 blue가 아니라면 NotExistIDException 발생
		//출력 : 아이디가 존재하지 않습니다.
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		// paassword가 12345가 아니라면 WrongPasswordException 발생
		//출력 : 패스워드가 틀립니다.
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}

}
