package Conversion;
public class Currency
{
double ER = 0;
public Currency(double CurrentExchange)
{
ER = CurrentExchange;
}
public void DollarToINR(double Dollars)
{
double INR = 0;
INR = Dollars * ER;
System.out.println("Dollar to Inr="+INR);
}
public void  INRToDollar(double INR)
{
double Dollars = 0;
Dollars = INR / ER;
System.out.println("Inr  to Dollar="+Dollars);
}
public void EuroToINR(double Euros)
{
double INR = 0;
INR = Euros * ER;
System.out.println("Euro to Inr="+INR);
}
public void INRToEuro(double INR)
{
double Euros = 0;
Euros = INR / ER;
System.out.println("Inr to Euro="+Euros);
}
public void YenToINR(double Yens)
{
double INR = 0;
INR = Yens * ER;
System.out.println("yen Inr="+INR);
}
public void INRToYen(double INR)
{
double Yens = 0;
Yens = INR / ER;
System.out.println("Inr to Yen="+Yens);
}
}