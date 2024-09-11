package classes;

public class Pintinho extends Animais {

	public Pintinho() {
		
		setAnimal("Pintinho");
		setSexo('M');
		setSom("Piu");
		setRepeticoes(6);
		
		}
	@Override
    public void emitirSom() {
        int repetic = Math.max(getRepeticoes(), 4);

        for (int i = 0; i < repetic; i++) {
            System.out.println("E o " + getAnimal() + " " + getSom());
        }

        if (getRepeticoes() > 4) {
            setRepeticoes(getRepeticoes() - 1);
        }
	}
}
