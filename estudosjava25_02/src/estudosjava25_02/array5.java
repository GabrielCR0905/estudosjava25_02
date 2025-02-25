package estudosjava25_02;

public class array5 {

	public static void main(String[] args) {
		int[] numeros = {1,3,5,6,7,8,4,2};
		
		System.out.print("array Invertido:");
		for( int i = numeros.length - 1 ; i >=0; i -- ) {
			System.out.print(numeros[i] + "");
		}
	}

}
