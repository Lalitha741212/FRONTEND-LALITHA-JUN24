
public class alph {
public static void main(String[] args) {
	int alpha=65;
	int r=5;
	for(int n=1;n<=r;n++) {
		for(int m=1;m<=n;m++) {
			System.out.print((char)(alpha + m-1)+ " ");
		}
		System.out.println();
	}
}
}
/*
A 
A B 
A B C 
A B C D 
A B C D E*/