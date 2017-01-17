package net.sytes.codeline.domaci03;

public class SobaDaoImpl implements SobaDao {

	public void addSoba() {
		System.out.println("Soba je dodata!");
	}

	public void addSobaBrojKreveta(int brojKreveta) {
		System.out.println("Dodata je soba sa brojem kreveta: " + brojKreveta);
	}

	public void addSobaException() throws Exception {
		System.out.println("Soba je uspesno dodata uz izuzetak!");
		throw new Exception("Izuzetna soba je dodata!");
	}

}
