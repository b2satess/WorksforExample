/*整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）
 * に並んでいるか判定し、小さい順に並んでいる場合はOK、
 * そうなっていない場合はNGと表示するプログラムを作成せよ。
*/

package test1;


public class Question42 {
	public static void main(String[] args) {
		System.out.println("問42");
		
		question42(1,2,3);
	}
	private static void question42(int num1, int num2, int num3) {
	       if(num1 <= num2 && num2<= num3) {
	    	   System.out.println("OK");
	       }
	       else {
	    	   System.out.println("NG");
	       }
	       
	     }
}
