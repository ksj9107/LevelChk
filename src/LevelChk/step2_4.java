package LevelChk;

import java.util.Scanner;

public class step2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���/������ ���� �⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("�����Դϴ�.");
				}else{
					System.out.println("����Դϴ�.");
				}
			}else{
				System.out.println("�����Դϴ�.");
			}
		}else{
			System.out.println("����Դϴ�.");
		}
		sc.close();
	}
}
