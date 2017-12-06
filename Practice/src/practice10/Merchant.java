package practice10;

public class Merchant {
	final int PRICE=100;
	 int stock=100;
	 int money=0;

	//void sell() {};
	//void confirm(){};


	 void sellItem(int a) {
		this.stock-=a; this.money+=a*PRICE;
		 //this. stock=this.stock-a; this.money=this.money+a*PRICE;
	 }
	 String confirmMoney() {
		 return "売り上げは"+this.money+"円です。";
	 }

}

