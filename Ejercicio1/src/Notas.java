// Mathews jared
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// se declara una variable para capturar los datos 
		Scanner lectura = new Scanner (System.in);
		
		// declaraciones de variables de tipo entero que se ocuparan 
		int a=0, b= 0, c=0, prom=0;
		
		// dialogo con el usuario
		System.out.println("Digite la primera nota");
		a = lectura.nextInt(); // captura el dato del usuario 
		

		// dialogo con el usuario
		System.out.println("Digite la segunda nota");
		b = lectura.nextInt();// captura el dato del usuario 

		// dialogo con el usuario
		System.out.println("Digite la tercera nota");
		c = lectura.nextInt();// captura el dato del usuario 
		
		// se calcula el promedio
		prom= (a+b+c)/3;
		
		// presenta los datos finales en pantalla 
		System.out.println(" \n La nota final es : "+prom);
		

	}

}
