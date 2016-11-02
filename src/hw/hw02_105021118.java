package hw;
import java.util.Scanner;
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("(1)¨k (2)¤k : ");
	    double x=scn.nextDouble( );
		double y=scn.nextDouble( );
		fun1(x,y);
		
			}

public static void fun1(double x,double y ){
	Scanner scn = new Scanner(System.in);
	
	
	if(x==1){
		System.out.println((( y- 170 ) * 0.6+62)); 
		
	}else{
		
    if(x==2){
    	System.out.println((( y - 158 ) * 0.5+52));
    }
	}
		
	}
}

