package control;


import java.util.ArrayList;
import java.util.Scanner;

import model.Jogador;
import model.Time;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Cadastro de Time");
		System.out.print("Digite a sigla: ");
		String sigla = leia.next();
		System.out.print("Digite a Descrição: ");
		String descricao = leia.next();
		
		Time time = new Time(sigla, descricao);
		
		System.out.println("CADASTRO DE JOGADOR");
		char resposta = 'S';
		int numero;
		String nome, posicao;
		
		do {
			System.out.print("Digite o numero: ");
			numero = leia.nextInt();
			System.out.print("Digite o nome: ");
			nome = leia.next();
			System.out.print("Digite posição: ");
			posicao = leia.next();
			
			Jogador jog = new Jogador(numero, nome, posicao);
			time.adJogador(jog);
			
			System.out.print("Deseja conmtinuar? <S/N> ");
			resposta = leia.next().toUpperCase().charAt(0);
			
			
		}while(resposta == 'S');
		
		System.out.println("DADOS DO TIME");
		
		System.out.println("Sigla: " + time.getSigla());
		System.out.println("Descrição: " + time.getDescricao());
		
		ArrayList<Jogador> lista = time.getListaJog();
		
		System.out.println("Lista de Jogadores");
		
		for(Jogador jogTemp : lista) {
			System.out.println(jogTemp.getNumero() + ". " + jogTemp.getNome() + " - " + jogTemp.getPosicao());
		}
	}
	
	

}
