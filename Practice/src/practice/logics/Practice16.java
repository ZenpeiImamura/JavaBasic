package practice.logics;

public class Practice16 {
	 public static void main(String[] args) {
		 int age = new java.util.Scanner(System.in).nextInt();
	boolean result=PracticeLogic16.checkChild(age);
	if(!result) {
	System.out.println("子供");
	}else if(result) {
	System.out.println("大人");
	 }
	 }
}
