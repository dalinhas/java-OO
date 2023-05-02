package privado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente rosalia = new Cliente();
		//conta.titular = rosalia;
		rosalia.setNome("rosalia gonçalves");
		conta.setTitular(rosalia);
		
		System.out.println(conta.getTitular().getNome());
		
	}

}
