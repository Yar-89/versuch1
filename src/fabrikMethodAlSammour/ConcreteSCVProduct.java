package fabrikMethodAlSammour;

import java.io.BufferedReader;
import java.io.FileReader;

public class ConcreteSCVProduct extends ProductAlSammour {
	private BufferedReader br; 
	
	public ConcreteSCVProduct() throws Exception{
		super();
		this.br = new BufferedReader(new FileReader("Moebelstueck.csv"));
	}

	@Override
	public String[] leseAusDatei() throws Exception {
		String[]  zeile = br.readLine().split(";"); 
		return zeile;
	}

	@Override
	public void schlisseDatei() throws Exception {
		//if (br != null) {
			br.close();
		//}
		
	}
	
}
