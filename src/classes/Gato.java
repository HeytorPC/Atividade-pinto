package classes;

public class Gato extends Animais {

	public Gato() {
		setAnimal ("Gato");
		setSexo ('M');
		setSom ("Miau");
	}
	 @Override
	    public void emitirSom() {
	        System.out.println("E o " + getAnimal() + " " + getSom());
	    }
}
