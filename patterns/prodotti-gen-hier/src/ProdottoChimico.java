import java.util.List;

abstract class ProdottoChimico{}

class ComponenteBase extends ProdottoChimico{ }

class Acqua extends ComponenteBase{}

class Solvente extends ComponenteBase{}

class Composto extends ProdottoChimico{
	List<ProdottoChimico> componenti;
}