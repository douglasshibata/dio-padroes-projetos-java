package me.dio.web.projeto;

import me.dio.web.projeto.singleton.SingletonEager;
import me.dio.web.projeto.singleton.SingletonLazy;
import me.dio.web.projeto.singleton.SingletonLazyHolder;

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
	}
}
