package classtest;

import java.util.Arrays;

public class MethodTestEx {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		MethodTest1 obj = new MethodTest1();
		
		System.out.println(obj.sum(1, 8));
		System.out.println();
		
		
		char charValue =obj.method1();
		int value = charValue +1;
		System.out.println(value);
		System.out.println();
		
		
		double result1 = obj.devide1(5.0, 2.0);
		System.out.println(result1);
		
		//array
		int arr[] = {4,5,6,7};
		int arr2[] =obj.array(arr);
		System.out.println(Arrays.toString(arr2));
		
		
		

	}

}
