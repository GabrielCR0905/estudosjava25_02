package estudosjava25_02;

public class array4 {

	public static void main(String[] args) {
		int[] numeros = {22,45,67,66,87,98,123,654,};
		int contador = 0;
		

		for ( int num : numeros) {
			if( num %2 == 0) {
				contador++;
				
			}
		}
		System.out.print("quantidade de pares dentro da array" + contador);
	}

}
