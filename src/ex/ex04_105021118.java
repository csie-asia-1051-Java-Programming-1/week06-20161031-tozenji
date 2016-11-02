package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021118  鄭曉玫
 */

public class ex04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A [ ]={ 1,2,3  };
	   
		square(A);		
		
		System.out.println("呼叫square( )");
		
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
		
		System.out.println();			
	}
	
	public static  int square(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			arr[i]=arr[i]*arr[i];
		return 0;
	}
	
}


