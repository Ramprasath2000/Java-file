package programs;

public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  input_f,output_f=1;
	
		input_f=5;
		for(int i=1; i<=input_f;i++)
		{
			output_f=output_f*i;
		}
		System.out.println(output_f);
		if(output_f < 1700)
		{
			System.out.println("suresh");
			
		}
		else
		{
			System.out.println("Giri");
		}
	}

}
