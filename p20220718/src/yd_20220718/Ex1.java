package yd_20220718;

public class Ex1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) { // i = 1, j = 1 ( i: *의 개수, j : 빈칸의 갯수)
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for (int k = 1; k <= 5; k ++) { 	// k =1, l = 4 ( l: *의 개수, k : 빈칸의 갯수)
			for (int l = 4; l >=k ; l--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
