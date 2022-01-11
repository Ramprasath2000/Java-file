package programs;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rem1,rem2,rem3,rem4,sum;
		double x;
		System.out.println("Enter the value ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		
		
		rem1=x%3;
		rem2=x%7;
		rem3=x%17;
		rem4=x%25;
		sum=rem1+rem2+rem3+rem4;
		
		System.out.println(sum);
		if(sum%2 == 0)
		{
			System.out.println("\nIt is an even number");
		}
		else
		{
			System.out.println("\n It is an odd number");
		}
		

	}

}
