
public class pattren3 {
	public static void main(String args[])
	{
		int alpha = 65;
		int r = 5;
		for (int m = r; m >= 1; m--)
		{
			for (int n = r; n >= m; n--)
			{
				System.out.print((char) (alpha + n - 1) + " ");
			}
			System.out.println();
		}
	}
}
/*out put
E 
E D 
E D C 
E D C B 
E D C B A */