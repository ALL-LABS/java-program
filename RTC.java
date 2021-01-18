abstract class Shape
{
abstract void area();
}
class Rect extends Shape
{
int a;
public void area()
{
int l=9,b=8;
a=2..................... *(l+b);
System.out.println("area of rectangle="+a);
//a=2*(l+b);
}
}
 class Tri extends Shape
{
int b=6,h=7;
double t;
public void area()poo`
{
t=0.5*b*h;
System.out.println("area of triangle="+t);
}
}
class Cir extends Shape
{

double a;
public void area()
{
double r=28.8;
final double PI=3.14159;
a=PI*r*r;
System.out.println("area of circle="+a);
}
}
class RTC
{
public static void main(String[] args)
{
Shape r=new Rect();
r.area();
Shape t=new Tri();
t.area();
Shape c=new Cir();
c.area();
}
}

