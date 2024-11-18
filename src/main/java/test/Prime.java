package test;

import java.util.Scanner;

public class Prime {
  
	public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter the number");

     int num=Sc.nextInt();
       boolean flag=true;   
     if(num<=1) 
     {
    	 flag=false;
     }
     
     for (int i=2;i<num;i++)
     {
    	 if(num%i==0) 
    	 {
    		 flag=false;
    		 
    	 }
     }
     if(flag==false)
     {System.out.println("Not a Prime");
    	 
     }
     else
     {System.out.println("The Prime");}
	}
}
