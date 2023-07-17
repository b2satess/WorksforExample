/*換算したい金額（円単位）と1ドル何円かを整数値で
 * 入力すると、入力した金額が何ドル何セントか
 * 計算して表示するプログラムを作成せよ。
 * 1セントは1/100ドルである。結果は整数値でよい（1セント未満の端数切り捨て）。
 */
import java.util.Scanner;
public class Question44 {
	public static void main(String[] args) {
		System.out.println("問44");
		System.out.println("換金される金額と現在のドル円レートを入力してください。");
		Scanner scanner = new Scanner(System.in);
		question44(scanner.nextInt(),scanner.nextInt());
		scanner.close();
	}
public static void question44(double jpy, double doll) {
	double rate = jpy / doll;
	double rate2 = (int)rate;
	double rate3 = rate - rate2;
	double rate4 = rate3 *100;
	if(rate4 == 0) {
	System.out.println("ご入力された日本円は" + (int)rate2 + "ドルです");
	}
	else {
	System.out.println("ご入力された日本円は" + (int)rate2 + "ドル" + (int)rate4+"セントです"); 
	}
}
}
