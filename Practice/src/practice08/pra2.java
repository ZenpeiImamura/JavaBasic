package practice08;

public class pra2 {
	public static double getBmi(double height,int weight) {
		return weight/height/height;
	}

	public static void checkBmi(double bmi){
		if(bmi<18) {
			System.out.println("低体重");
		}else if(bmi<25) {
			System.out.println("普通体重");
		}else if(bmi>=25) {
			System.out.println("肥満");
		}
	}



	 public static void main(String[] args) {

	double bmi=getBmi(1.7,60);

	checkBmi(bmi);





	 }
}
