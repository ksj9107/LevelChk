package LevelChk;

import java.util.Scanner;

public class step2_2 {
	public static void main(String[] args) {
		System.out.println("!!369����!!");
		Scanner sc = new Scanner(System.in);
		int game = 1;
		boolean end=true;
		
		while(end == true){
			System.out.print("���ڸ� �Է��ϼ���(1~99|���� 0) : ");
			game = sc.nextInt();
			if(game>0 && game<100){
				if((game>90&&game<=99)||(game>=60&&game<70)||(game>=30&&game<40)){
					if(game%3==0){
						System.out.println("�ڼ�¦¦");
					}else{
						System.out.println("�ڼ�¦");
					}
				}else if(game%10%3==0){
					System.out.println("�ڼ�¦");
				}else{
					System.out.println("3,6,9�� �����ϴ٤Ф�");
				}
			}else{
				if(game==0){
					System.out.println("�����մϴ�.");
					end = false;
					break;
				}else{
					System.out.println("������ ������ϴ�.");
				}
				
			}
		
		}		
		sc.close();
	}
}
