package codeup;

import java.util.Scanner;

public class Codeup04 {
	
	public static void main(String[] args) {
		
		// 1203
		
		Scanner sc = new Scanner(System.in);
		
		int bmi = sc.nextInt();

		if (bmi <= 10) {
			System.out.println("����");
		} else if (bmi <= 20) {
			System.out.println("��ü��");
		} else {
			System.out.println("��");
		}
	}
}
