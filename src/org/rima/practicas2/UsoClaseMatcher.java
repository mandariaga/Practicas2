package org.rima.practicas2;
import java.util.regex.*;
public class UsoClaseMatcher {

	public static void main(String[] args) {
		// BUQUEDA
		//formato de la cadena de busqueda
		String patron="www\\.\\w*\\.es";
		String direcciones="La dirección de búsqueda";
		direcciones+="es www.seach.es, aunque para ";
		direcciones+="navegar, mejor www.boat.es.";
		direcciones+="Para informarse: www.news.es";
		//creación de los objetos Pattern y Matcher
		Pattern p=Pattern.compile(patron);
		Matcher m=p.matcher(direcciones);
		
		//recuperación de todas las coincidencias
		while(m.find()){
			System.out.println(m.group());
		}
		

	}

}
