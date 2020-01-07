package co.mico.Lotto;

import java.util.Scanner;

public class Lotto {
	static Scanner sc = new Scanner(System.in);

	public static void insert() {
		int[] num = new int[6];
		int charge = 10000;
		System.out.print("금액을 입력하세요: ");
		int input = sc.nextInt();				
		
		if (input == 1000) {
			System.out.println("1회 입니다.");
			for (int i = 0; i < num.length; i++) {
				if(num[i] != num[i]+1) {
					num[0] = (int) (Math.random() * 45 + 1);
					num[1] = (int) (Math.random() * 45 + 1);
					num[2] = (int) (Math.random() * 45 + 1);
					num[3] = (int) (Math.random() * 45 + 1);
					num[4] = (int) (Math.random() * 45 + 1);
					num[5] = (int) (Math.random() * 45 + 1);

				}
			}
			System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4] + " " + num[5]);
		}
		if (input == 2000) {
			System.out.println("2회 입니다.");
			for (int i = 0; i < num.length; i++) {
				if(num[i] != num[i]+1) {
					num[0] = (int) (Math.random() * 45 + 1);
					num[1] = (int) (Math.random() * 45 + 1);
					num[2] = (int) (Math.random() * 45 + 1);
					num[3] = (int) (Math.random() * 45 + 1);
					num[4] = (int) (Math.random() * 45 + 1);
					num[5] = (int) (Math.random() * 45 + 1);

				}
			}
	
	
//	public static void display() {
//		for(int i=1; i<=45; i++)
//		{		
//		
//		System.out.printf("%4d", i);
//		if(i % 7 == 0)
//			System.out.println();
//		}
//	}
}
