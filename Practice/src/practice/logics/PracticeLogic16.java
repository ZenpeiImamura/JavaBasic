package practice.logics;

public class PracticeLogic16 {
	public static boolean checkChild (int age) {

		boolean result;
		if(age<20) {
			result=false;
		}else if(age>=20) {
			result=true;
		}
		return result;
	}
}
