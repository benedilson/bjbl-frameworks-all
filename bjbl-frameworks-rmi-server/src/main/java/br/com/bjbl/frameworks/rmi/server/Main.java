package br.com.bjbl.frameworks.rmi.server;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.bjbl.frameworks.rmi.server.interfaces.IServerDistribution;

public class Main {

	private static final String RMI_SERVER_CONTEXT = "/ctx-bjbl-frameworks-rmi-server.xml";
	private static AbstractApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext(RMI_SERVER_CONTEXT);

		IServerDistribution serverDistribution = context.getBean(IServerDistribution.class);

		serverDistribution.start();

	}

}
