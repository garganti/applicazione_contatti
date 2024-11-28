package factory;

abstract class Pizza {
    
    abstract void prepara();
}

class Margherita extends Pizza {
    void prepara() {
	System.out.println("prepara margherita");
    }
}

class Norma extends Pizza {
    void prepara() {
	System.out.println("prepara norma");
    }
}

public class PizzaNoFactory {

    public void ordina(char c) {
	Pizza p = switch (c) {
	case 'M' -> new Margherita();
	case 'N' -> new Norma();
	default -> throw new IllegalArgumentException("Unexpected value: " + c);
	};
	p.prepara();
    }

    public static void main(String[] args) {
	PizzaNoFactory pizzaStore = new PizzaNoFactory();

	pizzaStore.ordina('N');

    }

}
