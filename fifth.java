package Assignment_1;

public class fifth {

	public static void main(String[] args) 
	{
		int[] v= new int[2];
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1)
					System.out.print("*");
				else if(i+j<=(n-1)/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
