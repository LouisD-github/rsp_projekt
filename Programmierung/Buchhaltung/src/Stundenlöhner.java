import java.time.LocalDate;

public class Stundenlöhner extends Mitarbeiter {
	
	private double gehalt;
	private double stundenanzahl;
	private double stundenlohn;

	public Stundenlöhner(int _GebJahr, String _Vorname, String _Nachname, String _Beruf, char _Geschlecht,
			double _stundenlohn, double _studenanzahl)
			throws Exception {
		super(_GebJahr, _Vorname, _Nachname, _Beruf, _Geschlecht);
		setStundenanzahl(_studenanzahl);
		setStundenlohn(_stundenlohn);
		setGehalt(gehalt);
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
		stundenanzahl += stundenanzahl * 4;
		gehalt = stundenanzahl * stundenlohn;
		if(gehalt < 0) {
			throw new Exception("Gehalt kann nicht negativ sein");
		}
		this.gehalt = gehalt;
	}

	public double getStundenanzahl() {
		return stundenanzahl;
	}

	public void setStundenanzahl(double stundenanzahl) throws Exception {
		if(stundenanzahl < 0) {
			throw new Exception("Stundenanzahl kann nicht kleiner als 0 sein");
		}
		this.stundenanzahl = stundenanzahl;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) throws Exception {
		if(stundenlohn < 0) {
			throw new Exception("Stundenlohn kann nicht kleiner als 0 sein");
		}
		this.stundenlohn = stundenlohn;
	}

}
