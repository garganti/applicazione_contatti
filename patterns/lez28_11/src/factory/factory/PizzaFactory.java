package factory.factory;



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

public class PizzaFactory {

    
    Pizza createPizza(char c){
	return switch (c) {
	case 'M' -> new Margherita();
	case 'N' -> new Norma();
	default -> throw new IllegalArgumentException("Unexpected value: " + c);
	};
    }

    
    public void ordina(char c) {
	Pizza p =  createPizza(c);
	p.prepara();
    }

    public static void main(String[] args) {
	PizzaFactory pizzaStore = new PizzaFactory();

	pizzaStore.ordina('N');

    }

}
