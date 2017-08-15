import java.util.*;

public class Determinante {
	
	public static void main(String []args){
		Scanner console = new Scanner(System.in);
		System.out.println("Geben Sie die Ordnung der Matrix an (Bsp.. 2 -->2x2 ,3 --> 3x3) : ");
		int ordnung = console.nextInt();
		if(ordnung == 2 || ordnung == 3){
		eingeben(console , ordnung);
		}else{
			System.out.println("Das Programm kann die angegebene Ordnung nicht berechnen !");
		}
	}
	
	public static void eingeben(Scanner console , int ordnung){
		double [][] matrix = new double [ordnung][ordnung];
		for(int i = 0 ; i<matrix.length;i++){
			for(int j = 0; j<matrix[i].length;j++){
				System.out.println("Geben Sie die Zahlen der "+(i+1)+". Zeile ein : ");
				double x = console.nextDouble();
				matrix[i][j] = x;				
			}
		}
		
		berchnen(ordnung, matrix);
	}
	
	public static void berchnen(int ordnung, double[][] matrix){
		if(ordnung == 2){
			double schritt1 = matrix[0][0] * matrix[1][1];
			double schritt2 = matrix[1][0] * matrix[0][1];
			double ergebnis = schritt1 - schritt2;
			System.out.println("Die Determinante der "+ordnung+". Ordnung Matrix ist : "+ergebnis);
		}else if(ordnung ==3){
			double schritt1 = matrix[0][0] * matrix[1][1] * matrix [2][2];
			double schritt2 = matrix[0][1] * matrix[1][2] * matrix[2][0];
			double schritt3 = matrix[0][2] * matrix[1][0] * matrix[2][1] ;
			
			double schritt4 = matrix[0][1] * matrix[1][0] * matrix[2][2];
			double schritt5 = matrix[0][0] * matrix[1][2] * matrix[2][1]; 
			double schritt6 = matrix[0][2] * matrix[1][1] *	matrix[2][0];
			
			double ergebnis = (schritt1 + schritt2 + schritt3) - (schritt4 + schritt5 + schritt6 ) ;
			System.out.println("Die Determinante der "+ordnung+". Ordnung Matrix ist : "+ergebnis);
		}
	}
	
}
