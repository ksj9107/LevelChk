package LevelChk;

import java.util.Scanner;

public class step1_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char str;
		while(true){
		System.out.print("������ �� �ڸ� �Է��Ͻÿ�(���� : -1) : ");
		str = s.next().charAt(0); // char ������ �Է� �޴� ��
		if(str==-1){
		break;
		}
		if(str>='A' && str<='Z'){
		str+=32;
		}
		else if(str>='a' && str<='z'){
		str-=32;
		}
		else{
			System.out.println("�����ڰ� �ƴմϴ�.");
			break;
			}
			System.out.println(str);
		}
		s.close();
	}
}
