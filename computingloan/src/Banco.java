

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println( " �que cantidad requiere? ");
		double cantidad = input.nextDouble();
		
		System.out.println(" �en cuantos a�os los quiere devolver? ");
		 int a�os= input.nextInt();

		System.out.println(" �que tipo de inter�s? ");
		  double interesanual= input.nextDouble();
		  
		  double interesmensual = interesanual / 1200;
		  
		  double monthlyPayment= (cantidad * interesmensual) / 1- (1 / Math.pow(interesmensual, a�os * 12));
		  
		  double pagototal= monthlyPayment * a�os * 12;
		  
		 
		  System.out.println( " el pago mensual es " + (int) ( interesmensual * 100) / 100 + " euros " );
		  
		  System.out.println("El pago total es " + (int) (pagototal * 100) / 100 + " euros " );
		  
		  
		  
		 
		  
				  
		  
				  
		
				  
	}

}
