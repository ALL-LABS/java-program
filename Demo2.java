import java.util.*;
class Invoice1
{
String pn,desc;
int quan;
double pri;
Invoice1()
{
this.pn=pn;
this.desc=desc;
this.pri=pri;
this.quan=quan;
}
public void setpart(String p)
{
pn=p;
}
public void setdesc1(String q)
{
desc=q;
}
public void setquant1(int r)
{
quan=r;
}
public void setpric1(double s)
{
pri=s;
}
public double getinvoice()
{
double t=quan*pri;
return t;
}
public String getpart()
{
return pn;
}
public String getdesc1()
{
return desc;
}
public int getquant1()
{
return quan;
}
public double getpric1()
{
return pri;
}
void display()
{
if(quan==0 && pri==0 || pri<0)
{
System.out.println("quantity=0");
System.out.println("price per item=0.0");
}
else if(quan>0 && pri>0)
{
System.out.println("quantity="+quan);
System.out.println("price="+pri);
}
else
System.out.println("null value");
}
}
class Demo2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Invoice1 a=new Invoice1();
System.out.println("enter a part number");
String b=sc.nextLine();
a.setpart(b);
System.out.println("enter a desc");
String c=sc.nextLine();
a.setdesc1(c);
System.out.println("enter quantity");
int d=sc.nextInt();
a.setquant1(d);
System.out.println("enter price per item");
double e=sc.nextDouble();
a.setpric1(e);
String s=a.getpart();
System.out.println("part no="+s);
String s1=a.getdesc1();
System.out.println("desc ="+s1);
int s2=a.getquant1();
System.out.println("quantity="+s2);
double s3=a.getpric1();
System.out.println("price="+s3);
double s4=a.getinvoice();
System.out.println("invoice="+s4);
a.display();
}
}




