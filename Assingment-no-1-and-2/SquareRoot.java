package Assingment;


import java.util.Scanner;


public class SquareRoot {

	public static void main(String[] args) {
	
		         int x1,x2,y1,y2;
		        
		          double dis; 
		          
		          Scanner sc=new Scanner(System.in);
		          
		          System.out.println("enter x1 value");
		          
		          x1=sc.nextInt();
		           
		          System.out.println("enter x2 value");
		          
		          x2=sc.nextInt();
		          
		          System.out.println("enter y1 value");
		          
		          y1=sc.nextInt();
		          
		          System.out.println("enter y2 value");
		          
		          y2=sc.nextInt();
		          
		          dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		          
		          System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")====>"+dis);

			}

	
	}


