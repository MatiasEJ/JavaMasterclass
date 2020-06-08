/****
 * JAVA BASES. Cap 26.
 * Constructors +
 * 
 ****/

public class Methods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("2288", "Dell","240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch", "acer", 29, new Resolution(2250,1400));

		
		MotherBoard theMotherBoard = new MotherBoard("bb-2340","Asus", 4, 6, "v2.44");
		
		PC thePc = new PC(theCase, theMonitor, theMotherBoard);
		
		thePc.powerUp();
		
		
		
	}

}
