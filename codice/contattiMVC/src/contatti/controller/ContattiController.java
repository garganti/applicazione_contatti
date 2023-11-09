package contatti.controller;

import java.util.List;
import java.util.stream.Collectors;

import contatti.model.Contatti;
import contatti.view.ContattiView;

public class ContattiController {
	private Contatti model;
	private ContattiView view;

	public ContattiController(Contatti model, ContattiView view) {
		this.model = model;
		this.view = view;
	}
	// quando cambia il modello il controller dovrà avvisare la view
	public void updateView() {
		List<String> contattiStringhe = model.stream().map(Object::toString)
                .collect(Collectors.toList());
		view.printContatti(contattiStringhe);
	}
}

