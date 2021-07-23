package models.direcao;

public class Leste extends Direcao {

	public Leste(Integer roboX, Integer roboY) {
		super(roboX, roboY);
	}

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar) {
		if (girar) {
			this.movimentos += posicaoX > canteiroX ? "DD" : "";

			if(posicaoX > canteiroX) {
				this.roboDirecao = "O";
			}
		} else {
			while (posicaoX != canteiroX) {
				this.movimentos += "M";
				posicaoX++;
			}
			this.roboX = posicaoX;
		}
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY) {
		this.movimentos += posicaoY < canteiroY ? "E" : "D";
		this.roboDirecao = posicaoY < canteiroY ? "N" : "S";
	}

}
