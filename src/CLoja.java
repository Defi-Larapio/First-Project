public class CLoja {
	public static void menuLoja() {
		main.limparTela();
		System.out.println("--              Moodle Play Store                 --\n");
		System.out.println("----------------------------------------------------\n");
		System.out.println("Abaixo está nossos principais destaques dessa semana\n");
		System.out.println("Você pode escolher qual jogo abaixar pelo código ao \n");
		System.out.println("lado do nome :\n\n");
		System.out.println("(1) Batman Arkham Knight \n");
		System.out.println("(2) Xadrez Pro\n\n");
		System.out.println("Abaixo segue outras opções:\n");
		System.out.println("(3) voltar ao menu do usuario\n");
		}
		public static void appBatman() {
			main.limparTela();
			System.out.println("       "
	                 + "▄\r\n" + 
	            " ▄█▄ █▀█▀█ ▄█▄\r\n" + 
	            "▀▀████▄█▄████▀▀\r\n" + 
	            "     ▀█▀█▀\r\n"
	          + "Batman Arkham Knight\n" );
			System.out.println("Descrição: Jogo massa\n");
			System.out.println("Tamanho: 50 MB\n");
			System.out.println("Sistema Operacional: no minimo Android versão 5.2\n");
			System.out.println("Preço : It's free!\n");
			System.out.println("(1) para instalar aplicativo\n");
			System.out.println("(2) voltar para o menu da loja\n");
		}
		public static void appXadrez() {
			main.limparTela();
			System.out.println("♜♞♝♚♛♝♞♜\r\n" +
							   "♟♟♟♟♟♟♟♟\r\n" +
							   "▓░▓░▓░▓░▓░▓░\r\n" + 
							   "░▓░▓░▓░▓░▓░▓\r\n" +
							   "▓░▓░▓░▓░▓░▓░\r\n" +
							   "░▓░▓░▓░▓░▓░▓\r\n" +
							   "♙♙♙♙♙♙♙♙\r\n" +
							   "♖♘♗♔♕♗♘♖\r\n" + 
							    "Xadrez Pro");
			System.out.println("Descrição: Jogo pra inteligente\n");
			System.out.println("Tamanho: 44,5 MB\n");
			System.out.println("Sistema Operacional: no minimo Android versão 4.5\n");
			System.out.println("Preço : It's free!");
			System.out.println("(1) para instalar aplicativo\n");
			System.out.println("(2) voltar para o menu da loja\n");
		}
}
