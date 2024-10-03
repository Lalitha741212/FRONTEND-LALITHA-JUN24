
public class pattren2 {
	public static void main(String args[])
	{
		int alpha = 65;
		int r = 5;
		for (int m = 1; m <= r; m++)
		{
			for (int n = 1; n <= m; n++) 
			{ 
				System.out.print((char) (alpha + n - 1) + " "); 
			} 
				System.out.println(); 
			} 
		for (int m = r; m >= 1; m--)
		{
			for (int n = 1; n <= m - 1; n++)
			{
				System.out.print((char) (alpha + n - 1) + " ");
			}
			System.out.println();
		}
	}
}

/*out put
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D 
A B C 
A B 
A */
