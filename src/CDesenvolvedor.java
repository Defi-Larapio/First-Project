import java.util.Scanner;

public class CDesenvolvedor {
	private static String nome;
	private String sobrenome;
	private String dataNascimento;
	private static String email;
	private static String senha;
	private	String telefone;
	private String numeroCartao;
	private String dataCartao;
	private String senhaCartao;
	
	public static void cadastroDesenvolvedor() {
		String aux;
		Scanner input = new Scanner(System.in);
		CDesenvolvedor devoloper1 = new CDesenvolvedor();
		System.out.println("Digite o seu nome : \n");
		aux = input.nextLine();
		devoloper1.setNome(aux);
		System.out.println("Digite o seu sobrenome : \n");
		aux = input.nextLine();
		devoloper1.setSobrenome(aux);
		System.out.println("Digite a data de nascimento : \n");
		aux = input.nextLine();
		devoloper1.setDataNascimento(aux);
		System.out.println("Digite o seu e-mail : \n");
		aux = input.nextLine();
		devoloper1.setEmail(aux);
		System.out.println("Digite alguma senha para a conta\n");
		aux = input.nextLine();
		devoloper1.setSenha(aux);
		System.out.println("Digite o seu telefone : \n");
		aux = input.nextLine();
		devoloper1.setTelefone(aux);
		main.limparTela();
		System.out.println("Para finalizar a conta de desenvolvedor é preciso pagar uma pequena \n"
				+ "taxa de R$100,00 :) ");
		System.out.println("\n\nDigite o numero do seu cartão : \n");
		aux = input.nextLine();
		devoloper1.setNumeroCartao(aux);
		System.out.println("Digite a data de vencimento do cartão : \n");
		aux = input.nextLine();
		devoloper1.setDataCartao(aux);
		System.out.println("Digite a senha do cartão : ");
		aux = input.nextLine();
		devoloper1.setSenhaCartao(aux);
		main.limparTela();
	    System.out.println("Desenvolvedor cadastrado com sucesso!\n\n");
		System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
	}
	public static void loginDesenvolvedor() {
		String aux;
		boolean ver;
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Digite o seu e-mail : \n");
		aux = input.next();
		ver = CDesenvolvedor.verEmail(aux);
		if(ver == true)
			continue;
		if(ver == false)
			System.out.println("e-mail não cadastrado");
		}while(ver == false);
		do{
		System.out.println("Digite a sua senha : \n");
		aux = input.next();
		ver = CDesenvolvedor.verSenha(aux);
		if(ver == true)
			System.out.println("login feito com sucesso!");
		else
			System.out.println("erro ao digitar a senha");
		}while(ver == false);
	}
	public static boolean verEmail(String aux) {
		String verificador = getEmail();
		if(aux.contentEquals(verificador))
			return true;
		else
			return false;
	}
	public static boolean verSenha(String aux) {
		String verificador = getSenha();
		if(aux.contentEquals(verificador))
			return true;
		else
			return false;
	}
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getDataCartao() {
		return dataCartao;
	}
	public void setDataCartao(String dataCartao) {
		this.dataCartao = dataCartao;
	}
	public String getSenhaCartao() {
		return senhaCartao;
	}
	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}
	public static void menuDesenvolvedor() {
		main.limparTela();
		System.out.println("\n\n              Bem-vindo "+CDesenvolvedor.getNome()+"             \n");
		System.out.println("-- Escolha uma das opções abaixo :         --\n");
		System.out.println("---------------------------------------------\n");
		System.out.println("-- (1) adicionar um aplicativo             --\n");
		System.out.println("-- (2) meus apps adicionados               --\n");
		System.out.println("-- (3) fazer logoff da conta               --\n");
	}
}