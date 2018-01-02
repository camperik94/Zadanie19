
public class Zadanie {
	public static void main(String[] args) {
		
		int[] tablica = new int[10];
		
		Obliczenia obl = new Obliczenia(tablica);
		
		obl.funkcjaLosuj();
		obl.minMax();
		System.out.println("Srednia wynosi " +obl.srednia());
		obl.liczbaElementow();
		obl.odwroconaKolejnosc();
	}
}
