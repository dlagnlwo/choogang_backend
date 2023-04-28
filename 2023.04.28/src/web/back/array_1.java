package web.back;

import java.util.*;

public class array_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int max = 0;
		
		for(int i=0; i < array.length; i++) {
			System.out.print("데이터 입력");
			array[i] = sc.nextInt();
		}
		max = array[0];
		
		for(int i=0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 수" + max);
	}
}
