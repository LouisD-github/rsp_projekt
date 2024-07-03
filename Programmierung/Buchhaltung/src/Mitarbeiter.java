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
	private static int Divers;
	private static int AnzahlMitarbeiter;
	private LocalDate Eintrittsdatum;
	private final static int MaxMitarbeiter = 20;
	private char Geschlecht;
	private double Prämie;
	
	public Mitarbeiter(int _GebJahr, String _Vorname, String _Nachname, String _Beruf,char _Geschlecht) throws Exception {
	setGebJahr(_GebJahr); 
	setVorname(_Vorname);
	setNachname(_Nachname);
	setBerufsbezeichnung(_Beruf);
	setGeschlecht(_Geschlecht);
	setMnr();
    AnzahlMitarbeiter++;
    if(getGeschlecht()== 'W') {
    	Weiblich++;
    }
    if(getGeschlecht()== 'D') {
    	Divers++;
    }
    if(getGeschlecht()== 'M') {
    	Männlich++;
    }
    setEintrittsdatum();
	}
	
	//Getter && Setter

	public String getMnr() {
		return Mnr;
	}

	
	
    private void setMnr() {
		
    	String p1 = String.valueOf(getGeschlecht());
    	String p2 = Integer.toString(getGebJahr());
        String p3 = String.valueOf(getVorname().charAt(0));
        String p4 = String.valueOf(getNachname().charAt(0));
        String p5 = "";
    	if(getBerufsbezeichnung().equals("Manager")){
    		 p5="Man";
    	}
        if(getBerufsbezeichnung().equals("Angestellter")){
        	 p5="Ang";
    	}
        if(getBerufsbezeichnung().equals("Geschäftsfüher")){
        	 p5="Ges";
        }
        if(getBerufsbezeichnung().equals("Stundenlöhner")){
        	 p5="Stu";
        }
        
        
    	Mnr = p1.concat(p2).concat(p3).concat(p4).concat(p5);
	}

	public int getGebJahr() {
		return GebJahr;
	}

	public void setGebJahr(int gebJahr) throws Exception {

         if(gebJahr>2016 || gebJahr<1960) {
        	 
        	 if(gebJahr<1960) {
            	 
            	 throw new Exception("Zu Alt");
             }
        	 if(gebJahr>2016) {
            	 
            	 throw new Exception("Zu Jung");
             }
         }else {

 			GebJahr = gebJahr; 
        	 
         }
			
		
		
		
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) throws Exception {
		
		if(vorname ==null) {
			throw new Exception("Vorname Kann nicht 0 sein");
		}else {
			
			Vorname = vorname;
		}
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) throws Exception {
		
		if(nachname ==null) {
			throw new Exception("Nachname Kann nicht 0 sein");
		}else {
			
			Nachname = nachname;
		}
	}

	public String getBerufsbezeichnung() {
		return Berufsbezeichnung;
	}

	public void setBerufsbezeichnung(String berufsbezeichnung) throws Exception {
	    
		if(berufsbezeichnung ==null) {
			throw new Exception("Berufsbezeichnung Kann nicht 0 sein");
		}else {
			
			Berufsbezeichnung = berufsbezeichnung;
		}	
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

	private void setEintrittsdatum() {
		Eintrittsdatum = LocalDate.now();;
	}

	public char getGeschlecht() {
		return Geschlecht;
	}

	public void setGeschlecht(char _Geschlecht) throws Exception {
		if(_Geschlecht == ' ') {
			throw new Exception("Geschlecht muss benannt sein & darf nur W,M,D sein");
		}else {
			if(_Geschlecht == 'W'||_Geschlecht == 'D'||_Geschlecht == 'M') {
				
				Geschlecht = _Geschlecht;
		    }
			else {
				throw new Exception("Geschlecht muss benannt sein & darf nur W,M,D sein");
			}
	    }
			
		
		
	
	}

	public double getPrämie() {
		return Prämie;
	}

	public void setPrämie(double prämie) throws Exception {
		if(prämie<=0) {
			throw new Exception("Prämie kann nicht unter gleich 0 sein");
			
		}else {
			
			Prämie = prämie;
		}
		
		
	}
	
	
	
	
	
	public static int getWeiblich() {
		return Weiblich;
	}

	

	public static int getMännlich() {
		return Männlich;
	}

	

	public static int getDivers() {
		return Divers;
	}

	

	public static int getAnzahlMitarbeiter() {
		return AnzahlMitarbeiter;
	}

	
	

	//abstrakte Methoden
	public abstract String Gehaltsabrechnung();	
	
	public abstract void Lohnerhöhung();
	
	//Methoden
	
	public  void addPrämie(double X) throws Exception {
		setPrämie(getPrämie()+X);
	}
	public String GeschlechterAnteil(){
		
      return "Mitarbeiter; "+AnzahlMitarbeiter+"\nWeiblicheranteil;  "+Weiblich+"\nMännlicheranteil; "+Männlich+"\nDiverseranteil; "+Divers;
	}
	
	
	
	//Datei Arbeit
	public void MitarbeiterEinlesen() {
		
	} 
	
    public void MitarbeiterSchreiben() {
		
	}

	 
    
  
	//toString 
    
    @Override
	public String toString() {
		return "Mnr: "+ Mnr +"\nGebJahr: "+ GebJahr + "\nVorname: " + Vorname + "\nNachname: " + Nachname
				+ "\nBerufsbezeichnung: " +Berufsbezeichnung + "\nEintrittsdatum: " + Eintrittsdatum + "\nGeschlecht: "
				+ Geschlecht+"\n";
	}
		
		
	
	
}
