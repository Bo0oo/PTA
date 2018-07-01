package ladder;

import java.util.Scanner;

public class L1004 {
	public static void main(String[] args) {
		int f,c;
		Scanner s = new Scanner(System.in);
		f = s.nextInt();
		c = 5*(f-32)/9;
		System.out.println("Celsius = "+c);
	}
}
