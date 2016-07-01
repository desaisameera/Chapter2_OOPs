/*
 * Class that represents Door
 * and basic functionalities of door
 */
public class DogDoor {
	private boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	public void Open() {
		this.open = true;
		System.out.println("The dog door opens");
	}
	
	public void Close() {
		this.open = false;
		System.out.println("The dog door closes");
	}
	
	public boolean IsOpen() {
		return open;
	}
}
