package uebung_2_2;

public class BinomischeFormel
{
	public static void main(String[] args) 
	{
		double a;
		double b;
		
		a = 8;
		b=3;
		
		double linkerausdruck;
		double rechterausdruck;
		
		linkerausdruck = (a+b)*(a+b);
		rechterausdruck = a*a+2*a*b+b*b;
		
		System.out.println("Die 1. Binomische Formel von " + a +" und " + b + " ist " + rechterausdruck);
		
	}
	
	
}
