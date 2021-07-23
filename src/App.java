import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.entidades.Canteiro;
import model.entidades.Movimentacao;
import model.entidades.Robo;

public class App {
    public static void main(String[] args) throws Exception {
			String direcoes[] = {"N", "S", "L", "O"};
			Scanner input = new Scanner(System.in);

			System.out.println("Informe a largura da Horta: ");
			String larguraHorta = input.nextLine();

			System.out.println("Informe a altura da Horta: ");
			String alturaHorta = input.nextLine();

			System.out.println("Informe a direção do Robô (N, S, L, O): ");
			String direcao = input.nextLine();

			while (!Arrays.asList(direcoes).contains(direcao)) {
				System.out.println("Valor inválido! Informe uma direção válida: N, S, L, O.");
				direcao = input.nextLine();
			}

			System.out.println("Informe a posição X inicial do Robô: ");
			String roboX = input.nextLine();

			System.out.println("Informe a posição Y inicial do Robô: ");
			String roboY = input.nextLine();

			System.out.println("Os canteiros a serem Irrigados - (pressione S para sair): ");
			System.out.println("Formato de entrada: Posição X, Posição Y (Exemplo: 3,2) ");
			String canteiro = input.nextLine();

			String[] canteiroInput = canteiro.split(",");
			List<Canteiro> canteiros = new ArrayList<Canteiro>();

			while(!canteiro.equals("S")) {
				canteiros.add(new Canteiro(Integer.parseInt(canteiroInput[0]), Integer.parseInt(canteiroInput[1])));
				canteiro = input.nextLine();
			}

			Robo robo = new Robo(Integer.parseInt(roboX), Integer.parseInt(roboY), direcao);

			for (Canteiro c : canteiros) {
				Movimentacao movimentacao = new Movimentacao();
				movimentacao.movimentar(robo, c);
			}
    }
}
