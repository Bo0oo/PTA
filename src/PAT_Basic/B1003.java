package PAT_Basic;

import java.util.Scanner;
import java.util.regex.Pattern;


public class B1003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] intArr = new String[n];
		String regEx1 = "A*PATA*";
		Pattern pattern1 = Pattern.compile(regEx1);
		String regEx2 = "A+PA+TA+";
		Pattern pattern2 = Pattern.compile(regEx2);
		String regEx3 = "PA+T";
		Pattern pattern3 = Pattern.compile(regEx3);
		
		for (int i=0;i<intArr.length;i++) {
			intArr[i] = in.nextLine();
		}
		in.close();
		for (int i=0;i<intArr.length;i++) {
			if(i==intArr.length-1) {
				if(pattern1.matcher(intArr[i]).matches()) {
					System.out.print("YES");
				}
				else if (pattern2.matcher(intArr[i]).matches()) {
					if((intArr[i].indexOf('P')*(intArr[i].indexOf('T')-intArr[i].indexOf('P')-1))==(intArr[i].length()-intArr[i].indexOf('T')-1)) {
						System.out.print("YES");
					}
					else {
						System.out.print("NO");
					}
				}
				else if(pattern3.matcher(intArr[i]).matches()) {
					System.out.print("YES");
				}
				else {
					System.out.print("NO");
				}
			}
			else {
				if(pattern1.matcher(intArr[i]).matches()) {
					System.out.println("YES");
				}
				else if (pattern2.matcher(intArr[i]).matches()) {
					if((intArr[i].indexOf('P')*(intArr[i].indexOf('T')-intArr[i].indexOf('P')-1))==(intArr[i].length()-intArr[i].indexOf('T')-1)) {
						System.out.println("YES");
					}
					else {
						System.out.println("NO");
					}
				}
				else if(pattern3.matcher(intArr[i]).matches()) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
}
