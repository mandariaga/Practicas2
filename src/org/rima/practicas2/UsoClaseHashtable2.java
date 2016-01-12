package org.rima.practicas2;

import java.util.*;

public class UsoClaseHashtable2 {

	public static void main(String[] args){
// GESTION NOMBRES
		Hashtable<String,String> nombres=new Hashtable<String,String>();
		
		int opcion;
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		do{
			System.out.println("Elegir opción:\n");
			System.out.println("1. Añadir nombre");
			System.out.println("2. Eliminar nombre");
			System.out.println("3. Mostrar todos los nombres");
			System.out.println("4. Salir");
			opcion=sc.nextInt();
			switch(opcion){
			  case 1:
				  String nom,rut;
				  System.out.println("Ingresa nombre: ");
				  nom=sc.next();
				  System.out.println("RUT: ");
				  rut=sc.next();
				  almacenaNombre(nom,rut,nombres);
				  break;
			  case 2:
				  String d;
				  System.out.println("Ingresa el RUT: ");
				  d=sc.next();
				  eliminaNombre(d,nombres);
				  break;
			  case 3:
				  mostrarTodos(nombres);
				  break;
}
}
		while(opcion!=4);
}
	static void almacenaNombre(String n, String k, Hashtable<String,String> lista){
		if(!lista.containsKey(k)){
			lista.put(k, n);
		}
}
	static void eliminaNombre(String k,Hashtable<String,String> lista){
		if(lista.containsKey(k)){
			lista.remove(k);
}
}
	static void mostrarTodos(Hashtable<String,String> lista){
		System.out.println("Los nombres son: ");
		Enumeration<String> claves=lista.keys();
		while(claves.hasMoreElements()){
			String k=claves.nextElement();
			System.out.println(k+" - "+lista.get(k));
}
}
}
