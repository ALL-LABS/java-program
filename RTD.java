import java.Conversion.*;
import java.util.*;
class RTD
{
public static void main(String[] args)
{
Distance d=new Distance();
Time t-new Time();
Currency c=new Currency();
Scanner s=new Scanner(System.in);
while(true)
{
System.out.println("enter your choice");
int ch=s.nextInt();
switch(ch)
{
case 1:c.DollarToINR(75.253);break;
case 2:c.INRToDollar(85.258);break;
case 3:c.EuroToINR(852.46);break;
case 4:c.INRToEuro(9632.123);break;
case 5:YenToINR(784.123);break;