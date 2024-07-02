import java.time.LocalDate;

public class Geschäftsführer extends Mitarbeiter{
	private double gehalt;
    private double Zulage;
	public Geschäftsführer(int _GebJahr, String _Vorname, String _Nachname, String _Beruf, char _Geschlecht, double _Gehalt,double _Zulage) throws Exception {
		super(_GebJahr, _Vorname, _Nachname, _Beruf, _Geschlecht);
		setZulage(_Zulage);
		setGehalt(_Gehalt+getZulage());
		//setGehalt(getStundelon()*getStunde()*4);
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
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Herrn " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()+"\nDavon Zulage: "
					+getZulage()+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie()); 
			; 
		}
		else if(super.getGeschlecht() == 'W') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von Frau " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()+"\nDavon Zulage: "
					+getZulage()+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie()); 
			; 
		}
		else if(super.getGeschlecht() == 'D') {
			str = "Gehaltsabrechnung für den " + LocalDate.now() + " von " + super.getNachname()
			+ " " + super.getVorname() +  " (" + super.getMnr() + "): " + getGehalt()+"\nDavon Zulage: "
					+getZulage()+"\nWeiterhin Prämie: "+super.getPrämie()+"\nInsgesamt: "+(getGehalt()+getPrämie()); 
		}
		return str;
	}

	

	public void setGehalt(double gehalt) throws Exception {
		if(gehalt <= 0) {
			throw new Exception("Gehalt kann nicht kleiner als 0 sein");
		}
		this.gehalt = gehalt;
	}
	
	//getter && setter
	public double getGehalt() {
		return gehalt;
	}

	public double getZulage() {
		return Zulage;
	}

	public void setZulage(double zulage) throws Exception {
		if(zulage<=0){
			
			throw new Exception("Zulage kann nicht kleiner als 0 sein");
		}else {
			Zulage = zulage;
			
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+"Gehalt: " + gehalt + "\nZulage: " + Zulage;
	}

	@Override
	public void Lohnerhöhung() {
		// TODO Auto-generated method stub
		
	}
	
	//toString
	
	
	

}