package ese5_esame;

public class Persona {
    private float peso;

    public Persona(float p) {
	this.peso = p;
    }

    public boolean isSovrappeso() {
	return peso > 60;
	// corretto in
	//return peso >= 60;
    }
}
