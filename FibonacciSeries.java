package excercise_1;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
		sc.close();
	}
}
