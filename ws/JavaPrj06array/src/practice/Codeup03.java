package practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup03 {

	public static void main(String[] args) throws IOException {
		
		// 1430 기억력 테스트 2
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int memo[] = new int[10000001];
		
		int n = sc.nextInt();
		
		int i;
		for(i = 0;i < n; ++i) {
			memo[sc.nextInt()] = 1;
		}
		
		int m =sc.nextInt();
		for(i = 0;i < m; ++i) {
//			System.out.print(memo[sc.nextInt()] + " ");
			bw.write(memo[sc.nextInt()] + " ");
		}
		
		bw.flush();
		bw.close();
		

//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int m = sc.nextInt();
//		
//		int[] arr2 = new int[m];
//		
//		for (int i = 0; i < m; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		
//		int[] arr3 = new int[m];
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				if (arr2[j] == arr[i]) {
//					arr3[j] = 1;
//				}
//			}
//		}
//		
//		for (int i = 0; i < m; i++) {
//			System.out.print(arr3[i] + " ");
//		}
		
	}

}
