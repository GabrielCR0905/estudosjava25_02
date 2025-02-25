package estudosjava25_02;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		int[] lista = {1,2,3,4,5};
		int soma = 0;
		
		
		for( int num : lista) {
			soma+= num;
		}

		System.out.print("A soma dos elementos da lista" + soma);
	}

}
