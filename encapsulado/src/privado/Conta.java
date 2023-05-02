package privado;
// temos nossa primeira classe Conta, que possui 4 atributos: saldo,agencia,numero e titular.

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

// primeiro metodo criado: deposita, (void) não tem retorno
	void deposita(double valor) {

		this.saldo += valor;

	}

// segundo metodo criado: saca, (boolean) tem retorno

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

// terceiro metodo criado: transfere,

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// metodo get não é da sintaxe Java, mas usamos para buscar um atributo privado
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// metodo set que altera aquela informação privada
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}

}
