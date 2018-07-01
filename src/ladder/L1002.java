package ladder;

import java.util.Scanner;

public class L1002 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n     = s.nextInt();
		String c  = s.next();
		int sum   = 1;
		int i     = 0;
		
		for(i=1;sum<n;i++) {
			sum += 2*(2*i+1);
		}
		if(sum>n)
			i=i-2;
		else
			i=i-1;
		for(int m=i;m>0;m--) {
			for(int j=0;j<(i-m);j++) {
				System.out.print(' ');
			}
			for(int j=0;j<(2*m+1);j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		for(int j=0;j<i;j++) {
			System.out.print(' ');
		}
		
		System.out.println(c);
		
		for(int m=1;m<=i;m++) {
			for(int j=0;j<(i-m);j++) {
				System.out.print(' ');
			}
			for(int j=0;j<(2*m+1);j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		if((sum-n)>0) {
			System.out.println(n+(2*(2*(i+1)+1))-sum);
		}
		else {
			System.out.println(0);
		}
	}
}
