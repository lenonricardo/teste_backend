package model.entidades;

import model.direcao.Leste;
import model.direcao.Movimento;
import model.direcao.Norte;
import model.direcao.Oeste;
import model.direcao.Sul;

public class Movimentacao {
	private String movimentos = "";
	private String direcao;
	private Integer roboX;
	private Integer roboY;

	public void movimentar(Robo robo, Canteiro canteiro) {
		this.roboX = robo.getPosicaoX();
		this.roboY = robo.getPosicaoY();
		this.direcao = robo.getDirecao();

		movimentarX(this.roboX, canteiro.getPosicaoX(), true, definirDirecao(this.direcao));
		movimentarX(this.roboX, canteiro.getPosicaoX(), false, definirDirecao(this.direcao));
		movimentarY(this.roboY, canteiro.getPosicaoY(), definirDirecao(this.direcao));
		movimentarY(this.roboY, canteiro.getPosicaoY(), definirDirecao(this.direcao));

		System.out.println(this.movimentos);
	}

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar, Movimento movimento) {
		movimento.movimentarX(posicaoX, canteiroX, girar);
		this.movimentos += movimento.getMovimentos();

		if (movimento.getRoboDirecao() != null) {
			this.direcao = movimento.getRoboDirecao();
		}
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY, Movimento movimento) {
		movimento.movimentarY(posicaoY, canteiroY);
		this.movimentos += movimento.getMovimentos();

		if (movimento.getRoboDirecao() != null) {
			this.direcao = movimento.getRoboDirecao();
		}
	}

	public Movimento definirDirecao(String direcao) {
		switch (direcao) {
			case "N": return new Norte();
			case "S": return new Sul();
			case "L": return new Leste();
			default: return new Oeste();
		}
	}

}
