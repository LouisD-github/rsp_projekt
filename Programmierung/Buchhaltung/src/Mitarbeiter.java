import java.time.LocalDate;

public abstract class Mitarbeiter {

	private String Mnr;
	private int GebJahr;
	private String Vorname;
	public String Nachname;
	private String Berufsbezeichnung;
	private LocalDate Austrittsdatum;
	private static int Weiblich;
	private static int Männlich;
	private static int AnzahlMitarbeiter;
	private LocalDate Eintrittsdatum;
	private final static int MaxMitarbeiter = 20;
	private char Geschlecht;
	
	public Mitarbeiter(int _GebJahr, String _Vorname, String _Nachname, String _Beruf,String _Geschlecht) {
	setGebJahr(_GebJahr); 
	setVorname(_Vorname);
	setNachname(_Nachname);
	
    AnzahlMitarbeiter++;
	}
	
	//Getter && Setter

	public String getMnr() {
		return Mnr;
	}

	public void setMnr(String mnr) {
		Mnr = mnr;
	}

	public int getGebJahr() {
		return GebJahr;
	}

	public void setGebJahr(int gebJahr) {
		GebJahr = gebJahr;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getBerufsbezeichnung() {
		return Berufsbezeichnung;
	}

	public void setBerufsbezeichnung(String berufsbezeichnung) {
		Berufsbezeichnung = berufsbezeichnung;
	}

	public LocalDate getAustrittsdatum() {
		return Austrittsdatum;
	}

	public void setAustrittsdatum(LocalDate austrittsdatum) {
		Austrittsdatum = austrittsdatum;
	}

	public LocalDate getEintrittsdatum() {
		return Eintrittsdatum;
	}

	public void setEintrittsdatum(LocalDate eintrittsdatum) {
		Eintrittsdatum = eintrittsdatum;
	}

	public char getGeschlecht() {
		return Geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		Geschlecht = geschlecht;
	}
	
	
	
}
