package org.rima.practicas2;
import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Ricardo";
		String pass="";
		
		while (clave.equals(pass)==false){
		
		pass=JOptionPane.showInputDialog("Ingresa la contrase�a");
		
		if (clave.equals(pass)==false){
			System.out.println("Contrase�a incorrecta");
		}

	}
	
	System.out.println("Contrase�a correcta. Acceso permitido");
	}
}
