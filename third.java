package Assignment_1;

public class third {

	public static void main(String[] args) 
	{
		int n=15;
		for(int i=0;i<n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=(n-1)/2)
					System.out.print("*");
				else if(j-i>(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n/2;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
