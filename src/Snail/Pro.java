package Snail;
import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		int s = scan.nextInt();
		
		int where = 1;
		int[][] table = new int[s][s];
		for(int satir = 0; satir < s; satir++) {
			if(satir % 2 == 0) {
				for(int sütun = 0; sütun < s; sütun++) {
					table[satir][sütun] = where;
					where++;
				}
				
			}
			else {
				for(int sütun = s - 1; sütun >= 0; sütun--) {
					table[satir][sütun] = where;
					where++;
				}
			}
		}
		for(int satir = 0; satir < s; satir++) {
			for(int sütun = 0; sütun < s; sütun++) {
				System.out.println(table[satir][sütun] + " ");
			}
			System.out.println(" ");
		}
		

	}

}
