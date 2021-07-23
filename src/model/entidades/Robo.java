package model.entidades;

public class Robo extends Base {
	private String direcao;

	public Robo(Integer posicaoX, Integer posicaoY, String direcao) {
		this.setPosicaoX(posicaoX);
		this.setPosicaoY(posicaoY);

		this.direcao = direcao;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
}
