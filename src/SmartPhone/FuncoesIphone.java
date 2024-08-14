package SmartPhone;

import NavegadorInternet.Safari;
import ReprodutorMusical.Ipod;
import SistemaTelefonico.Telefone;

public class FuncoesIphone implements Safari, Ipod, Telefone{
	
	@Override
	public void ExibirPagina(String url) {
		System.out.println("Exibindo a página: "+url);
		
	}
	@Override
	public void AdicionarAba() {
		System.out.println("Adicionando uma nova Aba...");
	}

	@Override
	public void AtualizarAba() {
		System.out.println("Atualizando a Aba...");
	}
	// iPod
	
	@Override
	public void Tocar() {
		System.out.println("Tocando...");
	}

	@Override
	public void Pausar() {
		System.out.println("A música foi pausada");
	}

	@Override
	public void SelecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
		
	}

	// Telefone
	
	@Override
	public void Ligar(String numero) {
		System.out.println("Ligando Para: " + numero);
	}

	@Override
	public void Atender() {
		System.out.println("Atendendo...");
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Corrêio de voz iniciado");
	}

}
