package models.entidades;

import java.util.List;

import models.direcao.Leste;
import models.direcao.Direcao;
import models.direcao.Norte;
import models.direcao.Oeste;
import models.direcao.Sul;

public class Movimentacao {
	private String movimentos = "";
	private String direcao;
	private Integer roboX;
	private Integer roboY;

	public void movimentar(Robo robo, List<Canteiro> canteiros) {
		this.roboX = robo.getPosicaoX();
		this.roboY = robo.getPosicaoY();
		this.direcao = robo.getDirecao();

		for(Canteiro canteiro : canteiros) {
			movimentarX(this.roboX, canteiro.getPosicaoX(), true, definirDirecao(this.direcao));
			movimentarX(this.roboX, canteiro.getPosicaoX(), false, definirDirecao(this.direcao));
			movimentarY(this.roboY, canteiro.getPosicaoY(), definirDirecao(this.direcao));
			movimentarY(this.roboY, canteiro.getPosicaoY(), definirDirecao(this.direcao));
		}

		System.out.println("Caminho: " + this.movimentos);
		System.out.println("Orientação final: " + this.direcao);
	}

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar, Direcao movimento) {
		movimento.movimentarX(posicaoX, canteiroX, girar);
		this.movimentos += movimento.getMovimentos();

		if (movimento.getRoboDirecao() != null) {
			this.direcao = movimento.getRoboDirecao();
		}

		this.roboX = movimento.getRoboX();
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY, Direcao movimento) {
		movimento.movimentarY(posicaoY, canteiroY);
		this.movimentos += movimento.getMovimentos();

		if (movimento.getRoboDirecao() != null) {
			this.direcao = movimento.getRoboDirecao();
		}
		this.roboY = movimento.getRoboY();
	}

	public Direcao definirDirecao(String direcao) {
		switch (direcao) {
			case "N": return new Norte(this.roboX, this.roboY);
			case "S": return new Sul(this.roboX, this.roboY);
			case "L": return new Leste(this.roboX, this.roboY);
			default: return new Oeste(this.roboX, this.roboY);
		}
	}

}
