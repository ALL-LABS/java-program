import java.util.*;
import java.lang.*;
class Rand
{
public static void main(String[] args)
{
int i,j;
int min=1,max=10000;
int r=max-min+1;
for(i=1;i<=10000;i++)
{
 int m=(int)(Math.random()*r)+min;
System.out.println(m);
}
System.out.println("j values");

for(j=1;j<=10000;i++)
{
 int m=(int)(Math.random()*r)+min;
System.out.println(m);
}
}
}
