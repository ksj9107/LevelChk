package LevelChk;

import java.util.Scanner;

public class step2_2 {
	public static void main(String[] args) {
		System.out.println("!!369게임!!");
		Scanner sc = new Scanner(System.in);
		int game = 1;
		boolean end=true;
		
		while(end == true){
			System.out.print("숫자를 입력하세요(1~99|종료 0) : ");
			game = sc.nextInt();
			if(game>0 && game<100){
				if((game>90&&game<=99)||(game>=60&&game<70)||(game>=30&&game<40)){
					if(game%3==0){
						System.out.println("박수짝짝");
					}else{
						System.out.println("박수짝");
					}
				}else if(game%10%3==0){
					System.out.println("박수짝");
				}else{
					System.out.println("3,6,9가 없습니다ㅠㅠ");
				}
			}else{
				if(game==0){
					System.out.println("종료합니다.");
					end = false;
					break;
				}else{
					System.out.println("범위를 벗어났습니다.");
				}
				
			}
		
		}		
		sc.close();
	}
}
