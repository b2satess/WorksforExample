/*
 * 指定した金額を100円玉と10円玉だけで、
 * できるだけ少ない枚数で支払いたい。
 *  金額を入力すると
 *  それぞれの枚数を計算して表示するプログラムを作成せよ。
 */
package test1;
import java.util.Scanner;

public class Question51 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10で割り切れる\n金額を入力してください");
		pay(scanner.nextInt());
		scanner.close();
	}
	public static void pay(int price) {
		if(price % 10 == 0) {
			int hyaku = price / 100;
			System.out.println(hyaku);
			int juu = (price - (hyaku * 100))  / 10;
			System.out.println(juu);
		}
		else {
			System.out.println("#エラー#\n10で割り切れる金額を入力してください");
		}
	}
}

