package Poker;

public class Poker {
	
	public static int AnzahlKartenwerte=13;
	public static int AnzahlFarben=4;
	public static int Versuche=1000;
	public static int LetzteArrStelle= AnzahlKartenwerte*AnzahlFarben -1;
	public static int AnzahlZufallskarten=5;
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
	


	public static int[] Kartenzug (int[]Karten) {
		int[]ziehen= new int[AnzahlZufallskarten];
		for(int i=0; i<=AnzahlZufallskarten;i++) {
			int ZufallsStelle= (int)(Math.random() * AnzahlKartenwerte*AnzahlFarben -1 -i);
			int Zufallswert= 
		}
	}
	
	public static void main(String[] args) {

		
			int[] Karten= new int[(AnzahlKartenwerte*AnzahlFarben)-1];
			for(int i=0;i<= Karten.length;i++) {
			Karten[i] = i+1;
			
//			int Kartenwert=(AnzahlKartenwerte*AnzahlFarben)%13;
//			int Farben=(AnzahlKartenwerte*AnzahlFarben)/13;
			
			}
			
			
			
			
	}

}
