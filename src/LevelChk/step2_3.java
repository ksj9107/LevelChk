package LevelChk;

import java.util.Scanner;

public class step2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		boolean end = true;
		while(end == true){
			System.out.println("�ﰢ���� �������� ���� ���� ���� 3���� �Է��ϼ���(����:ù�Է� -1)");
			a = sc.nextInt();
			if(a==-1){
				System.out.println("�����մϴ�.");
				end = false;
				break;
			}
			b = sc.nextInt();
			c = sc.nextInt();
		
			if(a+b>c&&a+c>b&&b+c>a){
				System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
			}else{
				System.out.println("�ﰢ���� ���� �� �����ϴ�.");
			}
			
		}
		sc.close();
	}
}
