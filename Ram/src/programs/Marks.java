package programs;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks == 100)
		{
			System.out.println("A+");
		}
		else if(marks <100 && marks > 90)
		{
			System.out.println("A");
		}
		else if(marks <100 && marks >85)
		{
			System.out.println("B+");
		}
		else if(marks < 100 && marks > 80)
		{
			System.out.println("B");
		}
		else if(marks < 100 && marks >=70)
		{
			System.out.println("C");
		}
		else if(marks < 70)
		{
			System.out.println(marks+"failed");
		}

	}

}
