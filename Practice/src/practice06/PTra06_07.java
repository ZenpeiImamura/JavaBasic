package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */



		for(int i=1;i<=5;i++) {

			for(int j=2;j<=i;j++) {
				System.out.print("■");
		}
			for(int k=5;k>=i;k--) {
				System.out.print("□");
			}
			System.out.println();
		}
		for(int l=1;l<=5;l++) {
			for(int n=5;n>=l;n--) {
				System.out.print("■");
		}
			for(int m=2;m<=l;m++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
}
