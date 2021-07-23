package model.direcao;

public abstract class Movimento implements Direcao {
	protected String movimentos = "";
	protected String roboDirecao;

	public String getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(String movimento) {
		this.movimentos = movimento;
	}

	public String getRoboDirecao() {
		return roboDirecao;
	}

	public void setRoboDirecao(String roboDirecao) {
		this.roboDirecao = roboDirecao;
	}

}
