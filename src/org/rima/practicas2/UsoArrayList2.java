package org.rima.practicas2;
import java.util.*;
public class UsoArrayList2 {

	public static void main(String[] args) {
		// TEMPERATURAS, PERO USANDO AUTOBOXING/AUTOUNBOXING
		ArrayList<Double> temperaturas=new ArrayList<Double>();
		int opcion;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Elegir opción):\n");
			System.out.println("1. Añadir temperatura");
			System.out.println("2. Mostrar temperatura "+"media");
			System.out.println("3. Mostrar temperaturas "+"extremas");
			System.out.println("4. Salir");
			opcion=sc.nextInt();
			switch(opcion){
			case 1:
				double temp;
				System.out.println("Ingresa la temperatura");
				//recupera el dato como un double
				temp=sc.nextDouble();
				almacenaTemperatura(temp,temperaturas);
				break;
			case 2:
				muestraMedia(temperaturas);
				break;
			case 3:
				muestraExtremas(temperaturas);
			}
		}
		while(opcion!=4);
	}
	static void almacenaTemperatura(double d, ArrayList<Double> temperaturas){
		//autoboxing
		temperaturas.add(d);
	}
	static void muestraMedia(ArrayList<Double> temperaturas){
		double media=0.0;
		for(Double tp:temperaturas){
			media+=tp; //autounboxing
		}
		media/=temperaturas.size();
		System.out.println("La temperatura media es: "+media);
		}
	static void muestraExtremas(ArrayList<Double> temperaturas){
		//se inicializan las variables extremo con el valor de la primera temperatura
		double maxima=temperaturas.get(0); //autounboxing
		double minima=maxima;
		for(Double tp:temperaturas){
			if(tp>maxima){
				maxima=tp; //autounboxing
			}
			if(tp<minima){
				minima=tp; //autounboxing
			}
		}
		System.out.println("La temperatura máxima es "+maxima);
		System.out.println("La temperatura mínima es "+minima);
		

	}

}
