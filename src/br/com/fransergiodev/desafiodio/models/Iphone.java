package br.com.fransergiodev.desafiodio.models;

import br.com.fransergiodev.desafiodio.interfaces.IPod;
import br.com.fransergiodev.desafiodio.interfaces.Navegador;
import br.com.fransergiodev.desafiodio.interfaces.Telefone;

public class Iphone implements Telefone, IPod, Navegador {

	@Override
	public void abrirnavegador() {
		System.out.println("Abrindo navegador padrão...");
	}

	@Override
	public void pesquisarPagina() {
		System.out.println("Pesquisando página...");
	}

	@Override
	public void adicionarPaginaNova() {
		 System.out.println("Adicionando página nova...");
	}

	@Override
	public void trocarDePagina() {
		System.out.println("Trocando de página...");
	}

	@Override
	public void fecharPaginaAtual() {
		System.out.println("Fechando página atual...");
	}

	@Override
	public void fecharNavegador() {
		System.out.println("Fechando navegador...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");	
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música...");
	}

	@Override
	public void continuarMusica() {
		System.out.println("Continuando música...");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume...");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume...");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void chamadaEmEspera() {
		System.out.println("Chamada em espera...");
	}

	@Override
	public void iniciarConferencia() {
		System.out.println("Iniciando conferência...");
	}

	@Override
	public void escutarCorreioVoz() {
		System.out.println("Ouvindo correio de voz...");
	}

}
