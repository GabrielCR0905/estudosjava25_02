package estudosjava25_02;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5,6};
		int maior = numeros[0];
		int menor = numeros[0];
		
		for(int num : numeros) {
			if (num > maior ) maior = num;
			if (num < menor ) menor = num;
			
		}
		
		System.out.print("Maior numero:" + maior );
		System.out.print("Menor numero:" + menor);
		
		
		
	}
	
	
	
	
	
}
