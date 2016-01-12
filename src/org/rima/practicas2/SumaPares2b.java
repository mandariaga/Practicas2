package org.rima.practicas2;
import java.util.Scanner;
	public class SumaPares2b {
			public static void main(String[] args){
			//cualquier número
			Scanner entrada=new Scanner(System.in);
			System.out.println("Ingresa número 1:");
			int n1=entrada.nextInt();
			System.out.println("Ingresa número 2:");
			int n2=entrada.nextInt();
			//int n1=7, n2=13;
			//invoca el método sumatorio para calcular la suma
			int suma=sumatorio(n1,n2);
			System.out.println("La suma es: "+suma);
		}

			private static int sumatorio(int n1, int n2) {
				// TODO Auto-generated method stub
				int suma=n1+n2;
				return suma;
			}

			

		
	}


