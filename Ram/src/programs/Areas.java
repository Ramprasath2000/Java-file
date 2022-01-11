package programs;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int rec_out,sq_out;
		double cir_out,tri_out;
		Scanner sc =new Scanner(System.in );
		System.out.println("\nEnter your choice");
		choice=sc.nextInt();
	
		switch(choice)
		{
			case 1:
				int b,l;
				System.out.println("\nEnter the length of the rectangle");
				l=sc.nextInt();
				System.out.println("\nEnter the breadth of the rectangle");
				b=sc.nextInt();
	
				rec_out=l*b;
				System.out.println("Area of the rectangle is "+rec_out);
				break;
			case 2:
				int a;
				a=sc.nextInt();
				System.out.println("\nEnter the side of the square");
				sq_out=a*a;
				System.out.println("\nArea of the square is"+sq_out);
				break;
			case 3:
				int r;
				r=sc.nextInt();
				System.out.println("\nEnter the radius of the circle");
				cir_out=Math.PI * r * r;
				System.out.println("\nArea of the circle is"+cir_out);
				break;
			default:
				System.out.println("\nInvalid choice");
						
				
			
		}
		

	}

}
