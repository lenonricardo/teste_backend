package model.direcao;

public class Sul extends Movimento {

	public void movimentarX(Integer posicaoX, Integer canteiroX, Boolean girar) {
		this.movimentos += posicaoX < canteiroX ? "E" : "D";
		this.roboDirecao = posicaoX < canteiroX ? "L" : "O";
	}

	public void movimentarY(Integer posicaoY, Integer canteiroY) {
		while(posicaoY != canteiroY) {
			this.movimentos += "M";
			posicaoY--;
		}
		this.movimentos += "I";
	}
}
