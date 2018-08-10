package LevelChk;

import java.util.Scanner;

public class step2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요 : ");
		int money = sc.nextInt();
		int bigfive=0,five=0,smfive=0,smlfive=0;
		int bigone=0,one=0,smone=0,smlone=0,bscone=0;
			for(;money>=50000;){
				money -= 50000;
				bigfive++;
			}
			for(;money>=10000;){
				money -= 10000;
				bigone++;
			}
			for(;money>=5000;){
				money -= 5000;
				five++;
			}
			for(;money>=1000;){
				money -= 1000;
				one++;
			}
			for(;money>=500;){
				money -= 500;
				smfive++;
			}
			for(;money>=100;){
				money -= 100;
				smone++;
			}
			for(;money>=50;){
				money -= 1000;
				smlfive++;
			}
			for(;money>=10;){
				money -= 10;
				smlone++;
			}
			for(;money>=1;){
				money -= 1;
				bscone++;
			}
		System.out.println("오만원: "+bigfive+"매/ 만원: "+bigone+"매/ 오천원: "+five+
				"매/ 천원: "+one+"매/\n 오백원: "+smfive+"개/ 백원: "+smone+"개/ 오십원: "+smlfive+
				"개/ 십원: "+smlone+"개/ 1원: "+bscone+"개");
		sc.close();
	}
}
