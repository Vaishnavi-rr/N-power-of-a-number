import java.util.*;
public class Main{
public static void main (String arg[]){
Scanner sc = new Scanner(System.in);
double base =sc.nextDouble();
double exp=sc.nextDouble();
double result =1;
while(exp!=0){
    result=result*base;
    --exp;
}
System.out.println(result);

}
}
