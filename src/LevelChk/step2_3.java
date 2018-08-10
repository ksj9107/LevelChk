package LevelChk;

import java.util.Scanner;

public class step2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		boolean end = true;
		while(end == true){
			System.out.println("삼각형이 가능할지 구할 변의 길이 3개를 입력하세요(종료:첫입력 -1)");
			a = sc.nextInt();
			if(a==-1){
				System.out.println("종료합니다.");
				end = false;
				break;
			}
			b = sc.nextInt();
			c = sc.nextInt();
		
			if(a+b>c&&a+c>b&&b+c>a){
				System.out.println("삼각형을 만들 수 있습니다.");
			}else{
				System.out.println("삼각형을 만들 수 없습니다.");
			}
			
		}
		sc.close();
	}
}
