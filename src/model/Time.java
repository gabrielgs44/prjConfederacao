package model;

import java.util.ArrayList;

public class Time {
	private String sigla, descricao;
	
	private ArrayList<Jogador> listaJog;
	
	public Time(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
		listaJog = new ArrayList<Jogador>();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void adJogador(Jogador novoJogador) {
		if(listaJog.contains(novoJogador))
			return;
		else {
			listaJog.add(novoJogador);
			novoJogador.setTime(this);
		}
			
	}
	
	public void removeJogador(Jogador exJogador) {
		if(!listaJog.contains(exJogador))
			return;
		else {
			listaJog.remove(exJogador);
			exJogador.setTime(null);
		}
	}
	
	public ArrayList<Jogador> getListaJog(){
		return listaJog;
	}
}
