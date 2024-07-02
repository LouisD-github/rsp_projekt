import java.util.Scanner;

public class Main_Buchhaltung {

	public static void main(String[] args) {
		
		try {
			
		    Group X = new Group("Marketing");
		    Group X1 = new Group("Managment");
		    Group X3 = new Group("Verkauf");
			boolean schleife = true;
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.println("Wähle einen der Menüpunkt:\n1) Mitarbeiter hinzufügen\n2) Mitarbeiter entfernen\n"
						+ "3) Mitarbeitedetails anzeigen\n4) Gehaltsabrechnung\n5) Prämie hinzufügen\n6) Programm beenden");
				int i = scanner.nextInt();
				switch(i) {
				case 1 : System.out.println("Welche Gruppe wollen sie bearbeiten: Marketing,Managment,Verkauf");
				         
				
			    break;
				case 2 : ; break;
				case 3 : break;
				case 4 : break;
				case 5 : break;
				case 6 : schleife = false; break;
				default : System.out.println("Falsche Eingabe."); break;
				} 
			} while(schleife);
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

