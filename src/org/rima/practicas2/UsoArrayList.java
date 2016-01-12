package org.rima.practicas2;
import java.io.*;
import java.util.*;
public class UsoArrayList {

	public static void main(String[] args) 
						throws IOException{
		// En este ArrayList se almacenan todas las temperaturas
		ArrayList temperaturas=new ArrayList();
		String opcion;
		BufferedReader bf=new
				BufferedReader (new InputStreamReader(System.in));
		do{
			System.out.println("Elegir opci�n:\n");
			System.out.println("1. A�adir temperatura");
			System.out.println("2. Mostrar temperatura "+"media");
			System.out.println("3. Mostrar temperaturas extremas");
			System.out.println("4. Salir");
			opcion=bf.readLine();
			
			switch(Integer.parseInt(opcion)){
			case 1:
				double temp;
				System.out.println("Introduce la temperatura");
				//convierte a tipo double la temperatura le�da
				temp=Double.parseDouble(bf.readLine());
				alamcenaTemperatura(temp,temperaturas);
				break;
			case 2:
				muestraMedia(temperaturas);
				break;
			case 3:
				muestraExtrema(temperaturas);
			}
		}
		while(!opcion.equals("4"));
	}
	static void alamcenaTemperatura(double d,ArrayList temperaturas){
		//necesita convertir el n�mero a objeto para poderlo a�adir al ArrayList
		temperaturas.add(new Double(d));
	}
	static void muestraMedia(ArrayList temperaturas){
		double media=0.0;
		for (Object tp:temperaturas){
			//las temperaturas se convierten expl�citamente al tipo de objeto
			//original para despu�s extraer el valor num�rico
			media+=((Double)tp).doubleValue();
		}
		media/=temperaturas.size();
		System.out.println("La temperatura media es: "+media);
		}
	static void muestraExtrema(ArrayList temperaturas){
		//se inicializan las variables extremo con el valor de la primera temperatura
		double maxima;
		
		maxima=((Double)temperaturas.get(0)).doubleValue();
		double minima=maxima;
		for(Object tp:temperaturas){
			double aux;
			aux=((Double)tp).doubleValue();
			if(aux>maxima){
				maxima=aux;
			}
			if(aux<minima){
				minima=aux;
			}
		}
		System.out.println("La temperatura m�xima es "+maxima);
		System.out.println("La tempereatura m�nima es"+minima);
	}

}
