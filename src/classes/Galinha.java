package classes;

public class Galinha extends Animais{
	public Galinha() {
		
	setAnimal("Galinha");
	setSexo('F');
	setSom("Có");
	
	}
	 @Override
	    public void emitirSom() {
	        System.out.println("E a " + getAnimal() + " " + getSom());
	    }
}
