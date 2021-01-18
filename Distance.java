package Conversion;
public class Distance
{
double Miles=0,KM=0,Meters=0;
public void MeterToKM(int Meters)
{
KM = Meters / 1000;
System.out.println("meter to KM="+KM);
}
public void KMToMeter(int KM)
{
Meters = KM * 1000;
System.out.println("km to meter="+Meters);
}
public void  MileToKM(int Miles)
{
KM = Miles / 0.621371;
System.out.println("mile to KM="+KM);
}
public void  KMToMile(int KM)
{
Miles = KM * 0.621371;
System.out.println("km to mile="+Miles);
}
}