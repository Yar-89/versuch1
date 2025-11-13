package fabrikMethodAlSammour;

import java.io.BufferedReader;
import java.io.FileReader;

	public class ConcreteTXTProduct extends ProductAlSammour{
		private BufferedReader br; 
	
		
	public ConcreteTXTProduct() throws Exception{
		super();
		this.br = new BufferedReader(new FileReader("Moebelstueck.txt"));
	}
	@Override
	public String[] leseAusDatei() throws Exception {
		
		String[] ergbnisZeile = new String [5]; 
		String zeile =br.readLine(); 
		int i = 0; 
		while (i<ergbnisZeile.length) {
			ergbnisZeile[i] = zeile; 
			zeile = br.readLine(); 
			i++;
		}
		return ergbnisZeile ;
	}

	@Override
	public void schlisseDatei() throws Exception {
		br.close();
		
	}

}
