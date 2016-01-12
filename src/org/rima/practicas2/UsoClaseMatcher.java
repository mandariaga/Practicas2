package org.rima.practicas2;
import java.util.regex.*;
public class UsoClaseMatcher {

	public static void main(String[] args) {
		// BUQUEDA
		//formato de la cadena de busqueda
		String patron="www\\.\\w*\\.es";
		String direcciones="La direcci�n de b�squeda";
		direcciones+="es www.seach.es, aunque para ";
		direcciones+="navegar, mejor www.boat.es.";
		direcciones+="Para informarse: www.news.es";
		//creaci�n de los objetos Pattern y Matcher
		Pattern p=Pattern.compile(patron);
		Matcher m=p.matcher(direcciones);
		
		//recuperaci�n de todas las coincidencias
		while(m.find()){
			System.out.println(m.group());
		}
		

	}

}
