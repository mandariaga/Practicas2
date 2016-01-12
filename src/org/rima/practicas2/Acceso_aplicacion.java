package org.rima.practicas2;
import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Ricardo";
		String pass="";
		
		while (clave.equals(pass)==false){
		
		pass=JOptionPane.showInputDialog("Ingresa la contraseña");
		
		if (clave.equals(pass)==false){
			System.out.println("Contraseña incorrecta");
		}

	}
	
	System.out.println("Contraseña correcta. Acceso permitido");
	}
}
