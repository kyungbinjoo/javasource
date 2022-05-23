package condiotion;



public class WhileEx2 {

	public static void main(String[] args) {
		//1~10까지 합 구하기
		
		int sum= 0;
		int i=1;
		while(i<11) {
			sum += i;
			i++;
		}
		System.out.println(i);
		System.out.println("1~10까지 합:"+sum);
		
		System.out.println();
		
		//1~100까지 합
		sum=0;
		int j=1;
		while(j<101) {
			sum += j;
			
		}
			System.out.println("1~100까지 합:" +sum);
		}
	}