import java.util.Scanner;

 public class Conversor { 
      public static void main (String[] args){  
     double celsius ;     
     double kelvin ;
     double fahrenheit ;
     
Scanner sc=new Scanner (System.in); 
 
  System.out.println ("Qual a temperatura:");
celsius = sc.nextDouble();

fahrenheit =(celsius * 9/5) + 32;
kelvin = celsius +273.15;

System.out.println ("A temperatura em celsius é:" + celsius);
System.out.println  ("A temperatura em kelvin é:" + kelvin); 
System.out.println ("A temperatura em farenheit é:" + fahrenheit);  
     
      }
 }     