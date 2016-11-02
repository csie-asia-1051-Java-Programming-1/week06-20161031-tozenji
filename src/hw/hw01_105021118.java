package hw;
import java.util.Scanner;
public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("v1,type=>" );
		
		double v1=scn.nextDouble();
		double type=scn.nextDouble();
	fun(v1,type);
		
			
	}	
public static void fun(double v1,double type){
	Scanner scn = new Scanner(System.in);
		
	if(type==1){
		
		System.out.println((v1*(9/5)+32));
	
	}else{
		
	if(type==2){
		
		System.out.println(((v1-32)*(5/9)));

	}		
	}		
    }     
    }

