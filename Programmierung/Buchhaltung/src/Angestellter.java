import java.time.LocalDate;

public class Angestellter extends Mitarbeiter {

	private double gehalt;

	public Angestellter(int _GebJahr, String _Vorname, String _Nachname, String _Beruf, char _Geschlecht, double _Gehalt) throws Exception {
		super(_GebJahr, _Vorname, _Nachname, _Beruf, _Geschlecht);
		setGehalt(_Gehalt);
	}

	public void Lohnerhöhung(double prozent) throws Exception {
		if(prozent < 0 || prozent > 5) {
			throw new Exception("Prozent Eingabe muss größer als 0 und kleiner als 10 sein");
		} else {
			prozent = (prozent / 100);
			gehalt += gehalt * prozent;
		}
	}

	@Override
	public String Gehaltsabrechnung() {
		String str = "";
		if(super.getGeschlecht() == 'M') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Herrn" + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt(); 
		}
		else if(super.getGeschlecht() == 'W') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Frau" + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt(); 
		}
		else if(super.getGeschlecht() == 'D') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt(); 
		}
		return str;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) throws Exception {
		if(gehalt <= 0) {
			throw new Exception("Gehalt kann nicht kleiner als 0 sein");
		}
		this.gehalt = gehalt;
	}

}
