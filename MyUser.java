import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MyUser{
 private static Pattern usrNamePtrn = Pattern.compile("^[a-z0-9_-]{6,14}$");

 public static boolean validateUserName(String userName){

 Matcher mtch = usrNamePtrn.matcher(userName);
 if(mtch.matches()){
 return true;
 }
 return false;
 }

 public static void main(String a[]){
 System.out.println("Is 'java2pro' a valid user name? "
 +validateUserName("java2pro"));
 System.out.println("Is 'ace' a valid user name? "
 +validateUserName("ace"));
 System.out.println("Is 'JAVA2PRO' a valid user name? "
 +validateUserName("JAVA2PRO"));
 System.out.println("Is 'java.2.pro' a valid user name? "
 +validateUserName("java.2.pro"));
 System.out.println("Is 'java_2-pro' a valid user name? "
 +validateUserName("java_2-pro"));
 }
}