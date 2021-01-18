package Conversion;
public class Time
{
public void HrToMin(int Hours)
{
double Minutes = 0;
Minutes = Hours * 60;
System.out.println("hr to min="+Minutes);
}
public void MinToHour(int Minutes)
{
double Hours = 0;
Hours = Minutes / 60;
System.out.println("min to hour="+Hours);
}
public void HrToSec(int Hours)
{
double Seconds = 0;
Seconds = Hours * 3600;
System.out.println("hr to sec="+Seconds);
}
public void SecToHour(int Seconds)
{
double Hours = 0;
Hours = Seconds / 3600;
System.out.println("secto hours="+Hours);
}
}