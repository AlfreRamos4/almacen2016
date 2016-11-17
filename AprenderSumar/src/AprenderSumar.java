import java.util.Scanner;

public class AprenderSumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1= (int) (Math.random()*10);
	int num2= (int) (Math.random()*10);
	
		System.out.println( num1 + " + " + num2 + " = ?");
		
		Scanner input = new Scanner(System.in);
		int pregunta = input.nextInt();
		
		boolean escorrecto = (num1+num2) == pregunta;
		
		System.out.print(num1 + " + "
				+ "  " + num2 + " = " + pregunta + " is " + escorrecto );
		
	

	
	
	
	}

}
