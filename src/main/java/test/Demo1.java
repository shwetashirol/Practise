package test;

import java.util.Scanner;

public class Demo1 {
	//Scanner scanner = new Scanner(System.in);
	//int a=scanner.nextInt();
	//int b=a*a;
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int a=scanner.nextInt();
  for(int i=1;i<6;i++)
  { 
	int b=a*i;
	System.out.println(a+"x" + i+"=" +b);
	}
	}
}
