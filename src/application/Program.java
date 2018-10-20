package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1,c2,q1,q2;
		double p1, p2;
		
		c1 = sc.nextInt();
		q1 = sc.nextInt();
		p1 = sc.nextDouble();
		
		c2 = sc.nextInt();
		q2 = sc.nextInt();
		p2= sc.nextDouble();
	
		
		
		
		Product p = new Product(c1,c2,p1,p2,q1,q2);
		
		System.out.println("VALOR A PAGAR R$ = "+ String.format("%.2f", p.total()));
		
		sc.close();
		
		
		

	}

}
