package org.rima.practicas2;
import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		int numero=0, intentos=0;
		
		while (numero!=aleatorio){
			intentos++;
			System.out.println("Ingresa un n�mero");
			numero=entrada.nextInt();
			
			if (aleatorio<numero){
				System.out.println("M�s bajo");
			}
			else if(aleatorio>numero){
				System.out.println("M�s alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
	}

}
