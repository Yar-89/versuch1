package fabrikMethodAlSammour;

public class ConcretecsvtxtCreator extends CreatorsAlSammour {

	
	public ProductAlSammour factoryMethod(String typ) throws Exception {
		
		if (typ.equals("csv")) {
			return new ConcreteSCVProduct();
		}else {
			return new ConcreteTXTProduct();
		}
	}

}
