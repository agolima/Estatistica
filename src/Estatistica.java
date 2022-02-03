public class Estatistica {
	public static void main(String[] args) {

		int vetor[] = { 6, 7, 15, 36, 39, 40, 41, 42, 43, 47, 49 };

		ordenarVetor(vetor);

		System.out.println("Menor valor: " + menorValor(vetor));
		System.out.println();
		System.out.println("Maior valor: " + maiorValor(vetor));
		System.out.println();
		mediana(vetor);
		System.out.println();
		primeiroQuartil(vetor);
		System.out.println();
		terceiroQuartil(vetor);
		System.out.println();

	}

	public static double menorValor(int vetor[]) {
		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (menorValor > vetor[i]) {
				menorValor = vetor[i];
			}
		}
		return menorValor;
	}

	public static double maiorValor(int vetor[]) {
		int maiorValor = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (maiorValor < vetor[i]) {
				maiorValor = vetor[i];
			}
		}
		return maiorValor;
	}

	public static double medianaImpar(int vetor[]) {
		int mediana = 0;
		int esq = 0;
		int dir = vetor.length - 1;
		int meio = 0;
		int meio2 = 0;

		meio = (esq + dir) / 2;
		mediana = vetor[meio];

		return mediana;
	}

	public static double[] medianaPar(int vetor[]) {
		int mediana = 0;
		int mediana2 = 0;
		int esq = 0;
		int dir = vetor.length - 1;
		int meio = 0;

		meio = (esq + dir) / 2;
		mediana = vetor[meio];
		mediana2 = vetor[meio + 1];

		double medianaPar[] = new double[2];
		if (vetor.length % 2 == 0) {
			medianaPar[0] = mediana;
			medianaPar[1] = mediana2;
		}
		return medianaPar;

	}

	public static void mediana(int vetor[]) {
		int contador = 0;
		double medianaImp = medianaImpar(vetor);
		double medianaP[] = medianaPar(vetor);
		for (int i = 0; i < vetor.length; i++) {
			contador++;
		}
		if (contador % 2 == 0) {
			for (int i = 0; i < medianaP.length; i++) {
				System.out.println("Mediana Par " + (i + 1) + ": " + medianaP[i]);

			}

		} else {
			System.out.println("Mediana Impar: " + medianaImp);
			medianaImpar(vetor);
		}
	}

	public static void primeiroQuartil(int vetor[]) {
		int contador = 0;
		int porcentagem = 0;
		for (int i = 0; i < vetor.length; i++) {
			contador++;
		}
		porcentagem = ((contador * 25) / 100);

		System.out.println("1º quartil: " + vetor[porcentagem]);

	}

	public static void terceiroQuartil(int vetor[]) {
		int contador = 0;
		int porcentagem = 0;
		for (int i = 0; i < vetor.length; i++) {
			contador++;
		}
		porcentagem = ((contador * 75) / 100);

		System.out.println("3º quartil: " + vetor[porcentagem]);

	}

	public static int[] ordenarVetor(int vetor[]) {
		int auxiliar = 0;

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;

				}
			}
		}
		return vetor;

	}
}
