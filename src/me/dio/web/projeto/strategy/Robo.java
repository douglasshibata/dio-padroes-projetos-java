package me.dio.web.projeto.strategy;

public class Robo {
	private Comportamento comportamento;

	public Comportamento getComportamento() {
		return comportamento;
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}

}
