package Principal;

import classes.Animais;
import classes.Cachorro;
import classes.Galinha;
import classes.Galo;
import classes.Gato;
import classes.Pintinho;
import java.util.ArrayList;

public class principal {
	    public static void main(String[] args) {
	        
	        ArrayList<Animais> animais = new ArrayList<>();

	        animais.add(new Pintinho());
	        animais.add(new Galo());
	        animais.add(new Galinha());
	        animais.add(new Cachorro());
	        animais.add(new Gato());

	        for (int i = 0; i < animais.size(); i++) {
	            System.out.println("Lá em casa tinha um " + animais.get(i).getAnimal());
	            System.out.println("Lá em casa tinha um " + animais.get(i).getAnimal());

	            for (int j = i; j >= 0; j--) {
	                animais.get(j).emitirSom();
	            }

	            System.out.println();  
	        }
	    }
	}
//											Pitinho me bateu fácil