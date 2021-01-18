import java.util.*;
class Electricity
{
String cname,cno;
int cr,pr;
Electricity(String cname1,String cno1,int pr1,int cr1)
{
cname=cname1;
cno=cno1;
cr=cr1;
pr=pr1;
}
void display(int n)
{
double r;
if(cname=="domestic")
{
System.out.println("user type="+cname);
System.out.println("serial no="+cno);
System.out.println("prev reading="+pr);
System.out.println("curr reading="+cr);
  if(n<=100)
{
r=n*1;
System.out.println("less than equal to 100 units="+r);
}
else if(n>100 && n<=200)
{
r=n*2.50;
System.out.println("between 100 and 200 units="+r);
}
else if(n>200 && n<=500)
{
r=n*4;
System.out.println("between 201 to 500 units="+r);
}
else
{
r=n*6;
System.out.println("greater than 500units="+r);
}
}
else
{
System.out.println(cname);
System.out.println("serial no="+cno);
System.out.println("prev reading="+pr);
System.out.println("curr reading="+cr);
  if(n<=100)
{
r=n*2;
System.out.println("less than or equal 100 units="+r);
}
else if(n>100 && n<=200)
{
r=n*4.50;
System.out.println("between 100 and 200 units="+r);
}
else if(n>200 && n<=500)
{
r=n*6;
System.out.println("between 201 and 500 units="+r);
}
else
{
r=n*7;
System.out.println("greater than 500units="+r);
}
}
}
}
class Bill
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a,b;
int c,d;
System.out.println("enter user type");
a=s.nextLine();
System.out.println("enter user no");
b=s.nextLine();
System.out.println("enter previous reading");
c=s.nextInt();
System.out.println("enter current reading");
d=s.nextInt();
Electricity e=new Electricity(a,b,c,d);
System.out.println("enter units");
int n=s.nextInt();
e.display(n);

}
}

