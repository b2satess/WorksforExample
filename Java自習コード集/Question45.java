/*初乗り料金が1700mまで610円、
 * それ以降は313mごとに80円のタクシーがある。
 * このタクシーに乗った距離をm単位で入力し、
 * 料金を計算するプログラムを作成せよ。
 */

package test1;
public class Question45 {
	public static void main(String[] args) {
		taxi(2014);
	}
	public static void taxi (int distance) {
		final int fee = 610;
		int extraDistance = distance - 1700;
		int extraRate = (extraDistance / 313);
		if(extraDistance % 313 != 0) {
			extraRate += 1;
		}
		int extraFee = fee + (extraRate * 80);
		
		if(distance >= 1701) {
			System.out.println("料金は" + extraFee + "円です");
		}
			else {
				System.out.println("料金は610円です");
			}
	}
}
