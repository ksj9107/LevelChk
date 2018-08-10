package LevelChk;

import java.util.Scanner;

public class step3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("3의 배수인지 판단할 정수들을 입력하세요.");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int tmp:arr ){
			if(tmp>0){
				if(tmp%3==0){
					System.out.print(tmp+" ");
				}	
			}
		}
		sc.close();
	}
}
