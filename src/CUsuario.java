import java.util.Scanner;

public class CUsuario {
	
	private static String nome;
	private String sobrenome;
	private String dataNascimento;
	private static String email;
	private static String senha;
	private String telefone;
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
	public static void cadastroUsuario() {
		String aux;
		Scanner input = new Scanner(System.in);
		CUsuario user1 = new CUsuario();
		System.out.println("Digite o seu nome : \n");
		aux = input.nextLine();
		user1.setNome(aux);
		System.out.println("Digite o seu sobrenome : \n");
		aux = input.nextLine();
		user1.setSobrenome(aux);
		System.out.println("Digite a sua data de nascimento : \n");
		aux = input.nextLine();
		user1.setDataNascimento(aux);
		System.out.println("Digite algum e-mail para sua conta : \n");
		aux = input.nextLine();
		user1.setEmail(aux);
		System.out.println("Digite alguma senha para sua conta");
		aux = input.nextLine();
		user1.setSenha(aux);
		System.out.println("Digite o seu telefone : \n");
		aux = input.nextLine();
		user1.setTelefone(aux);
	    System.out.println("\n");
	    main.limparTela();
	    System.out.println("Usuário cadastrado com sucesso!\n\n");
	    System.out.println("\n\nDigite qualquer número e pressione enter para voltar\n");
	}
	public static void loginUsuario() {
		String aux;
		boolean ver;
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Digite o seu e-mail : \n");
		aux = input.next();
		ver = CUsuario.verEmail(aux);
		if(ver == true)
			continue;
		if(ver == false)
			System.out.println("e-mail não cadastrado");
		}while(ver == false);
		do {
		System.out.println("Digite a sua senha : \n");
		aux = input.next();
		ver = CUsuario.verSenha(aux);
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
	public static void menuUsuario() {
		main.limparTela();
		System.out.println("\n\n               Bem-vindo " +CUsuario.getNome()+"         \n");
		System.out.println("-- Escolha uma das opções abaixo :         --\n");
		System.out.println("---------------------------------------------\n");
		System.out.println("-- (1) ver a loja Moodle Play Store        --\n");
		System.out.println("-- (2) meus apps intstalados               --\n");
		System.out.println("-- (3) fazer logoff da conta               --\n");
	}
}