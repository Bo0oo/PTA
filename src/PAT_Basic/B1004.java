package PAT_Basic;

/*1004 �ɼ����� (20)��20 �֣�
����n��ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�

�����ʽ��ÿ�������������1��������������ʽΪ\

  ��1�У�������n
  ��2�У���1��ѧ�������� ѧ�� �ɼ�
  ��3�У���2��ѧ�������� ѧ�� �ɼ�
  ... ... ...
  ��n+1�У���n��ѧ�������� ѧ�� �ɼ�
����������ѧ�ž�Ϊ������10���ַ����ַ������ɼ�Ϊ0��100֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�

�����ʽ����ÿ�������������2�У���1���ǳɼ����ѧ����������ѧ�ţ���2���ǳɼ����ѧ����������ѧ�ţ��ַ�������1�ո�

����������

3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
���������

Mike CS991301
Joe Math990112*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class B1004 {
	public static void main(String[] args) {
		int max = 0;
		int max_index = 0;
		int min = 0;
		int min_index = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> strList = new ArrayList<String>();
		for (int i=0;i<n;i++) {
			strList.add(in.nextLine());
		}
		in.close();
		
		for(int i=0;i<strList.size();i++) {
			String temp[] = strList.get(i).split(" ");
			if(max < Integer.parseInt(temp[2])) {
				max = Integer.parseInt(temp[2]);
				max_index = i;
			}
			
			if(min > Integer.parseInt(temp[2])) {
				min = Integer.parseInt(temp[2]);
				min_index = i;
			}
		}
		
	}
}
