
public class Zadanie {
	public static void main(String[] args) {
		
		int[] tablica = new int[10];
		
		Obliczenia obl = new Obliczenia(tablica);
		
		obl.funkcjaLosuj();
		obl.minMax();
	}
}
