import java.util.Random;

public class Obliczenia {
	private int tablica[];
	private double srednia;
	
	public double getSrednia() {
		return srednia;
	}

	public void setSrednia(double srednia) {
		this.srednia = srednia;
	}

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
	
	public double srednia() {
		double suma = 0;
		
		for(int i = 0; i < tablica.length; i++) {
			suma = suma + tablica[i];
		}
		srednia = suma / 10;
		return srednia;
	}
	
	public void liczbaElementow() {
		int licznikWyz = 0;
		int licznikNiz = 0;
		
		for(int i = 0; i < tablica.length; i++) {
			if(tablica[i] > srednia) {
				licznikWyz++;
			}
			if(tablica[i] < srednia) {
				licznikNiz++;
			}
		}
		System.out.println("Liczba elementow wyzszych niz srednia: " +licznikWyz);
		System.out.println("Liczba elementow nizszych niz srednia: " +licznikNiz);
	}
	
	public void odwroconaKolejnosc() {
		for(int i = tablica.length - 1; i>= 0; i--) {
			System.out.print(tablica[i]);
			System.out.print(' ');
		}
	}
}
