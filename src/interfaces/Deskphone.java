package interfaces;

public class Deskphone implements ITelephone {
	private int myNumber;
	private boolean isRinging;

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("No action");
	}

	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Ringing" + phoneNumber);
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if (isRinging) {
			System.out.println("answering");
			isRinging = false;
		}

	}

	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("ring ring");
		} else {
			isRinging = false;
		}

		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}

	public Deskphone(int myNumber) {
		this.myNumber = myNumber;
	}

}
