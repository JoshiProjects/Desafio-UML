package SmartPhone;

public class Iphone {
	
	public static void main(String[] args) {
		FuncoesIphone funcoes = new FuncoesIphone();
		
		// navegador
		
		funcoes.ExibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");
		funcoes.AdicionarAba();
		funcoes.AtualizarAba();
		
		System.out.println("\n");
		
		//ipod
		
		funcoes.SelecionarMusica("Pôr do Sol-Lavd667");
		funcoes.Pausar();
		funcoes.Tocar();
		
		System.out.println("\n");
		
		//telefone
		
		funcoes.Ligar("(55) 99764-7482");
		funcoes.IniciarCorreioVoz();
		funcoes.Atender();
	}

}
	

