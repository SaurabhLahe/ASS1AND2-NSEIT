package Assingment;

	import java.util.Scanner;
	
	public class SumOfOdd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int n=sc.nextInt();
			
			int i,sum=0;
			for(i=0;i<=n;i++)
			{
				if(i%2!=0)
				{
					sum=sum+i;
				}
			}
			System.out.println(sum);
			
		}

	}


