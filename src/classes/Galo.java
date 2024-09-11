package classes;

public class Galo extends Animais{
	public Galo() {
		
	setAnimal("Galo");
	setSexo('M');
	setSom("cocoricó");

	}
	 @Override
	    public void emitirSom() {
	        System.out.println("E o " + getAnimal() + " " + getSom());
	    }
}
