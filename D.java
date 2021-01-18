import Conversion.*;
class D
{
public static void main(String[] args)
{
Distance d=new Distance();
d.MeterToKM(10000);
d.KMToMeter(2000);
d.MileToKM(50);
d.KMToMile(85);
Time t=new Time();
t.HrToMin(20);
t.MinToHour(2500);
t.HrToSec(25);
t.SecToHour(8000);
Currency c=new Currency(56.890);
c.DollarToINR(851.022);
c.INRToDollar(741.65);
c.EuroToINR(963.10);
c.INRToEuro(987.12);
c.YenToINR(852.82);
c.INRToYen(258.20);
//System.out.println("meters to km="+a);
//System.out.println("km to meters="+b);
//System.out.println("miles to km="+c);
//System.out.println("km to miles="+e);
}
}
