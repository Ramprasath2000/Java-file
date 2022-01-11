package programs;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a=10;int b=5;int c=8;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
			
		}
		else if(b>c)
		{
			System.out.println("B is greater");
					
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
