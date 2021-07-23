package models.direcao;

public class Oeste extends Direcao {

	public Oeste(Integer roboX, Integer roboY) {
		super(roboX, roboY);
	}

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar) {
		if (girar) {
			this.movimentos += posicaoX < canteiroX ? "DD" : "";

			if(posicaoX < canteiroX) {
				this.roboDirecao = "L";
			}
		} else {
			while(posicaoX != canteiroX) {
				this.movimentos += "M";
				posicaoX--;
			}
			this.roboX = posicaoX;
		}
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY) {
		this.movimentos += posicaoY < canteiroY ? "D" : "E";
		this.roboDirecao = posicaoY < canteiroY ? "N" : "S";
	}
}
