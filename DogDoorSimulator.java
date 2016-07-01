
public class DogDoorSimulator {
	public static void main(String[]args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside");
		remote.PressButton();
		System.out.println("Fido has gone outside");
		remote.PressButton();
		System.out.println("Fido is all done");
		remote.PressButton();
		System.out.println("fido is back inside");
		remote.PressButton();
	}
}
