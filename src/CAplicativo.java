import java.util.Scanner;

public class CAplicativo {
	private static String nome;
	private static String tamanho;
	private static String descricao;
	private static String icone;
	static String icone1 = 
						   "──▒▒▒▒▒▒───▄████▄\r\n" + 
			        	   "─▒─▄▒─▄▒──███▄█▀\r\n" + 
			        	   "─▒▒▒▒▒▒▒─▐████──█─█\r\n" + 
			        	   "─▒▒▒▒▒▒▒──█████▄\r\n" + 
			        	   "─▒─▒─▒─▒───▀████▀\r\n" + 
			        	   "\n";
			
	
	static String icone2 = 
						   "░▐█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▄☆\r\n" + 
						   "░███████████████████████\r\n" + 
						   "░▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓◤\r\n" + 
						   "╬▀░▐▓▓▓▓▓▓▌▀█░░░█▀░\r\n" + 
						   "▒░░▓▓▓▓▓▓█▄▄▄▄▄█▀╬░\r\n" + 
						   "░░█▓▓▓▓▓▌░▒▒▒▒▒▒▒▒▒\r\n" + 
						   "░▐██████▌╬░▒▒▒▒▒▒▒▒\r\n" + 
						   "\n";
	static String icone3 = 
						  "░░░░░░███████ ]▄▄▄▄▄▄▄▄\r\n" + 
				   		  "▂▄▅█████████▅▄▃▂\r\n" + 
				   		  "I███████████████████].\r\n" + 
				   		  "◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤...\r\n" + 
				   		  "\n";
	static String icone4 =  
						   "──▀▀▀▀▀▀▀▀▀▀▀▄▄▀▀▀▀▀▀▀▀▀▀▀\r\n" + 
					 	   "────────────█▀▀█\r\n" + 
					 	   "───────────█▓▓▓▓█\r\n" + 
					 	   "───────══▄▀█▓▓▓▓█▀▄══\r\n" + 
					 	   "──▄▄▄▄▄▄▄█▒█▓▓▓▓█▒█▄▄▄▄▄▄▄\r\n" + 
					 	   "──█▀▀▀▀█▀███▄▓▓▄███▀█▀▀▀▀█\r\n" + 
					 	   "─▄█▄──▄█▄───▀██▀───▄█▄──▄█▄\r\n" + 
					 	   "─█▒█──█▒█──────────█▒█──█▒█\r\n" + 
					 	   "─▀▀▀──▀▀▀──────────▀▀▀──▀▀▀\r\n" + 
					 	   "\n";
	static String icone5 = 
					       "╔══╗ \r\n" + 
						   "║██║ \r\n" + 
						   "║()║♫ ♪ ♫ ♪\r\n" + 
						   "╚══╝\r\n" + 
						   "▄ █ ▄ █ ▄ ▄ █ ▄ █ ▄ █\r\n" + 
						   "Min- - - - - - - - - - - -●Max\r\n" + 
						   "\n";
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nomeApp) {
		nome = nomeApp;
	}

	public static String getIcone1() {
		return icone1;
	}

	public static String getIcone2() {
		return icone2;
	}
	
	public static String getIcone3() {
		return icone3;
	}

	public static String getIcone4() {
		return icone4;
	}
	
	public static String getIcone5() {
		return icone5;
	}

	public static String getTamanho() {
		return tamanho;
	}

	public static void setTamanho(String tamanhoApp) {
		tamanho = tamanhoApp;
	}

	public static String getDescricao() {
		return descricao;
	}

	public static void setDescricao(String descricaoApp) {
		descricao = descricaoApp;
	}

	public static String getIcone() {
		return icone;
	}

	public static void setIcone(String iconeApp) {
		icone = iconeApp;
	}
	public static void cadastrarAplicativo() {
		main.limparTela();
		String aux;
		int respostaIcone;
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha um dos icones abaixo para o seu aplicativo: \n");
		System.out.println("Digite 1 para essa opção\n"+""+getIcone1()+"Digite 2 para essa opção\n"+""+getIcone2()+"Digite 3 para essa opção\n"
		+""+getIcone3()+"Digite 4 para essa opção\n"+""+getIcone4()+"Digite 5 para essa opção\n"+""+getIcone5());
		respostaIcone = input.nextInt();
		input.nextLine();
		switch(respostaIcone) {
			case 1:
				aux = getIcone1();
				CAplicativo.setIcone(aux);  
				break;
			case 2:
				aux = getIcone2();
				CAplicativo.setIcone(aux);
				break;
			case 3:
				aux = getIcone3();
				CAplicativo.setIcone(aux);
				break;
			case 4:
				aux = getIcone4();
				CAplicativo.setIcone(aux);
				break;
			case 5:
				aux = getIcone5();
				CAplicativo.setIcone(aux);
				break;
		}
		System.out.println("Digite o nome do seu aplicativo: \n");
		aux = input.nextLine();
		CAplicativo.setNome(aux);
		System.out.println("Digite qual vai ser o tamanho do aplicativo: \n");
		aux = input.nextLine();
		CAplicativo.setTamanho(aux);
		System.out.println("Escreva uma breve descrição sobre o aplicativo:\n");
		aux = input.nextLine();
		CAplicativo.setDescricao(aux);
		main.limparTela();
		System.out.println("Aplicativo adicionado com sucesso!\n");
		System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
		
	}
	public static void mostrarAplicativo() {
		main.limparTela();
		System.out.println("--          Meu App                 --\n\n");
		System.out.println(""+CAplicativo.getIcone()+"\n"+"Nome: "+CAplicativo.getNome()+"\n"+"Tamanho: "+CAplicativo.getTamanho()+"\n"+"Descrição: "+CAplicativo.getDescricao());
		System.out.println("\n\nDigite qualquer número e pressione enter para voltar");
	}
}