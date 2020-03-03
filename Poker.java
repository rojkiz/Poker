package Poker;

public class Poker {
	
	private static final int[] Karten = null;	//create constant
	public static int anzahlKartenwerte=13;
	public static int anzahlFarben=4;
	public static int versuche=10;
	public static int letzteArrStelle= anzahlKartenwerte*anzahlFarben;
	public static int anzahlZufallskarten=5;
	public static int highCard=0;
	public static int onePair=0;
	public static int twoPair=0;
	public static int threeOfAKind=0;
	public static int straight=0;
	public static int flush=0;
	public static int fullHouse=0;
	public static int fourOfAKind=0;
	public static int straightFlush=0;
	public static int royalFlush=0;
	public static int kartenwert;
	public static int farben;
	


	public static int[] Kartenzug () {
		int[]ziehen= new int[anzahlZufallskarten];
		for(int i=0; i<=anzahlZufallskarten;i++) {
			int zufallsStelle= (int)(Math.random() * anzahlKartenwerte*anzahlFarben -i);
			ziehen[i]=Karten[zufallsStelle];
			int x=Karten[zufallsStelle];
			Karten[zufallsStelle]=Karten[Karten.length-1];
		}
		return ziehen;
	}
	
	public static int Kartenwert(int Karten) {
		
		int Kartenwert=(anzahlKartenwerte*anzahlFarben)%13;
		return Kartenwert;
	}
	
	public static int Farben(int Karten) {
		int Farben=(anzahlKartenwerte*anzahlFarben)/13;
		return Farben;
	}
	
	
	
	public static boolean pair(int sameNumbers) {
		int paar=0;
		for (int i = 0; i < Karten.length - 1; i++)		
		{
			for (int j = i + 1; j < Karten.length; j++)
			{
				if(Kartenwert(Karten[i]) == Kartenwert(Karten[j]))
				{
					paar++;
				}
			}
		}
		if (paar == sameNumbers) {
			return true;
		}
		return false;
		
	}

	
	public static boolean straight() {
		for(int i = 1; i < Karten.length; i++)
		{
			if(Kartenwert(Karten[i - 1]) != ((Kartenwert(Karten[i])) - 1))
			{
				return false;
			}
		} return true;
	}
	
	public static boolean flush() {
		for (int i = 1; i < Karten.length; i++)
		{
			if (Farben(Karten[i - 1]) != Farben(Karten[i]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean royal() {
		if (Kartenwert(Karten[0]) == 0 && Kartenwert(Karten[1]) == 9 && Kartenwert(Karten[2]) == 10 &&
				Kartenwert(Karten[3]) == 11 && Kartenwert(Karten[4]) == 12)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	
	
	public static void Ausgabe() {
		if (royal() && flush()) {royalFlush++;}
		if (straight() && flush()) {straightFlush++;} 
		if (pair(6)) {fourOfAKind++;}
		if (pair(4)) {fullHouse++;} 
		if (flush()){flush++;} 
		 if (straight() || royal()){straight++;} 
		 if (pair(3)){threeOfAKind++;}
		 if (pair(2)) { twoPair++;} 	
		 if (pair(1)) {onePair++;}
		else {highCard++;}
		
		 System.out.println(" "+highCard+ "highCards bei "+versuche+ "Versuchen" );
		 System.out.println(" "+onePair+ " onePair's bei" +versuche+ "Versuchen" );
		 System.out.println(" "+twoPair+" twoPair's bei" +versuche+ "Versuchen" );
		 System.out.println(" "+threeOfAKind+" threeOfAKind's bei "+versuche+" Versuchen" );
		 System.out.println(" "+straight+" straight's bei" +versuche+" Versuchen" );
		 System.out.println(" "+flush+" flush's bei" +versuche+" Versuchen" );
		 System.out.println(" "+fullHouse+ "fullHouse's bei "+versuche+ "Versuchen" );
		 System.out.println(" "+ fourOfAKind+ "fourOfAKind's bei" +versuche+ "Versuchen" );
		 System.out.println(" "+highCard+" highCards bei "+versuche+ "Versuchen" );
		 System.out.println(" "+straightFlush+ "straightFlush's bei "+versuche+" Versuchen" );
		 System.out.println(" "+royalFlush+" royalFlush's bei "+versuche+ "Versuchen" );

}
	
	
	public static void main(String[] args) {

		
			int[] Karten= new int[(anzahlKartenwerte*anzahlFarben)];
			for(int i=0;i<= versuche;i++) {
			Karten[i] = i;
			Kartenzug();
			Ausgabe();
			}
	}

}
