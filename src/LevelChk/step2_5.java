package LevelChk;

import java.util.Scanner;

public class step2_5 {
	public static void main(String[] args) {
		String a="����",b="����",c="��";
		Scanner sc = new Scanner(System.in);
		System.out.println("!!���������� ����!!");
		System.out.println("���� ���� ���� �Է��ϼ���");
		System.out.print("ö�� : ");
		String cs = sc.nextLine();
		System.out.print("���� : ");
		String yh = sc.nextLine();
		if(cs == a){
			if(yh == a){
				System.out.println("�����ϴ�..");
			}else if(yh == b){
				System.out.println("���� ��!!");
			}else if(yh == c){
				System.out.println("ö�� ��!!");
			}else{
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
		}else if(cs == b){
			if(yh == a){
				System.out.println("ö�� ��!!");
			}else if(yh == b){
				System.out.println("�����ϴ�..");
			}else if(yh == c){
				System.out.println("���� ��!!");
			}else{
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
		}else if(cs == c){
			if(yh == a){
				System.out.println("���� ��!!");
			}else if(yh == b){
				System.out.println("ö�� ��!!");
			}else if(yh == c){
				System.out.println("�����ϴ�..");
			}else{
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
		}else{
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	}
}
