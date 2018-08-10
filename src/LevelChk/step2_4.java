package LevelChk;

import java.util.Scanner;

public class step2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("평년/윤년을 구할 년도를 입력하세요 : ");
		int year = sc.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("윤년입니다.");
				}else{
					System.out.println("평년입니다.");
				}
			}else{
				System.out.println("윤년입니다.");
			}
		}else{
			System.out.println("평년입니다.");
		}
		sc.close();
	}
}
