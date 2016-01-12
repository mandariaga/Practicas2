package org.rima.practicas2;

public class UsoArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix=new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=16;
		matrix[0][2]=17;
		matrix[0][3]=18;
		matrix[0][4]=19;
		
		matrix[1][0]=25;
		matrix[1][1]=26;
		matrix[1][2]=27;
		matrix[1][3]=28;
		matrix[1][4]=29;
		
		matrix[2][0]=35;
		matrix[2][1]=36;
		matrix[2][2]=37;
		matrix[2][3]=38;
		matrix[2][4]=39;
		
		matrix[3][0]=45;
		matrix[3][1]=46;
		matrix[3][2]=47;
		matrix[3][3]=48;
		matrix[3][4]=49;
		
		for(int i=0;i<4;i++){
			System.out.println();
			for(int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+" ");
			}
		}

	}

}
