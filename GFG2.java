import java.util.*;
class GFG2 
{ 
  public static void main(String []args) 
    { 
Scanner s=new Scanner(System.in);
String[] arr;
arr=new String[10];
System.out.println("enter string elements"); 
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextLine();
}
System.out.println("enter search string");
String x=s.nextLine();

        int r = binarySearch(arr, x); 
  
        if (r== -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index "
                              +r); 
    } 
static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
             
            if (res == 0) 
                return m; 
  
                       else if (res > 0) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
        } 
  
        return -1; 
    } 
  }
