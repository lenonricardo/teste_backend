package models.direcao;

public class Norte extends Direcao {

	public Norte(Integer roboX, Integer roboY) {
		super(roboX, roboY);
	}

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar) {
		this.movimentos += posicaoX < canteiroX ? "D" : "E";
		this.roboDirecao = posicaoX < canteiroX ? "L" : "O";
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY) {
		while(posicaoY != canteiroY) {
			this.movimentos += "M";
			posicaoY++;
		}
		this.roboY = posicaoY;
		this.movimentos += "I";
	}
}
