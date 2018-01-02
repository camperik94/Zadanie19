import java.util.Random;

public class Obliczenia {
	private int tablica[];

	public int[] getTablica() {
		return tablica;
	}

	public void setTablica(int[] tablica) {
		this.tablica = tablica;
	}

	public Obliczenia(int[] tablica) {
		this.tablica = tablica;
	}
	
	public void funkcjaLosuj() {
		int i = 0;
		Random generator = new Random();
		while(i < tablica.length) {
			tablica[i] = generator.nextInt(21) - 10;
			i++;
		}
		
		for(int j = 0; j < tablica.length; j++) {
			System.out.print(tablica[j]);
			System.out.print(' ');
		}
		System.out.println();
	}
	public void minMax() {
		int min = 10;
		int max = -10;
		
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i] < min) {
				min = tablica[i];
			}
			if(tablica[i] > max) {
				max = tablica[i];
			}
		}
		System.out.println("Minimalna wartosc to: " + min);
		System.out.println("Maxymalna wartosc to: " + max);

	}
	
	
}
