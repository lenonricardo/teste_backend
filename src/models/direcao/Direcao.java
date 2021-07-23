package models.direcao;

import interfaces.DirecaoInterface;

public abstract class Direcao implements DirecaoInterface {
	protected String movimentos = "";
	protected String roboDirecao;
	protected Integer roboX;
	protected Integer roboY;

	public Direcao(Integer roboX, Integer roboY) {
		this.roboX = roboX;
		this.roboY = roboY;
	}

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

	public Integer getRoboX() {
		return roboX;
	}

	public void setRoboX(Integer roboX) {
		this.roboX = roboX;
	}

	public Integer getRoboY() {
		return roboY;
	}

	public void setRoboY(Integer roboY) {
		this.roboY = roboY;
	}
}
