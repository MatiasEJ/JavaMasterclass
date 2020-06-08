
public class MotherBoard {
	private String model;
	private String manufacter;
	private int ramSlot;
	private int cardSlot;
	private String bios;
	public MotherBoard(String model, String manufacter, int ramSlot, int cardSlot, String bios) {
		super();
		this.model = model;
		this.manufacter = manufacter;
		this.ramSlot = ramSlot;
		this.cardSlot = cardSlot;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("program: "+programName+" is now loading...");
	}
	
	
	public String getModel() {
		return model;
	}
	public String getManufacter() {
		return manufacter;
	}
	public int getRamSlot() {
		return ramSlot;
	}
	public int getCardSlot() {
		return cardSlot;
	}
	public String getBios() {
		return bios;
	}
	
	
	
	

}
