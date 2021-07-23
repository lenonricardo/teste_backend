package model.direcao;

public class Leste extends Movimento {

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar) {
		if (girar) {
			this.movimentos += posicaoX > canteiroX ? "DD" : "";
			this.roboDirecao = posicaoX > canteiroX ? "O" : "";
		} else {
			while (posicaoX != canteiroX) {
				this.movimentos += "M";
				posicaoX++;
			}
		}
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY) {
		this.movimentos += posicaoY < canteiroY ? "E" : "D";
		this.roboDirecao = posicaoY < canteiroY ? "N" : "S";
	}

}
