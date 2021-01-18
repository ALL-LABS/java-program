class Savings
{
static int ann1=4;
static int ann2=5;
private float amt;
float r,s;
public void run(int cal)
{
r=ann1%100;
s=r/12;
amt=s*cal;
System.out.println("amount 4%="+amt);
}
public void run1(int cal)
{
r=ann2%100;
s=r/12;
amt=s*cal;
System.out.println("amount 5%="+amt);
}
}
class Demo
{
public static void main(String[] args)
{
Savings s=new Savings();
s.run(2000);
s.run(3000);
Savings s1=new Savings();
s1.run1(2000);
s1.run1(3000);
}
}

