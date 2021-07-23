import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import models.entidades.Canteiro;
import models.entidades.Movimentacao;
import models.entidades.Robo;

import util.Funcoes;

public class App {
    public static void main(String[] args) throws Exception {
			String direcoes[] = {"N", "S", "L", "O"};
			Scanner input = new Scanner(System.in);
			List<Canteiro> canteiros = new ArrayList<Canteiro>();
			List<Integer> canteiroInput = new ArrayList<Integer>();
			List<Integer> tamanhoHorta = new ArrayList<Integer>();
			List<Integer> posicaoRobo = new ArrayList<Integer>();

			System.out.println("Informe a largura e altura da Horta: (Exemplo: 4,5)");
			String horta = input.nextLine();

			while(!Funcoes.validarInput(horta)) {
				System.out.println("Valor inválido! Informe no formato: Altura, Largura");
				horta = input.nextLine();
			}

			tamanhoHorta = Funcoes.splitStringToInteger(horta);

			System.out.println("Informe a direção do Robô (N, S, L, O): ");
			String direcao = input.nextLine();

			while (!Arrays.asList(direcoes).contains(direcao)) {
				System.out.println("Valor inválido! Informe uma direção válida: N, S, L, O.");
				direcao = input.nextLine();
			}


			System.out.println("Informe a posição X inicial do Robô: (Exemplo: 3,2)");
			String roboInput = input.nextLine();

			while(!Funcoes.validarPosicaoRobo(roboInput, tamanhoHorta)) {
				roboInput = input.nextLine();
			}

			posicaoRobo = Funcoes.splitStringToInteger(roboInput);

			System.out.println("Os canteiros a serem Irrigados - (pressione C para continuar): ");
			System.out.println("Formato de entrada: Posição X, Posição Y (Exemplo: 3,2) ");
			String canteiro = input.nextLine();

			while(!canteiro.equals("C")) {
				if (Funcoes.validarInput(canteiro)) {
					canteiroInput = Funcoes.splitStringToInteger(canteiro);
					canteiros.add(new Canteiro(canteiroInput.get(0), canteiroInput.get(1)));
				} else {
					System.out.println("O valor informado não segue o formato: Inteiro, Inteiro");
				}

				canteiro = input.nextLine();
			}

			input.close();

			Robo robo = new Robo(posicaoRobo.get(0), posicaoRobo.get(1), direcao);

			Movimentacao movimentacao = new Movimentacao();
			movimentacao.movimentar(robo, canteiros);
    }
}
