package br.com.bjbl.frameworks.rmi.server.math;

import javax.inject.Named;

import br.com.bjbl.frameworks.utils.beans.CathetusBean;
import br.com.bjbl.frameworks.utils.beans.HypotenuseBean;
import br.com.bjbl.frameworks.utils.services.interfaces.IMathServices;

@Named
public class MathServices implements IMathServices {

	@Override
	public HypotenuseBean calculaHypotenuse(CathetusBean cathetus) {
		
		double cA = cathetus.getCathetusA();
		double cB = cathetus.getCathetusB();
		double h = Math.sqrt(Math.pow(cA, 2.0) + Math.pow(cB, 2.0));
		
		System.out.println("Valor da hipotenusa calculada: " + h);
		
		return new HypotenuseBean(h);
	}

}
