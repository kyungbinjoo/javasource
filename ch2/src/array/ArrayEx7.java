package array;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		// 1~45번을 가지고 잇는 카드 생성
		//서로 섞은 후 출력
		
		
		int card[] = new int[45];
		
		for(int i=0; i<card.length;i++) {
			card[i] = i+1;
		}
       System.out.println(Arrays.toString(card));
       
       
 //      int a = 10,b = 5;
 //      //a,b의 값을 교환
 //      int z = a;  //미리 하나의 변수를 새로 잡아야만 교환 가능(아니면 첫번째 값이 사라짐)
 //      a = b;
 //      b = z;
       
       for(int j=0;j<card.length;j++) {
    	   //0~44 실제로 인덱스는 이렇게 존재해야 45개
    	   int pos = (int)(Math.random()*45); 
    	   int temp = card[j];
    	   card[j] = card[pos];
    	   card[pos] = temp;
    	   
	}
       System.out.println(Arrays.toString(card));

}
}
