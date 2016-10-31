package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021118  鄭曉玫
 */
import java.util.Scanner;
public class ex01_105021118 {
                                                                                                 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int m=fun(n);
			
	}
public static int fun(int n)
{
	Scanner scn = new Scanner(System.in);
	int i,j;
	String c=scn.next();
	for( i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			
			System.out.print( c );
		}
		System.out.print("\n");
	}
	return n;
	}
}
