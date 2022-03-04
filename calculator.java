import java.util.Scanner;
class calculator
{
    public static void main(String args[])
{
 int num1,num2,ch;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter first number");
 num1=sc.nextInt();
 System.out.println("Enter second number");
 num2=sc.nextInt();
 System.out.println("enter your choice: 1=Add 2=Subtract 3=Multiply 4=Division \n Enter your Choice:");
 ch=sc.nextInt();
 if (ch==1)
     System.out.println("Addition="+(num1+num2));
 else if (ch==2)
     System.out.println("Subtraction="+(num1-num2));
 else if (ch==3)
     System.out.println("Multiplication="+(num1*num2));
 else if (ch==4)
      System.out.println("Division="+(num1/num2));
 else 
     System.out.println("Wrong choice");
}
}