package LevelChk;

import java.util.Scanner;

public class step3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int tmp = 0;
		
		System.out.println("배열 값을 입력하세요(10개)");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int temp:arr){
			System.out.print(temp+" ");
		}
		sc.close();
	}
}
