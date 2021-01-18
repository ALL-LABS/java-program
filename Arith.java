import java.util.*;
class Arith
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
int a=s.nextInt();
System.out.println("enter b value");
int b=s.nextInt();
try
{
int c=a/b;
System.out.println("division of a/b="+c);
}
catch(ArithmeticException e)
{
System.out.println("division not possible");
}
try
{
System.out.println("enter an element");
int d=s.nextInt();
System.out.println("given value="+d);
}
catch(InputMismatchException e)
{
System.out.println("Invalid input");
}
}
}
