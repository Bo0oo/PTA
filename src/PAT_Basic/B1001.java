 package PAT_Basic;

import java.util.Scanner;



public class B1001 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int step = 0;
		
		while(n != 1) {
			n = (n%2 == 0) ? n/2 : (3*n+1)/2;
			step++;
		}
		
		System.out.println(step);
	}
}
