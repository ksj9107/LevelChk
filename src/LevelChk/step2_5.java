package LevelChk;

import java.util.Scanner;

public class step2_5 {
	public static void main(String[] args) {
		String a="°¡À§",b="¹ÙÀ§",c="º¸";
		Scanner sc = new Scanner(System.in);
		System.out.println("!!°¡À§¹ÙÀ§º¸ °ÔÀÓ!!");
		System.out.println("°¡À§ ¹ÙÀ§ º¸¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		System.out.print("Ã¶¼ö : ");
		String cs = sc.nextLine();
		System.out.print("¿µÈñ : ");
		String yh = sc.nextLine();
		if(cs == a){
			if(yh == a){
				System.out.println("ºñ°å½À´Ï´Ù..");
			}else if(yh == b){
				System.out.println("¿µÈñ ½Â!!");
			}else if(yh == c){
				System.out.println("Ã¶¼ö ½Â!!");
			}else{
				System.out.println("Àß ¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			}
		}else if(cs == b){
			if(yh == a){
				System.out.println("Ã¶¼ö ½Â!!");
			}else if(yh == b){
				System.out.println("ºñ°å½À´Ï´Ù..");
			}else if(yh == c){
				System.out.println("¿µÈñ ½Â!!");
			}else{
				System.out.println("Àß ¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			}
		}else if(cs == c){
			if(yh == a){
				System.out.println("¿µÈñ ½Â!!");
			}else if(yh == b){
				System.out.println("Ã¶¼ö ½Â!!");
			}else if(yh == c){
				System.out.println("ºñ°å½À´Ï´Ù..");
			}else{
				System.out.println("Àß ¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			}
		}else{
			System.out.println("Àß ¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
		sc.close();
	}
}
