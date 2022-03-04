import java.util.Scanner;
public class fibonacci 
{

    public static void main(String[] args) 
    {
        int n, num1 = 0, num2 = 0, num = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            num1 = num2;
            num2= num;
            num = num1 + num2;
            System.out.print(num1+" ");
        }
    }
}