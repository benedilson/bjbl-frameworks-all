package br.com.bjbl.frameworks.rmi.server;

import javax.inject.Named;

import br.com.bjbl.frameworks.rmi.server.interfaces.IServerDistribution;

@Named
public class ServerDistribution implements IServerDistribution {
	
	@Override
	public void start() {
		System.out.println("Servidor iniciado!");
	}
	
}
