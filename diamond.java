import java.util.Scanner;

public class diamond {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j;
		
		System.out.print("Enter no of Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("The Diamond Star Pattern is");
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}