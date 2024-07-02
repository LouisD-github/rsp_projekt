
public class Group {

    private Mitarbeiter[] Liste;
    private String GruppenBezeichnung;
    
    public Group(String _GruppenBezeichnung) throws Exception {
    	 setListe();
    	 setGruppenBezeichnung(_GruppenBezeichnung);
    }

	public Mitarbeiter[] getListe() {
		return Liste;
	}

	public void setListe() {
		Mitarbeiter[] X = new Mitarbeiter[5];
		Liste = X;
	}

	public String getGruppenBezeichnung() {
		return GruppenBezeichnung;
	}

	public void setGruppenBezeichnung(String gruppenBezeichnung) throws Exception {
		
		if(gruppenBezeichnung==null) {
			throw new Exception("Gruppen Name kann nicht unbennant sein");
			
		}else {
			GruppenBezeichnung = gruppenBezeichnung;
		}
		
		
	}

    
    
}
