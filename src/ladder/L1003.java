package ladder;

import java.util.Scanner;

public class L1003 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int[] intArray = new int[str.length()];
		int[] result = new int[10];
		for(int i=0;i<str.length();i++) {
			intArray[i] = Integer.parseInt(str.substring(i,i+1)); 
		}
		for(int i=0;i<intArray.length;i++) {
			result[intArray[i]] += 1; 
		}
		
		for(int i=0;i<result.length;i++) {
			if(result[i]!=0) {
				System.out.println(i+":"+result[i]);
			}
		}
	}
}
