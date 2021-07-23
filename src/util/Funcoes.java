package util;

import java.util.ArrayList;
import java.util.List;

public class Funcoes {

	public static List<Integer> splitStringToInteger(String string) {
		try {
			List<Integer> integers = new ArrayList<Integer>();
			String[] stringSplitted = string.split(",");

			for(String s : stringSplitted) {
				integers.add(Integer.parseInt(s));
			}
			return integers;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("O valor informado não segue o formato: Inteiro, Inteiro");
		}
		return null;
	}

	public static Boolean validarInput(String input) {
		String[] stringSplitted = input.split(",");
		Boolean valido = true;

		for(String s : stringSplitted) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException ex) {
				valido = false;
				break;
			}
		}
		return valido;
	}

	public static Boolean validarPosicaoRobo(String posicaoRobo, List<Integer> tamanhoHorta) {
		List<Integer> robo = new ArrayList<Integer>();
		robo = splitStringToInteger(posicaoRobo);

		if (!validarInput(posicaoRobo)) {
			System.out.println("Valor inválido! Informe no formato: PosicaoX, PosicaoY.");
			return false;
		}

		if (robo.get(0) > tamanhoHorta.get(0)) {
			System.out.println("A posiçãoX do robo deve ser menor que a largura da horta.");
			return false;
		}

		if (robo.get(1) > tamanhoHorta.get(1)) {
			System.out.println("A posiçãoY do robo deve ser menor que a altura da horta.");
			return false;
		}

		return true;
	}

}
