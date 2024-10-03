
public class pattern4 {
	public static void main(String args[])
	{
		int r = 5;
		for (int m = 1; m <= r; m++) 
                {
                        for (int n = r; n >= m; n--)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
/*output
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5*/