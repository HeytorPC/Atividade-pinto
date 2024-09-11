package classes;

public class Cachorro extends Animais {
	
	public Cachorro() {
		setAnimal("Cachorro");
		setSexo('M');
		setSom("Auau");
		  
	}
	 @Override
	    public void emitirSom() {
	        System.out.println("E o " + getAnimal() + " " + getSom());
	    }
}
