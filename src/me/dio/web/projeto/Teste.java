package me.dio.web.projeto;

import me.dio.web.projeto.facade.Facade;
import me.dio.web.projeto.singleton.SingletonEager;
import me.dio.web.projeto.singleton.SingletonLazy;
import me.dio.web.projeto.singleton.SingletonLazyHolder;
import me.dio.web.projeto.strategy.Comportamento;
import me.dio.web.projeto.strategy.ComportamentoAgressivo;
import me.dio.web.projeto.strategy.ComportamentoDefensivo;
import me.dio.web.projeto.strategy.ComportamentoNormal;
import me.dio.web.projeto.strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

//		 Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarCliente("Sem Nome", "9863875");
	}
}
