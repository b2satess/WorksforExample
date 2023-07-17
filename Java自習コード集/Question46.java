/*
 * 神山美術館の入場料金は、一人600円であるが、
 * 5人以上のグループなら一人550円、
 * 20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成せよ。
 */
package test1;

public class Question46 {
	public static void main(String[] args) {
		people(1);
	}

		public static void people(int count) {
			int fee;
			if(count >= 20) {
				fee = 500;
			}
			else if(count >= 5){
				fee = 550;
			}
			else {
				fee = 600;
			}
			System.out.println(count * fee);
		}
}
