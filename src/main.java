import java.util.Scanner;
public class main {
	static int resposta,respostaUser,respostaLoja,respostaDevoloper,respostaApp,respostaDefault;
	public static void main(String[] args) {
		// os menus eu fiz lá embaixo
		do {
		menuPrincipal();
		Scanner input = new Scanner(System.in);
		resposta = input.nextInt();
		switch(resposta){
			case 1 : //(1) criar conta usuário 
				CUsuario.cadastroUsuario();
				respostaDefault = input.nextInt();
				break;
			case 2 : //(2)criar conta desenvolvedor
				CDesenvolvedor.cadastroDesenvolvedor();
				respostaDefault = input.nextInt();
				break;
			case 3 : //(3) login com conta usuário
				CUsuario.loginUsuario();
				do {
				CUsuario.menuUsuario();
				respostaUser = input.nextInt();
				switch(respostaUser) {
					case 1 :
						do {
						CLoja.menuLoja();
						respostaLoja = input.nextInt();
						switch(respostaLoja) {
							case 1:
								CLoja.appBatman();
								respostaLoja = input.nextInt();
								break;
							case 2:
								CLoja.appXadrez();
								respostaLoja = input.nextInt();
								break;
							case 3 :
								break;
						}
						}while(respostaLoja != 3);
						break;
					case 3:
						break;
				}
				}while(respostaUser != 3);
				break;
			case 4 : //(4) login com conta desenvolvedor
				CDesenvolvedor.loginDesenvolvedor();
				do {
				CDesenvolvedor.menuDesenvolvedor();
				respostaDevoloper = input.nextInt();
				switch(respostaDevoloper) {
					case 1 : 
						CAplicativo.cadastrarAplicativo();
						respostaDefault = input.nextInt();
						break;
					case 2 :
						CAplicativo.mostrarAplicativo();
						respostaDefault = input.nextInt();
						break;
					case 3 :
						break;
				}
				}while(respostaDevoloper != 3);
				break;
			case 5 : //(5) sair do Moodle Play Store 
				break;
		}
		}while(resposta != 5);

	}
	public static void menuPrincipal() {	
		limparTela();
		System.out.println("-- Olá seja bem-vindo ao Moodle Play Store --\n");
		System.out.println("-- Escolha uma das opções abaixo :         --\n");
		System.out.println("---------------------------------------------\n");
		System.out.println("-- (1) criar conta usuário                 --\n");
		System.out.println("-- (2) criar conta desenvolvedor           --\n");
		System.out.println("-- (3) login com conta usuário             --\n");
		System.out.println("-- (4) login com conta desenvolvedor       --\n");
		System.out.println("-- (5) sair do Moodle Play Store           --\n");
	}
	
	public static void limparTela() {
		for (int i = 0; i < 100; ++i)  
		System.out.println();
	}
}
