package teste;

// Aqui instanciamos o objeto: Conta3
public class Conta3 {
	public static void main(String[] args) {

		Cliente contaRosalia = new Cliente();
		contaRosalia.nome = "Rosalia Jesus Gonçalves";
		contaRosalia.senha = 12345;
		contaRosalia.cpf = "0";
		contaRosalia.profissão = "QA";

		System.out.println("Aqui é o nome: " + contaRosalia.nome);
		System.out.println("Aqui é a idade: " + contaRosalia.senha);
		System.out.println("Aqui é o CPF: " + contaRosalia.cpf);
		System.out.println("Aqui é sua profissão: " + contaRosalia.profissão);

	}

}
