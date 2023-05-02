package teste;

// Aqui instanciamos o objeto: Conta2
public class Conta2 {

	public static void main(String[] args) {

		Cliente clienteCristina = new Cliente();
		clienteCristina.nome = "Deivini Cristina";
		clienteCristina.senha = 1234;
		clienteCristina.idade = 48;
		clienteCristina.cpf = "0";
		clienteCristina.profissão = "Vendedora";
		
		System.out.println("O nome é " + clienteCristina.nome);
		System.out.println("A senha é " + clienteCristina.senha);
		System.out.println("Aqui é o CPF: " + clienteCristina.cpf);
		System.out.println("Aqui é sua profissão: " + clienteCristina.profissão);

	}

}
