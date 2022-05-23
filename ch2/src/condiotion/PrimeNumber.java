package condiotion;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1~100 숫자 중에서 소수(1과 자신으로만 나눠짐) 구하기
		int count = 0;
		for (int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i+ " ");
			}
			count = 0;
		}
	}

}
