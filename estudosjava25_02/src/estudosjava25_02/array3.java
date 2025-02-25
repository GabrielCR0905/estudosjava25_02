package estudosjava25_02;

public class array3 {

	public static void main(String[] args) {
		double[] numeros = {1,4,6,8,9};
		double soma = 0;
		
		for ( double num : numeros) {
			soma += num;
			
		}

		double media = soma / numeros.length;
		System.out.print("a media dos numeros é: " + media);
	}

}
