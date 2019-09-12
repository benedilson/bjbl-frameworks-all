package br.com.bjbl.frameworks.utils.beans;

import br.com.bjbl.frameworks.utils.BaseBeans;

public class HypotenuseBean extends BaseBeans {

	private static final long serialVersionUID = 5555788743379041881L;
	
	private final double hypotenuse;
	
	public HypotenuseBean(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public double getHypotenuse() {
		return hypotenuse;
	}

}
