class Employee
{
String ename,eadd;
int eid;
String ephon,email;
}
class Pro extends Employee
{
Pro(String a,int b,String c,String d,String e)
{
ename=a;
eid=b;
eadd=c;
email=d;
ephon=e;
}
void amt(int bp,double da,double pf,double hra,double clu)
{
double gr;
da=bp*da;
pf=bp*pf;
hra=bp*hra;
clu=bp*clu;
gr=bp+hra+da+clu-pf;
double nsl=gr-bp;
System.out.println("employee name="+ename);
System.out.println("employee id="+eid);
System.out.println("employee address="+eadd);
System.out.println("mail id="+email);
System.out.println("phone number="+ephon);
System.out.println("da="+da);
System.out.println("pf="+pf);
System.out.println("hra="+hra);
System.out.println("clu="+clu);
System.out.println("gross amount="+gr);
System.out.println("net salary="+nsl);
}
}
class Assprof extends Employee
{
Assprof(String a,int b,String c,String d,String e)
{
ename=a;
eid=b;
eadd=c;
email=d;
ephon=e;
}
void amt(int bp,double da,double pf,double hra,double clu)
{
double gr;
da=bp*da;
pf=bp*pf;
hra=bp*hra;
clu=bp*clu;
gr=bp+hra+da+clu-pf;
double nsl=gr-bp;
System.out.println("employee name="+ename);
System.out.println("employee id="+eid);
System.out.println("employee address="+eadd);
System.out.println("mail id="+email);
System.out.println("phone number="+ephon);
System.out.println("da="+da);
System.out.println("pf="+pf);
System.out.println("hra="+hra);
System.out.println("clu="+clu);
System.out.println("gross amount="+gr);
System.out.println("net salary="+nsl);
}
}
class Assoprof extends Employee
{
Assoprof(String a,int b,String c,String d,String e)
{
ename=a;
eid=b;
eadd=c;
email=d;
ephon=e;
}
void amt(int bp,double da,double pf,double hra,double clu)
{
double gr;
da=bp*da;
pf=bp*pf;
hra=bp*hra;
clu=bp*clu;
gr=bp+hra+da+clu-pf;
double nsl=gr-bp;
System.out.println("employee name="+ename);
System.out.println("employee id="+eid);
System.out.println("employee address="+eadd);
System.out.println("mail id="+email);
System.out.println("phone number="+ephon);
System.out.println("da="+da);
System.out.println("pf="+pf);
System.out.println("hra="+hra);
System.out.println("clu="+clu);

System.out.println("gross amount="+gr);
System.out.println("net salary="+nsl);
}
}
class Prof extends Employee
{
Prof(String a,int b,String c,String d,String e)
{
ename=a;
eid=b;
eadd=c;
email=d;
ephon=e;
}
void amt(int bp,double da,double pf,double hra,double clu)
{
double gr;
da=bp*da;
pf=bp*pf;
hra=bp*hra;
clu=bp*clu;
gr=bp+hra+da+clu-pf;
double nsl=gr-bp;
System.out.println("employee name="+ename);
System.out.println("employee id="+eid);
System.out.println("employee address="+eadd);
System.out.println("mail id="+email);
System.out.println("phone number="+ephon);
System.out.println("da="+da);
System.out.println("pf="+pf);
System.out.println("hra="+hra);
System.out.println("clu="+clu);
System.out.println("phone number="+ephon);
System.out.println("gross amount="+gr);
System.out.println("net salary="+nsl);
}
}
class Papf
{
public static void main(String[] args)
{
//Employee e=new employee();
Pro a=new Pro("rupkanth reddy",23465,"62-15-714 old guntur, guntur","rupkanth234@gmail.com","9542644557");
a.amt(55000,0.97,0.12,0.10,0.1);
Assprof b=new Assprof("vamsi krishna",23467,"18/A  pedakakani, guntur","vamsinarukullapati28@gmail.com","9585213485");
b.amt(50000,0.97,0.12,0.10,0.1);
Assoprof c=new Assoprof("sai surendra",23445,"85/V machilipatnam,krishna district","surendrea456@gmail.com","6392587410");
c.amt(45000,0.97,0.12,0.10,0.1);
Prof d=new Prof("sivaiah",13258,"2/Z avanigadda,krishna district","sivaiah5@gmail.com","9874563210");
d.amt(40000,0.97,0.12,0.10,0.1);
}
}
 