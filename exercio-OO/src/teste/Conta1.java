package teste;

public class Conta1 {

	// Aqui instanciamos o Objeto Conta1, instanciado da classe Cliente, com o método MAIN
	public static void main(String[] args) {
		Cliente contaDoMarcos = new Cliente();
		contaDoMarcos.nome = "Marcos Augusto";
		contaDoMarcos.idade = 40;
		contaDoMarcos.cpf = 313;
		contaDoMarcos.profissão = "Programador";
		
		// Aqui temos o uso da concatenação e os resultados retornados.
		System.out.println("Aqui é o nome: " + contaDoMarcos.nome);
		System.out.println("Aqui é a idade: " + contaDoMarcos.idade);
		System.out.println("Aqui é o CPF: " + contaDoMarcos.cpf);
		System.out.println("Aqui é sua profissão: " + contaDoMarcos.profissão);
	}
}
