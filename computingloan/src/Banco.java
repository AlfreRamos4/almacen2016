

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println( " ¿que cantidad requiere? ");
		double cantidad = input.nextDouble();
		
		System.out.println(" ¿en cuantos años los quiere devolver? ");
		 int años= input.nextInt();

		System.out.println(" ¿que tipo de interés? ");
		  double interesanual= input.nextDouble();
		  
		  double interesmensual = interesanual / 1200;
		  
		  double monthlyPayment= (cantidad * interesmensual) / 1- (1 / Math.pow(interesmensual, años * 12));
		  
		  double pagototal= monthlyPayment * años * 12;
		  
		 
		  System.out.println( " el pago mensual es " + (int) ( interesmensual * 100) / 100 + " euros " );
		  
		  System.out.println("El pago total es " + (int) (pagototal * 100) / 100 + " euros " );
		  
		  
		  
		 
		  
				  
		  
				  
		
				  
	}

}
