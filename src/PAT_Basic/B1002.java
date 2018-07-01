package PAT_Basic;

import java.util.Scanner;


public class B1002 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		s.close();
		char[] str = n.toCharArray();
		Integer sum = 0;
		
		for (int i=0;i<str.length;i++) {
			sum += Integer.parseInt(String.valueOf(str[i]));
		}
		
		char[] arr = sum.toString().toCharArray();
		
		for (int i=0;i<arr.length;i++) {
			switch (arr[i]) {
			case '0':
				System.out.print("ling");
				break;
			case '1':
				System.out.print("yi");
				break;
			case '2':
				System.out.print("er");
				break;
			case '3':
				System.out.print("san");
				break;
			case '4':
				System.out.print("si");
				break;
			case '5':
				System.out.print("wu");
				break;
			case '6':
				System.out.print("liu");
				break;
			case '7':
				System.out.print("qi");
				break;
			case '8':
				System.out.print("ba");
				break;
			case '9':
				System.out.print("jiu");
				break;
				
			default:
				break;
			}
			
			if (i != arr.length-1) {
				System.out.print(" ");
			}
		}
	}
}
