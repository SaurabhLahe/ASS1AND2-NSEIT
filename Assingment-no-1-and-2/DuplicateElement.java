package Assingment;


	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.Scanner;

	public class DuplicateElement {

	
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array ");
		int n = sc.nextInt();
		System.out.println("enter values");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
		}
		
		System.out.println("sum of uniqe value is  "+sumOfEvenNos(a)+"");
		}
		public static int sumOfEvenNos(int[] a) {
		int sum = 0;
		LinkedHashSet<Integer> hm = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
		hm.add(a[i]);
		}
		System.out.println(hm);
		Iterator<Integer> lm = hm.iterator();
		while (lm.hasNext()) {
		int b = lm.next();
		if (b % 2 == 0)
		sum = sum + b;
		}
		return sum;
		}
		
	}

	

