﻿package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021118  鄭曉玫
 */
import java.util.Scanner;
public class ex03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	decomp( );
		
	}
	public static void decomp( ){
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	char data [ ]= str.toCharArray();
	for(int i=0;i<data.length;i++){
		System.out.print(data[i]+"\t");
		
	}
	System.out.println();
	}

}
