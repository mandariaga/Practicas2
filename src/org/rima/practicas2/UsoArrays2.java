package org.rima.practicas2;
import javax.swing.*;
public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises=new String[8];
				
		/*String [] paises={"Chile", "Argentina", "Brasil", "Perú", "Colombia", "Uruguay", "Paraguay", "Venezuela"};
		  for(int i=0;i<paises.length;i++){
			System.out.println(paises[i]);
		}*/
		
		for(int i=0;i<8;i++){
			
			paises[i]=JOptionPane.showInputDialog("Ingresa país"+(i+1));
		}
		
		for(String elemento:paises){
			System.out.println(elemento);
		}

	}

}
