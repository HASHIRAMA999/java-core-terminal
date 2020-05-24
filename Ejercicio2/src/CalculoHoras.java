// Mathews jared
import java.util.Scanner;

public class CalculoHoras {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// se declara una variable para capturar los datos 
		Scanner lectura = new Scanner(System.in);
		int horas = 0, semanas =0, cal_semana = 0, cal_hora=0, salario =0, cal_mes=0;
		
		// dialogo con el usuario
		System.out.println("Cuantas horas trabajara el empleado ");
		horas = lectura.nextInt();// captura el dato del usuario 
		
		// dialogo con el usuario
		System.out.println("Cuanto sera el salario por hora que se le pagara al empleado ");
		salario = lectura.nextInt();// captura el dato del usuario 
		// calcula el salario por hora, por semana y por mes 
		cal_hora = salario * horas;
		cal_semana = cal_hora *5;
		cal_mes = cal_hora*20;
		
		// presenta los datos finales en pantalla
		System.out.println("El salario por hora del empleado es :"+cal_hora);
		System.out.println("El salario por semana del empleado es :"+cal_semana);
		System.out.println("El salario por mes del emplado es :"+cal_mes);
	 
		
		

	}

}
