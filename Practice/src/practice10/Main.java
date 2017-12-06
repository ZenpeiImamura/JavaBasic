package practice10;

public class Main {
	public static void main(String[]args) {
		Merchant merchant=new Merchant();
		merchant.sellItem(50);
		merchant.sellItem(60);
		System.out.println(merchant.confirmMoney());
	}
}
