package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021118  鄭曉玫
 */
import java.util.Scanner;
public class ex05_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		long v1 = scn.nextLong();
		long sum = 0;
		while(v1>0){
			sum=sum+v1%10;
			v1=v1/10;
		}
		System.out.println(sum );
	}

}


