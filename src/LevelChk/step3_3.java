package LevelChk;

import java.util.Scanner;

public class step3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {50000,10000,5000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for(;money>=arr[i];){
				money-=arr[i];
				cnt++;
			}
			System.out.println(arr[i]+"원 권: "+cnt+"매 ");
		}
		sc.close();
	}
}
