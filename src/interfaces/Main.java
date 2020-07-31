package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITelephone timsPhone;
		timsPhone = new Deskphone(12345);
		timsPhone.powerOn();
		timsPhone.callPhone(12345);
		timsPhone.answer();
	}

}
