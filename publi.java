import java.util.*;
class Book
{
String bname,bid,pub,auth;
Book()
{
this.bname=bname;
this.bid=bid;
this.pub=pub;
this.auth=auth;
}
void setname(String s)
{
bname=s;
}
void setid(String t)
{
bid=t;
}
void setauth(String v)
{
auth=v;
}
void setpub(String u)
{
pub=u;
}
String getname()
{
return bname;
}
String getid()
{
return bid;
}
String getauth()
{
return auth;
}
String getpub()
{
return pub;
}
void desc()
{
System.out.println("the book contains valuable info like how to achieve a goal");
}
}
class Publi
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Book b=new Book();
System.out.println("enter book name");
String s=sc.nextLine();
b.setname(s);
System.out.println("enter ISB number");
String s1=sc.nextLine();
b.setid(s1);
System.out.println("enter author name");
String s2=sc.nextLine();
b.setauth(s2);
System.out.println("enter publisher name");
String s3=sc.nextLine();
b.setpub(s3);
String d=b.getname();
System.out.println("book name="+d);
String e=b.getid();
System.out.println("book id="+e);
String f=b.getauth();
System.out.println("author name="+f);
String g=b.getpub();
System.out.println("publisher name="+g);
b.desc();
}
}






