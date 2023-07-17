/*
 * 西暦を入力したらその年が閏（うるう）年かどうかを
 * 判定するプログラムを作成せよ。なお、4で割り切れる年のうち、
 * 100で割り切れないか、400で割り切れる年は閏年である。
 * 100で割り切れて、400で割り切れないのが例外の平年
 * 
 * 
 *      		  できた？？？？
 *      
 *      
 */
package test1;

public class Question52 {
	public static void main(String[] args) {
		uruu(2100);
		// 2400 o 2100x 2012 o
	}
	public static void uruu(int year) {
		if(year % 400 == 0 )// && year % 100 == 0 && year % 400 == 0)
		{
		System.out.println("うるう年です1")	;
		}
		else if (year % 4 == 0 && year %100 != 0)
		{
			System.out.println("うるう年です2")	;	
		}
		else
		{
			System.out.println("うるう年じゃないです")	;		
		}
	}
}
