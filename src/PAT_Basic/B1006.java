package PAT_Basic;

import java.util.Scanner;

public class B1006 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int baiWei = n / 100;
		int geWei = n % 10;
		int shiWei = (n-baiWei * 100) /10;
		
		for (int i=0;i<baiWei;i++) {
			System.out.print("B");
		}
		
		for(int i=0;i<shiWei;i++) {
			System.out.print("S");
		}
		
		for(int i=0;i<geWei;i++) {
			System.out.print(i+1);
		}
	}
}
