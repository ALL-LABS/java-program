import java.util.*;
import java.lang.*;
class Samp
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String[] a=new String[30];
System.out.println("enter n value");
int n=s.nextInt();
System.out.println("enter string elements");
int i;
for(i=0;i<n;i++)
a[i]=s.next();
int l=0;
int m;
int flag=0;
int h=n-1;
String k;
System.out.println("enter saerch element");
k=s.next();
while(l<=h)
{
m=(l+h)/2;
if(a[].CompareTo()<0)
h=m-1;
else if(a[].CompareTo()>0)
l=m+1;
else
{
flag=1;
System.out.println("element fpound"+m);
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}
