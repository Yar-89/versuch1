package business;


import java.io.BufferedWriter;

import java.io.FileWriter;

import fabrikMethodAlSammour.ConcretecsvtxtCreator;
import fabrikMethodAlSammour.CreatorsAlSammour;
import fabrikMethodAlSammour.ProductAlSammour;

public class MoebelstueckModel {
	private Moebelstueck moebelstueck;

	public Moebelstueck getMoebelstueck() {
		return moebelstueck;
	}

	public void setMoebelstueck(Moebelstueck moebelstueck) {
		this.moebelstueck = moebelstueck;
	} 
	
	public void leseAusDatei(String typ)throws Exception {
		//BufferedReader ein = new BufferedReader(new FileReader("Moebelstueck.csv"));
		CreatorsAlSammour creatorsAlSammour = new ConcretecsvtxtCreator(); 
		ProductAlSammour reader = creatorsAlSammour.factoryMethod(typ); 
		
	    String[] zeile = reader.leseAusDatei();
	    this.moebelstueck = new Moebelstueck(zeile[0],
	        zeile[1],
	        zeile[2],
	        Float.parseFloat(zeile[3]),
	        zeile[4].split("_"));
	    reader.schlisseDatei();
      		
	}
		
	public void schreibeMoebelstueckeInCsvDatei() throws Exception{
			BufferedWriter aus = new BufferedWriter(new FileWriter("MoebelstueckeAusgabe.csv", true));
			aus.write(moebelstueck.gibMoebelstueckZurueck(';'));
			aus.close();
   			
	
	}

}
