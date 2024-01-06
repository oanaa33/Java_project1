package p1;

import java.util.Scanner;

public class Project {
	
	public static void exercitiul1()
	{
		int a, b, c;
		int max, patratulmax;
		Scanner tastatura=new Scanner(System.in);
		
		System.out.print("Primul numar= ");
		a = tastatura.nextInt();
		
		System.out.print("Al doilea numar= ");
		b = tastatura.nextInt();
		
		System.out.print("Al treilea numar= ");
		c = tastatura.nextInt();
		
		if(a < 0)
		{
			a = Math.abs(a);
		}
		if(b < 0)
		{
			b = Math.abs(b);
		}
		if(c < 0)
		{
			c = Math.abs(c);
		}
		
		System.out.println("Perimetrul triunghiului= " + (a+b+c));
		
		max = Math.max(a, Math.max(b, c));
		System.out.println("Latura de lungime maxima= " + max);
		
		patratulmax = (int)Math.pow(max, 2);
		System.out.println("Patratul laturii de lungime maxima= " + patratulmax);
		
		if(a==b && b==c)
		{
			System.out.println("Triunghiul este echilateral.");
		}
		else
		{
			System.out.println("Triunghiul nu este echilateral.");
		}
		
		if(patratulmax == Math.pow(a, 2) + Math.pow(b, 2))
		{
			System.out.println("Triunghiul este dreptunghic.");
		}
		else if(patratulmax == Math.pow(a, 2) + Math.pow(c, 2))
		{
			System.out.println("Triunghiul este dreptunghic.");
		}
		else if(patratulmax == Math.pow(b, 2) + Math.pow(c, 2))
		{
			System.out.println("Triunghiul este dreptunghic");
		}
		else
		{
			System.out.println("Triunghiul nu este dreptunghic.");
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Exercitiul 1");
		exercitiul1();
	}

}

