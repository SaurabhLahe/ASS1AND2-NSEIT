package Assingment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter the number ");
		Scanner SC=new Scanner(System.in);
		int n=SC.nextInt();

		int b=n;
		System.out.println(n+" "+b);
		 
		int c;

		for(int i=1;i<=5;i++)
		{
			c=n+b;
			System.out.println(" "+ " "+c);
			n=b;
			b=c;

		int sum=0;
		sum+=c;
		c++;

		System.out.println("sum = "+sum);

		}
		
	}

}
