package br.com.bjbl.frameworks.utils.beans;

import br.com.bjbl.frameworks.utils.BaseBeans;

public class CathetusBean extends BaseBeans {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6271233373928005158L;
	private final double cathetusA;
	private final double cathetusB;
	
	public CathetusBean(double cathetusA, double cathetusB) {
		this.cathetusA = cathetusA;
		this.cathetusB = cathetusB;
	}

	public double getCathetusA() {
		return cathetusA;
	}

	public double getCathetusB() {
		return cathetusB;
	}
	

}
