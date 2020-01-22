package entity;

public class Impiegato {
	
	private int identifier;
	private int impiegato_counter = 0;
	
	
	public Impiegato() {
		this.identifier = ++impiegato_counter;
	}

}
